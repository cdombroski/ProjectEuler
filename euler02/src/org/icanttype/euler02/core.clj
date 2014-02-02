(ns org.icanttype.euler02.core
  (:gen-class)
  (:require [org.icanttype.euler_utils.fibonacci :refer :all]))

(defn sum-even-fibonacci-numbers [limit]
  (->> (fibonacci 1 2)
       (take-while (partial > limit))
       (filter even?)
       (apply +)))

(defn -main [& args]
  (println (sum-even-fibonacci-numbers 4000000)))
