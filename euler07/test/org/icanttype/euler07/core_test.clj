(ns org.icanttype.euler07.core-test
  (:require [midje.sweet :refer :all]
            [org.icanttype.euler-utils.prime :refer [primes]]))

(facts "Euler 07"
       (fact "Example problem"
             (nth primes 5) => 13))
