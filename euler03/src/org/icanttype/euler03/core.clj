(ns org.icanttype.euler03.core
  (:require [org.icanttype.euler_utils.prime :refer [prime-factor]]))

(defn largest-prime-factor [n]
  (apply max (keys (prime-factor n))))

(defn -main [& args]
  (println (largest-prime-factor 600851475143)))
