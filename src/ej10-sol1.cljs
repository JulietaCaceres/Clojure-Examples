(defn pot? ( [n1, n2]
            (cond
              (not (number? n1)) "n1 no es un numero"
              (not (number? n2)) "n2 no es un numero"
              (= n1 n2) "true"
              (> n2 n1) "false"
              :else (pot? 1 n1 n2)
              ))
      ( [cont n1 n2]
       ( cond
         (= n1 (apply * (repeat cont n2))) "true"
         (> (apply * (repeat cont n2)) n1) "false"
         :else (pot? (inc cont) n1 n2)
         )
       )
      )