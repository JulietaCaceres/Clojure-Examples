(defn repartir
      ([] "uno para vos, uno para mi")
      ( [& more] ( mapv (partial str "uno para mi, uno para ")  more))
      )
(println (repartir 'a 'b 'c))