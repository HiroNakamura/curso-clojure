(ns escaner)
;;Importamos la librería java.util.Scanner
(import '(java.util Scanner))
(def scan (Scanner. *in*))



;;
(println "Tu nombre: ")
(def nombre (.nextLine scan))
;;solicitamos distancia y tiempo, usamos .nextFloat
(println "Introduce distancia: ")
(def distancia (.nextFloat scan))
(println "Introduce tiempo: ")
(def tiempo (.nextFloat scan))

(println "=========================================================")
;;visualizamos  datos
(println "Distancia leida: "distancia)
(println "Tiempo leido: "tiempo)

;;calculamos la velocidad
(println "Velocidad obtenida: "(/ distancia tiempo))

(println "=========================================================")
;;

(def resultado(if (="Ernesto" nombre) "Eres Ernesto" "No eres Ernesto"))
(println resultado)

;;;
(defn max [num1 num2]
  (if (< num1 num2)
    (println "Mayor:" num2)
    (println "Mayor:" num1)))

(let [scanner (Scanner. *in*)
      _ (println "Numero 1: ")
      num1 (.nextLine scanner)

      _ (println "Numero 2: ")
      num2 (.nextLine scanner)

      parsed-num1 (Integer/parseInt num1) ; aquí
      parsed-num2 (Integer/parseInt num2)] ; y aquí

  (println "Tu numero1 =" parsed-num1  "y tu numero2 = " parsed-num2)
  (max parsed-num1 parsed-num2))

