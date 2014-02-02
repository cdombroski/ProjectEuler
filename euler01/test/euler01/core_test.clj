(ns euler01.core-test
  (:use midje.sweet
        euler01.core))

(facts "sum multiples of 3 and 5 below a limit"
       (fact
         (sum-multiples-3-or-5 10) => 23)
       (fact
         (sum-multiples-3-or-5 1000) => 233168))