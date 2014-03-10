(ns org.icanttype.euler-utils.factor
  (:require [clojure.math.numeric-tower :as math]))

(defn gcd
  ([x] (math/abs x))
  ([x y] x)
  ([x y & more] (reduce gcd x (cons y more))))

(defn lcm
  ([x] (math/abs x))
  ([x y] (if (= 0 x y)
           0
           (*' (/ (math/abs x) (gcd x y)) (math/abs y))))
  ([x y & more] (apply *' (/ (math/abs x) (apply gcd x y more)) (map math/abs (cons y more)))))