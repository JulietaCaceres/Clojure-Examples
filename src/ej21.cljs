; 21. Definir una función para obtener la matriz triangular superior (incluyendo la diagonal principal) de una matriz cuadrada
; que está representada como una lista de listas.

; no recursivo
;matriz superior con 0s y 1s
(defn diag-sup [n]
      (map concat (map repeat (range n) (repeat n 0)) (map repeat (reverse (range n)) (repeat n 1)) )
      )

;colocar 0 en la posicion correspondiente segun numero de fila
(defn aux [i l]
      (map * (nth (diag-sup (+ 1 (count l) ) ) i) l)
      )

; aplicar aux a cada fila
(defn triang-superior [M]
      (map-indexed aux M)
      )

;ejemplo
(println (triang-superior '((1 2 3) (4 5 6) (7 8 9))))


; recursivo
(defn triang-superior-recursivo [matrix]
      (cond
        (empty? matrix) '()
        :else
        (cons (take-last (count matrix) (first matrix)) (triang-superior-recursivo (drop 1 matrix)))
        )
        )
;ejemplo
(println (triang-superior-recursivo '((1 2 3) (4 5 6) (7 8 9))))