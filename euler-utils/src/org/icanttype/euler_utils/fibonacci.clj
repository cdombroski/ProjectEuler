(ns org.icanttype.euler-utils.fibonacci)

(defn fibonacci
  ([] (fibonacci 0 1))
  ([first second]
   ((fn rfib [a b] (lazy-seq (cons a (rfib b (+ a b))))) first second)))
