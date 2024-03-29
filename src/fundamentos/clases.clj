(ns clases)

;;Clases
(defrecord Mascota [nombre edad])
(def my_mascota (Mascota. "Caramelo Dourmong" 2))
(println "Mascota: "(:nombre my_mascota) " : "(:edad my_mascota))


;;Clase
(defrecord Punto [x y])
;;Instancia
(def my_punto
  (Punto. 8.6 3.5)
)
(println "Punto("
   (:x my_punto)":"(:y my_punto)")"
)



;;Interface(s)
(defprotocol IServicio
  (mostrar[this]))


;;Clase(s) que implementa la interface
(defrecord Fecha[dia mes anyo]
   IServicio
   (mostrar[this](println "Fecha: { dia:"dia" -mes: "mes" -anyo:"anyo"}")))


(defrecord X [nombre]
   IServicio
   (mostrar[this](println "X: {nombre:"nombre"}"))
)

(defrecord Puerta []
  IServicio
  (mostrar[this](println "Abrimos la puerta de la casa"))
)

;;Instanciamos objeto(s)
(def fecha(Fecha.  "12" "Diciembre" "2020"))
(mostrar fecha)
(def my_x(X. "General Slaughter"))
(mostrar my_x)
(def puerta(Puerta.))
(mostrar puerta)



