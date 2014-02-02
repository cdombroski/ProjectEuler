(ns org.icanttype.euler01.core
  (:gen-class))

(defn sum-multiples-3-or-5 [limit]
  (->> limit
       (range)
       (filter #(or (zero? (mod % 5)) (zero? (mod % 3))))
       (apply +)))

(defn -main
  [& args]
  (println (sum-multiples-3-or-5 1000)))