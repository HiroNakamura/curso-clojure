(ns funciones)

(comment
   Funciones en Clojure

   (defn nombreFunc [param1, param2, ... paramN]
        operaciones
   )
)

;; Funciones

(comment
   FUNCTION SUMAR(X, Y){
      RETURN X+Y;
   }

)
(defn sumar "Sumar dos numeros"[x, y]
  (+ x y)
)

(defn restar "Restar dos numeros"[x, y]
  (- x y)
)

(defn multiplicar "Multiplicar dos numeros"[x, y]
  (* x y)
)

(defn dividir "Dividir dos numeros"[x, y]
  (/ x y)
)

(defn residuo3? [num]
  (if (= (mod num 3) 0) "Divisible entre 3" "No es divisible entre 3")
)


(defn factorial "Factorial de un numero" [n]
  (if (= n 1)
     n
     (* n (factorial(dec n)))
  )
)

(defn esMayor5? [num]
  (if (> num 5) true false)
)

(defn valor_futuro [presente, tasa, periodo]
  (+ presente (* presente (java.lang.Math/pow tasa periodo)))
)

;;defino las funciones
(defn obtenerImc [p,t]
  (/ p (* t t)))


(defn obtenerPeso [t,i]
  (* i (* t t)))

(defn obtenerTalla [p,i]
  (Math/sqrt (/ p i)))


(defn getAleatorio "Numero aleatorio" [vector]
  (vector (rand-int (count vector)))
)

;;
(defn calcular [ a b c d e f denominador]
  (def x (/ (- (* c e) (* b f) ) denominador));;x
  (def y (/ (- (* a f) (* c d) ) denominador));;y
  (println "Solucion:\nx="x" , y="y)
  )


;;
(println "***** Funciones en Clojure *****")
;;defino dos variables: peso e imc
(def peso 74.8)
(def imc 18.0)
(def arreglo ["A" "B" "C" "D"])
(def mapa {"x" 1 "y" 2 "z" 3})
;;;
(def a 2)
(def b 5)
(def c 12)
(def d 47)
(def e 30)
(def f 71)
(def denominador (- (* a e) (* b d)))
(println "denomindador:"denominador)
(if (= denominador 0) 
  (println "Sin solucion!")
  (calcular a b c d e f denominador)
  );;fin if
;;
;;
(println "Suma de 4 + 6 = "(sumar 4 6))
(println "Resta de 10 + 3 = "(restar 4 6))
(println "Multiplicacion de 4 * 6 = "(multiplicar 4 6))
(println "Division de 25 / 5 = "(dividir 25 5))
(println "=====================================")
;;
(println "Vector:"arreglo)
(println "Tam. arreglo:"(count arreglo))
(println "Aleatorio:"(getAleatorio arreglo))
(println "=====================================")
;;
(println "Mapa:"mapa)
(println "Obteniendo valor de x:"(get mapa "x"))
(println "Obteniendo valor de y:"(get mapa "y"))
(println "Obteniendo valor de z:"(get mapa "z"))
(println "=====================================")
;; usando try-catch
(try
  (println "Talla ideal:" (obtenerTalla peso imc))
  (println "=====================================")
  (println "Factorial de 4: "(factorial 4))
  (println "Factorial de 5: "(factorial 5))
 (catch Exception e (str "error: " (.getMessage e)))
)
(println "=====================================")
(def presente 304.43)
(def tasa (/ 24.0 100.0))
(def periodo 2.0)
(println "Valor presente: "presente)
(println "Tasa: "tasa)
(println "Periodo:" periodo)
(println "Valor futuro: "(valor_futuro presente tasa periodo))
;;
(println "***********************************************")
(def presente 120.33)
(def tasa 0.16)
(def periodo 4.0)
(println "Valor presente: "presente)
(println "Tasa: "tasa)
(println "Periodo:" periodo)
(try
  ;;(println "Valor futuro: "(valor_futuro presente tasa periodo))
  (println "X:"(valor_futuro nil nil nil))
  (catch Exception e 
    (println (str "Ha ocurrido una Exception: " 
      (.getMessage e)
    ))
  )
)
;;
(println "***********************************************")
(def numero 4)
(println "Verdadero?: "(esMayor5? numero));;false
(def numero 6)
(println "Verdadero?: "(esMayor5? numero));;true
(def numero 0)
(println "Verdadero?: "(not (esMayor5? numero)));;true
(def numero 10)
(println "Verdadero?: "(not (esMayor5? numero)));;false
(println "***********************************************")
(def numero 9)
(println "El numero:"numero" "(residuo3? numero))
(def numero 12)
(println "El numero:"numero" "(residuo3? numero))
(def numero 7)
(println "El numero:"numero" "(residuo3? numero))


(println "Esto es nuevo")


