(ns org.icanttype.euler05.core-test
  (:use midje.sweet
        org.icanttype.euler05.core
        org.icanttype.euler-utils.factor))

(facts "Euler05"
       (fact "Sample problem"
             (apply lcm (range 1 11)) => 2520)
       (fact "Problem solution"
             (apply lcm (range 1 21)) => 232792560))
