(ns bucles)
;;bucles
(println "Bucles")
(loop [x 10]
  (when (> x 1)
    (println x)
    (recur (- x 2)))
)
;; 10 8 6 4 2


(println "======================================")
(loop [cont 0]
  (when (< cont 10)
    (println cont)
    (recur(+ cont 1))
  )
)
;; 0 1 2 3 4 5 6 7 8 9

(println "======================================")
;;tabla de multiplicar
(loop [i 1]
 (when (< i 10)
   (println "Tabla de multiplicar de:"i)
   (loop [j i]
    (when (< j 10)
      (println ""j"x"i"="(* i j))
      (recur (inc j))
    )
   )
   (recur (inc i))
 )
)
;;; usando let
(let [a 3]
  (println "a: "a)
  (inc a)
)