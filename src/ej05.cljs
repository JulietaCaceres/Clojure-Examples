(defn capicua? [n]
      (= (apply str  (reverse (str n))) (str n)))


(println (capicua? 12321))