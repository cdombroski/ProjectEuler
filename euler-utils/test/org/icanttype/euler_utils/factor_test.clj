(ns org.icanttype.euler-utils.factor-test
  (:use midje.sweet
        org.icanttype.euler-utils.factor))

(facts "GCD"
       (fact "gcd(x) == |x|"
             (gcd 1) => 1
             (gcd 0) => 0
             (gcd -1) => 1)
       (fact "gcd(x, 0) == |x|"
             (gcd 1 0) => 1
             (gcd 0 0) => 0
             (gcd -1 0) => 1)
       (fact "gcd(x, y)"
             (gcd 48 180) => 12
             (gcd 24 54) => 6
             (gcd 42 56) => 14
             (gcd 9 28) => 1)
       (fact "gcd(x, y, z) == gcd(gcd(x, y), z)"
             (gcd 48 180 6) => (gcd (gcd 48 180) 6)
             (gcd 48 180 6) => 6))

(facts "LCM"
       (fact "lcm(x) == |x|"
             (lcm 1) => 1
             (lcm 0) => 0
             (lcm -1) => 1)
       (fact "lcm(0, 0) == 0"
             (lcm 0 0) => 0)
       (fact "lcm(x, y) == |xy|/gcd(x, y)"
             (lcm 21 6) => (*' (/ 21 (gcd 21 6)) 6)
             (lcm 48 180) => (*' (/ 48 (gcd 48 180)) 180))
       (fact "lcm(x, y, z) == |xyz|/gcd(x, y, z)"
             (lcm 48 180 6) => (/ (*' 48 180 6) (gcd 48 180 6))))