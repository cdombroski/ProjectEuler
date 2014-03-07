(ns org.icanttype.euler-utils.prime_test
  (:use midje.sweet
        org.icanttype.euler-utils.prime))

(facts "prime sequence"
       (fact "First 5 primes are 2 3 5 7 11"
             (take 5 (sieve)) => [2 3 5 7 11])
       (fact "prime factors"
             (prime-factor 4) => {2 2}
             (prime-factor 15) => {3 1, 5 1}))