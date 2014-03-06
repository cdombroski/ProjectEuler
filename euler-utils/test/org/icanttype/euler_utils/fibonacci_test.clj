(ns org.icanttype.euler_utils.fibonacci_test
  (:use midje.sweet
        org.icanttype.euler_utils.fibonacci))

(facts "Fibonacci sequence"
       (fact "First 10 terms of fibonacci are 0 1 1 2 3 5 8 13 21 34"
             (take 10 (fibonacci)) => [0 1 1 2 3 5 8 13 21 34])
       (fact "We can skip some terms"
             (take 10 (fibonacci 1 2)) => [1 2 3 5 8 13 21 34 55 89])
       (fact "We can use strange starting points"
             (take 10 (fibonacci -2 1)) => [-2 1 -1 0 -1 -1 -2 -3 -5 -8]))
