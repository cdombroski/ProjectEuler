(ns org.icanttype.euler07.core-test
  (:require [midje.sweet :refer :all]
            [org.icanttype.euler-utils.prime :refer [sieve]]))

(facts "Euler 07"
       (fact "Example problem"
             (nth (sieve) 5) => 13))
