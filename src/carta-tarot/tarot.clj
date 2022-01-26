(ns tarot)

(comment
   Carta de tarot en Clojure 
   @ClojureTarot 2022
)

;;Funciones
(defn sumar[x, y, z]
  (+ x y z)
)

(defn convertir_to_cadena [numero]
  (String/valueOf numero)
)

(defn descomponer_cadena [x]
  ;;
)

(defn numerologia [nombre fecha]
  ;;
)

(defn obtener_tarot [fecha]
  ;;
)

(def tabla_numerica {"A" 1, "B" 2, "C" 3, "D" 4, "E" 5, "F" 6, "G" 7, "H" 8, "I" 9, "J" 1, "K" 2, "L" 3, "M" 4, "N" 5 ,"O" 6, "P" 7, "Q" 8, "R" 9, "S" 1, "T" 2, "U" 3, "V" 4, "W" 5, "X" 6,"Y" 7, "Z" 8})

;; Datos de entrada
(def dia 18)
(def mes 12)
(def anyo 1981)
(def nombre "Juanito Alcantara Villegas")
(println "\t=========[Carta de Tarot en Clojure]=========")
(println "Dia: "dia)
(println "Mes: "mes)
(println "Año: "anyo)
(def sumafecnac (sumar dia  mes anyo))
(println "Suma de la fecha: "sumafecnac)
(println "Valor de A: "(get tabla_numerica "A"))
(println "Valor de Z: "(get tabla_numerica "Z"))
(println "Tipo: "(type (convertir_to_cadena sumafecnac)))


;;(def mision_vida (descomponer_cadena sumafecnac))




