;a)
; Definir las funciones filas-max-V y mas-V-o-F que, aplicadas a una matriz de V y F
;(una lista de listas con los valores V y F), devuelvan, respectivamente:
;a) El/los número/s de la/s fila/s en la/s que la cantidad de V es máxima, por ejemplo:
;(filas-max-V '((V F V V F)(V V F V V)(F F F V F)(V V V F V))) → (1 3)

(defn get-frecuencies [i l]
      (conj [i] (get (frequencies l) 'V)))

(defn get-max [M]
      (reduce max (map last (map-indexed get-frecuencies M))) )


(defn filas-max-V [M]
      (map first (filter (fn [x] (= (last x) (get-max M)))  (map-indexed get-frecuencies M) )
           )
      )

(print (filas-max-V '((V F V V F)(V V F V V)(F F F V F)(V V V F V))))

