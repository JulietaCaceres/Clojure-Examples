(defn nth-fibo [n]
      (
        cond
        (not (number? n)) "No es un numero"
        (< n 0) "No puede ser negativo"
        (= n 0) 1
        (= n 1) 1
        :else
        (+ (nth-fibo (- n 1)) (nth-fibo (- n 2)))
        ))

(print (nth-fibo 5))
