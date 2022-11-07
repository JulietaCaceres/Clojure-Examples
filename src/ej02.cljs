(defn segundos [d, h, m, s]
  (+ (* 86400 d) (* 3600 h) (* 60 m) s))

(print (segundos 1 2 3 4))