(ns org.icanttype.euler06.core-test
  (:use midje.sweet
        org.icanttype.euler06.core))

(facts "Euler06"
       (fact "Example problem"
             (- (square-of-sum (range 1 11)) (sum-of-square (range 1 11))) => 2640)
       (fact "Problem solution"
             (- (square-of-sum (range 1 101)) (sum-of-square (range 1 101))) => 25164150))

(fact "sum-of-square"
      (sum-of-square (range 1 11)) => 385)

(fact "square-of-sum"
      (square-of-sum (range 1 11)) => 3025)

(fact "Square"
      (square 2) => 4
      (square -2) => 4)
