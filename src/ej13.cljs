(defn get-pares [l]
      (take-nth 2 (nthnext l 1) )
      )

(defn get-pares2 [l1, l2]
      (concat (get-pares l1) (get-pares l2))
      )