(ns org.icanttype.euler05.core
  (:require [org.icanttype.euler-utils.factor :refer [lcm]])
  (:gen-class))

(defn -main [& args]
  (println (apply lcm (range 1 21))))