(defn digs [n]
      (cond
        (not (number? n)) "no es un numero"
        (= n 0) []
        :else
        (conj (digs (quot n 10)) (rem n 10))
        )
        )

(println (digs 123))