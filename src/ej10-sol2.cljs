(defn pot? [n1, n2]
      (cond
        (or (not (number? n1)) (not (number? n2))) "no es un numero"
        (or (not (pos? n1)) (not (pos? n2))) "no es un numero positivo"
        (= n1 n2) "true"
        (> n2 n1) "false"
        :else (pot? (/ n1 n2) n2)
        )
      )

(print (pot? 16 2))