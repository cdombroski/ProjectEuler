(ns org.icanttype.euler04.core-test
  (:use midje.sweet
        org.icanttype.euler04.core))

(fact "palindromes"
      (palindrome? 41) => falsey
      (palindrome? "ab") => falsey
      (palindrome? 44) => truthy
      (palindrome? "abba") => truthy)

(facts "Palindrome product"
       (fact "Example problem"
             (max-palindrome-product (range 10 100)) => 9009)
       (fact "Problem solution"
             (max-palindrome-product (range 100 1000)) => 906609))
