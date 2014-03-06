(ns org.icanttype.euler_utils.prime)

(defn sieve
  ([] (sieve (iterate inc' 2) []))
  ([candidates prime-multiples]
   (if (seq prime-multiples)
     (if (< (first candidates) (first (first prime-multiples)))
       (let [prime (first candidates)]
         (cons prime (lazy-seq (sieve (rest candidates) (sort-by first (conj prime-multiples (iterate (partial + prime) (* prime prime))))))))
       (if (= (first candidates) (first (first prime-multiples)))
           (recur (rest candidates) (sort-by first (conj (rest prime-multiples) (rest (first prime-multiples)))))
           (recur candidates (sort-by first (conj (rest prime-multiples) (rest (first prime-multiples)))))))
     (cons 2 (lazy-seq (sieve (rest candidates) [(iterate (partial + 2) 4)]))))))

(defn prime-factor [n]
  (loop [number n
         factors {}
         primes (sieve)]
    (if (<= (first primes) number)
      (if (zero? (mod number (first primes)))
        (recur (/ number (first primes))
               (assoc factors (first primes) (inc (get factors (first primes) 0)))
               primes)
        (recur number
               factors
               (rest primes)))
      factors)))