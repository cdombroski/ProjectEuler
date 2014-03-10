(ns org.icanttype.euler-utils.factor
  (:require [clojure.math.numeric-tower :as math]))

(defn gcd
  ([x] (math/abs x))
  ([x y] x)
  ([x y & more] (reduce gcd x (cons y more))))

(defn lcm
  ([x] (math/abs x))
  ([x y] (*' (/ (math/abs x) (gcd x y)) (math/abs y)))
  ([x y & more] (*' (/ (math/abs x) (apply gcd x (cons y more))) (map math/abs (cons y more)))))