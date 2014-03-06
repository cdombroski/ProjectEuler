(ns org.icanttype.euler03.core-test
  (:use midje.sweet
        org.icanttype.euler03.core))

(facts "euler03"
       (fact "Example problem"
             (largest-prime-factor 13195) => 29)
       (fact "Problem solution"
             (largest-prime-factor 600851475143) => 6857))
