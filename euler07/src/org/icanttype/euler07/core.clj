(ns org.icanttype.euler07.core
  (:require [org.icanttype.euler-utils.prime :refer [primes]])
  (:gen-class))

(defn -main [& args]
  (println (nth primes 10000)))
