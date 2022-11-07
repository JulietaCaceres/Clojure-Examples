(defn aprox-pi [n]
      (* 4 (apply + (map / (flatten (repeat (+ 1 (quot n 4) )  [1 0 -1 0])) (range 1 (+ n 1))))))

((println (aprox-pi 3)))