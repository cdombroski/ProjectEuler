(ns org.icanttype.euler-utils.prime)

(defn sieve [limit]
  (loop [found-primes []
         candidates (range 2 (inc limit))]
    (if (seq candidates)
      (recur
        (conj found-primes (first candidates))
        (doall (remove #(zero? (mod % (first candidates))) candidates)))
      found-primes)))

(def primes
  (cons 2 (lazy-seq ((fn primes-gen [candidates count]
                       (loop [candidate (first candidates)
                              more (rest candidates)]
                         (if (some zero? (map (partial mod candidate) (take count primes)))
                           (recur (first more) (rest more))
                           (cons candidate (lazy-seq (primes-gen more (inc count)))))))
                     (iterate (partial + 2) 3)
                     1))))

(defn prime-factor [n]
  (loop [number n
         factors {}
         primes primes]
    (if (<= (first primes) number)
      (if (zero? (mod number (first primes)))
        (recur (/ number (first primes))
               (assoc factors (first primes) (inc (get factors (first primes) 0)))
               primes)
        (recur number
               factors
               (rest primes)))
      factors)))