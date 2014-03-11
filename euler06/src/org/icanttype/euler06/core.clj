(ns org.icanttype.euler06.core)

(defn square [x] (* x x))

(defn sum-of-square [nums]
  (reduce + (map square nums)))

(defn square-of-sum [nums]
  (square (reduce + nums)))

(defn -main [& args]
  (println (- (square-of-sum (range 1 101)) (sum-of-square (range 1 101)))))
