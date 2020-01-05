(ns cdombroski.euler001)

(defn -main [& args]
  (println
   (->> (range 1000)
        (filter #(or (zero? (mod % 3)) (zero? (mod % 5))))
        (reduce +))))