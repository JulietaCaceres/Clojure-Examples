; 22. .Definir una función para obtener la diagonal principal de una matriz cuadrada que
;está representada como una lista de listas.
(defn aux2 [i l]
      (nth l i)
      )

; no recursivo
(defn triang-principal [matrix]
      (map-indexed aux2 matrix)
        )
;ejemplo
(println (triang-principal '((1 2 3) (4 5 6) (7 8 9))))

; recursivo
(defn triang-principal-recursivo [matrix]
      (cond
        (empty? matrix) '()
        :else
        (conj (triang-principal-recursivo (drop-last 1 matrix ))  (nth (last matrix) (- (count matrix) 1) ) )
        )
        )

;ejemplo
(println (triang-principal-recursivo '((1 2 3) (4 5 6) (7 8 9))))
