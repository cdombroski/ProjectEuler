(ns org.icanttype.euler07.core
  (:require [org.icanttype.euler-utils.prime :refer [sieve]])
  (:gen-class))

(defn -main [& args]
  (println (nth (sieve) 10000)))
