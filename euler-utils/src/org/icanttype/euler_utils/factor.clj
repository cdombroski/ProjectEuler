(ns org.icanttype.euler-utils.factor
  (:require [clojure.math.numeric-tower :as math]))

(defn gcd
  ([x] (math/abs x))
  ([x y]
   (cond
     (zero? x) (math/abs y)
     (zero? y) (math/abs x)
     :else (loop [a x
                  b y
                  d 1]
             (cond
               (and (even? a) (even? b)) (recur (/ a 2) (/ b 2) (*' d 2))
               (even? a) (recur (/ a 2) b d)
               (even? b) (recur a (/ b 2) d)
               :else (if (>= a b)
                       (*' d (gcd b (/ (- a b) 2)))
                       (*' d (gcd a (/ (- b a) 2))))))))
  ([x y & more] (reduce gcd x (cons y more))))

(defn lcm
  ([x] (math/abs x))
  ([x y]
   (if (= 0 x y)
     0
     (*' (/ (math/abs x) (gcd x y)) (math/abs y))))
  ([x y & more] (reduce lcm x (cons y more))))