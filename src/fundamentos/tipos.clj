(ns tipos)

(comment 
   Tipos en Clojure
   Integer, String, Boolean, etc. 
)

;; (def nombreVariable valor)

(def a 1)
(def b 2)
(def real 45.3)
(def strCad "Clojure")
(def verdadero true)
(def falso false)
(def arreglo [1 2 3 4 5 6 7 8])
(def cadena ["C" "l" "o" "j" "u" "r" "e"])
;;;
(println "**** Tipos en Clojure ****")
(println "a: "a)
(println "b: "b)
(println "Tipo a: "(type a))
(println "Tipo b: "(type b))
(println "real: "real)
(println "Tipo real: "(type real))
(println "strCad: "strCad)
(println "Tipo strCad: "(type strCad))
(println "arreglo: "arreglo)
(println "Tipo arreglo: "(type arreglo))
(println "cadena: "cadena)
(println "Tipo cadena: "(type cadena))
(println "verdadero: "verdadero)
(println "Tipo verdadero: "(type verdadero))
(println "falso: "falso)
(println "Tipo falso: "(type falso))

;;;
(if (= verdadero true)
    (println "Europa renacida")
)

(if (= falso true)
    (println "Esto nunca se vera")
)

(if (> 6 2) 
   (println "True")
)

(def moneda ["AGUILA" "SOL"])
(println "Elemento indice 0:"(moneda 0))
(println "Elemento indice 1:"(moneda 1))
(println "Obtenemos aleatoriamente:"(moneda (rand-int 2)))
(def aleatorio (moneda (rand-int 2)))
(println "Obtenemos aleatoriamente:"aleatorio)
;;
(comment 
  Juego del disparejo
)
(def hugo (moneda (rand-int 2)))
(def paco (moneda (rand-int 2)))
(def luis (moneda (rand-int 2)))
(def ganador "")
(println "Hugo: "hugo)
(println "Paco: "paco)
(println "Luis: "luis)

(if (and (not (= hugo paco)) (not (= hugo luis)))
  (def ganador "El ganador es Hugo")
)

(if (and (not (= paco luis)) (not (= paco hugo)))
  (def ganador "El ganador es Paco")
)

(if (and (= hugo luis)(= paco luis))
  (def ganador "No hay ganador")
)

(if (and (not (= luis paco)) (not (= luis hugo)))
  (def ganador "El ganador es Luis")
)

(println ganador)

;; Cadenas
(println "Cadena:"strCad)
(println "Logitud de la cadena usando count:"(count strCad))
;;
(println "Suma: "(+ 1 2 3 4 5 6 7 8 9))
