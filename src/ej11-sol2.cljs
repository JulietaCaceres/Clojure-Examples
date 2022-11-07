(defn digs [n]
      (cond
        (not (number? n)) "no es un numero"
        :else
        (map char (str n))
        )
        )
(println (digs 123))