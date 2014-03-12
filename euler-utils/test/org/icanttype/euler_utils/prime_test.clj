(ns org.icanttype.euler-utils.prime_test
  (:use midje.sweet
        org.icanttype.euler-utils.prime))

(facts "prime sequence"
       (fact "Primes <= 20"
             (sieve 20) => [2 3 5 7 11 13 17 19])
       (fact "First 5 primes"
             (take 5 (primes)) => [2 3 5 7 11])
       (fact "prime factors"
             (prime-factor 4) => {2 2}
             (prime-factor 15) => {3 1, 5 1}))