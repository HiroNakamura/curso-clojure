(ns fundamentos)

;; Fundamentos de programación en Clojure

(comment
    Este es 
un repaso al lenguaje de 
programación Clojure.

Clojure es similar a LISP. De proposito general y funcional.
Puede interactuar con código Java al ser dependiente de la JVM.

    )


(import '(javax.swing JOptionPane));'

;; Funciones
(defn suma "Suma de dos numeros" [x y]
    (+ x y)
    )
(defn resta "Resta de dos numeros" [x y]
    (- x y)
    )
(defn multiplica "Multiplicacion de dos numeros" [x y]
    (* x y)
    )
(defn division "Division de dos numeros" [x y]
    (/ x y)
    )

;; Esta funcion no devuelve valores
(defn Ejemplo "Esta funcion no devuelve nada" [] (
    if ( = 2 2)
    (println "Los valores son iguales")
    (println "Los valores no son iguales")))


(defn hola "Uso de case" [pais]
    (case pais
        :mexico "Hola, México!"
        :alemania "Hallo, Germany!"
        :israel "Shalom, Israel!"
        :francia "Bonjour, France!"
        "Hello, USA!"
    )
)


(defn es-par? [numero]
    (if (= (mod numero 2) 0) "par" "impar"))


(defn esMayor10? "Funcion que devuelve un valor booleano" [x]
    (if (> x 10)
       (boolean true))
    )


(defn parse-int "Regex para converit String a Integer" [s]
    (Integer. (re-find #"[0-9]*" s)))


(defn string-int "Convertir String a Integer" [numStr] 
    (Integer/parseInt numStr)
    )

;; Uso de JOptionPane
(defn introduceDato [s]
    (JOptionPane/showInputDialog
      (str s)
    )
  )

;; Definimos una clase Persona
(defrecord Persona [nombre edad])



;; Variables, Long, Double, String, Character, Boolean
(def strCadena "Definimos una variable String" "Clojure")
(def numeroInt "Definimos una variable Integer" 45)
(def numeroFloat "Definimos una variable Float" 2.4)
(def numeroDouble "Definimos una variable Double" 300.21)
(def carChar "Definimos una variable Character" \u0032)
(def booleano "Definimos una variable Boolean" true)
(println "\t================================")
(println "\t [Programando en"strCadena"]")
(println "Entero: "numeroInt)
(println "Flotante: "numeroFloat)
(println "Real: "numeroDouble)
(println "Caracter: "carChar)
(println "Booleano: "booleano)
(println "Tipo [numeroInt]:"(type numeroInt))
(println "Tipo [numeroFloat]:"(type numeroFloat))
(println "Tipo [numeroDouble]:"(type numeroDouble))
(println "Tipo [carChar]:"(type carChar))
(println "Tipo [booleano]:"(type booleano))
(println "Tipo [strCadena]:"(type strCadena))
(println "\t================================")
;; Uso de funciones
(def x 4)
(def y 1)
(println "x ="x", y="y)
(println "Suma:"(suma x y));; 5
(println "Resta:"(resta x y));; 3
(println "Producto:"(multiplica x y));; 4
(println "Division:"(division x y));; 4
(Ejemplo)
(println "\t================================")
;; Operaciones y funciones matemáticas
(println "4+5-(3*2)="(- (+ 4 5) (* 3 2)));; 3
(println "5/6/3+(5*2)-4="(- (+ (/ (/ 5 6) 3) (* 5 2)) 4));; 113/18
(println "(3*3)-(5+6)="(- (* 3 3) (+ 5 6)));; -2
(println "(8-9)*(6+3)="(* (- 8 9) (+ 6 3)));; -9
(println "220%200="(mod 220 200));; 20
(println "100%10="(mod 100 10));; 0
(println "340%300="(mod 340 300));; 40
(println "Maximo de (1 2 3 4 5)="(max 1 2 3 4 5));; 5
(println "Maximo de (5 1 66 0 4 8 21)="(max 5 1 66 0 4 8 21));; 66
(println "Minimo de (1 2 3 4 5)="(min 1 2 3 4 5));; 1
(println "Minimo de (5 1 66 0 4 8 21)="(min 5 1 66 0 4 8 21));; 0
(println "PI = "(Math/PI))
(println "PI * 2 = "(* Math/PI 2))
(println "No. aleatorio [rand 2] = "(rand 2))
(println "No. aleatorio [rand 10] = "(rand 2))
(println "No aleatorio [rand-int 100]= "(rand-int 100))
(println "Euler ="(Math/E))
(println "Pow(2, 10) ="(Math/pow 2 10))
(println "Pow(56, 2) ="(Math/pow 56 2))
(def cont 1)
(println "Cont:"cont);; 1
(println "Cont:"(inc cont));; 2
(println "\t================================")
;; Funciones de cadena
(println "FERROCARRILERO tiene una longitud de:"(.length "FERROCARRILERO"))
(println "MURCIELAGO tiene una longitud de:"(.length "MURCIELAGO"))
(println "fernando en mayusculas:"(.toUpperCase "fernando"))
(println "BENANCIO en minusculas:"(.toLowerCase "BENANCIO"))
(println "El primer caracter de ABCDEF="(.charAt "ABCDEF" 0));; A
(println "El tercer caracter de ABCDEF="(.charAt "ABCDEF" 2));; C
(println "El ultimo caracter de ABCDEF="(.charAt "ABCDEF" 5));; F
(println "'FER' contiene 'E'?"(.contains "FER" "E"));; true
(println "'FER' contiene 'Y'?"(.contains "FER" "Y"));; false
;; Funciones de cadena propias de Clojure
(println "Quitar espacios:"(clojure.string/trim " Cadena con espacios "))
(def strCadenaMayus "Esta es una cadena en mayusculas" "ALFABETO")
(def strCadenaMinus "Esta es una cadena en minusculas" "ana maria")
(println strCadenaMayus)
(println "En minusculas:"(clojure.string/lower-case strCadenaMayus))
(println strCadenaMinus)
(println "En mayusculas:"(clojure.string/upper-case strCadenaMinus))
(println (str "Bienvenidos" " a Clojure City"));; concatenar
(println (format "Guten , %s" "Tag amigos!!"))
(println (format "Numero: %d" 1234))
(println "Y la cadena mide:"(count "Y la cadena mide")" de longitud")
(println "\t================================")
;; Condicionales

(if (=  (compare "A" "A") 0)
  (println "Son iguales")
)
;; Esto no se vera
(if (=  (compare "B" "A") 0)
  (println "No son iguales")
)

(if (=  (compare "X" "X") 0)
  (println "No son identicas")
  (println "Son identicas")
)


(println (hola :mexico))
(println (hola :francia))

(def opcion 3)
(println "\t Menu\n\t1. Caviar\n\t2. Huevo con arroz\n\t3. Solo una uva.")
(def eleccion "Asignamos el resultado en esta variable" (case opcion     1 "Esta muy caro, ¿Realmente quiere desayunar eso?"     2 "Aceptable para este dia"     3 "Muy poco, ¿no crees?, te sale gratis"     "Eso no esta disponible"   ))
(println eleccion)

(def monto "Definimos una variable tipo Integer" 500)
(def resultado (cond      (> monto 700) "Es un monto mayor a $700"     (> monto 600) "Es un monto mayor a $600"     (> monto 500) "Es un monto mayor a $600"     (> monto 400) "Es un monto mayor a $400"     true "Es un monto que no cumple el criterio"   ))
(println "Monto:"(str "$" monto))
(println resultado)


(println "12 es :"(es-par? 12))
(println "20 es :"(es-par? 20))
(println "37 es :"(es-par? 37))
(println "45 es :"(es-par? 45))

(println "\t================================")
;; Excepciones

(try

    (println "Introduce un numero:")
    (def entradaInt (read-line))
    (if (esMayor10? (parse-int entradaInt))
        (println (str entradaInt " es mayor a 10"))
    )

    (catch Exception e 
        (println (str "Ha ocurrido una excepcion: \n\t" (.getMessage e)))
    )
)


(def entradaStr "32")
(def entradaStrToInt (string-int entradaStr))

(try
    (if (esMayor10? entradaStrToInt)
        (println (str entradaStrToInt " es mayor a 10"))
    )

    (catch Exception e 
        (println (str "Ha ocurrido una excepcion: \n\t" (.getMessage e)))
    )
)

(println "\t================================")
(try
    (def nombre(introduceDato "Introduce tu nombre:"))
    (JOptionPane/showMessageDialog nil,
        (str "Hola, "(clojure.string/upper-case nombre)". \nBienvenido a City Clojure!!")
     )
    (catch Exception e 
        (println (str "Ha ocurrido una excepcion: \n\t" (.getMessage e)))
    )
)

(println "\t================================")
;; Clases
(def fernando "Definimos un objeto de tipo persona" (Persona. "Fernando Carraro Aguirre" 40))
(println "Persona:"fernando)
(println "\t[Persona]\n\tNombre:"(:nombre fernando))
(println "\tEdad:"(:edad fernando)"años")
(println "Tipo:"(type fernando))

