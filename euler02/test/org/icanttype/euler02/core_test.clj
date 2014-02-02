(ns org.icanttype.euler02.core-test
  (:use midje.sweet
        org.icanttype.euler02.core))
(facts "euler02"
       (fact "example problem"
             (sum-even-fibonacci-numbers 100) => 44)
       (fact "problem solution"
             (sum-even-fibonacci-numbers 4000000) => 4613732))
