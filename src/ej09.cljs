(defn cant-dig [n]
      (
        cond
        (not (number? n)) "no es un numero"
        :else
        (count (str n))
        )
      )

(println (cant-dig 123))