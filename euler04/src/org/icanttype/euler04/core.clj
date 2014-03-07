(ns org.icanttype.euler04.core
  (:require [clojure.string :as string])
  (:gen-class))

(defn palindrome? [n]
  (= (str n) (string/reverse (str n))))

(defn products [factors1 factors2]
  (for [f1 factors1
        f2 factors2]
    (* f1 f2)))

(defn palindrome-products [factors1 factors2]
  (filter palindrome? (products factors1 factors2)))

(defn max-palindrome-product
  ([factors] (max-palindrome-product factors factors))
  ([factors1 factors2] (apply max (palindrome-products factors1 factors2))))

(defn -main [& args]
  (println (max-palindrome-product (range 100 1000))))