(ns tarot)

(comment
   Carta de tarot en Clojure
)

;;Funciones
(defn sumar[x, y, z]
  (+ x y z)
)

(defn descomponer [x]
  ;;
)


(def dia 18)
(def mes 12)
(def anyo 1981)
(println "*** [Carta de Tarot] ***")
(println "Dia: "dia)
(println "Mes: "mes)
(println "Año: "anyo)
(def sumafecnac (sumar dia  mes anyo))
(println "Suma: "sumafecnac)
(def mision_vida (descomponer sumafecnac))