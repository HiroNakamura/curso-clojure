(ns servicio)
(import '(java.util Scanner))
(def entrada(Scanner. *in*))

;;interface
(defprotocol Servicio
  (verFecha[this]))

;;creamos la 'clase' Fecha e implementamos la interface Servicio
(defrecord Fecha[dia mes anyo]
   Servicio
   (verFecha[this](println "Fecha: { dia:"dia" -mes: "mes" -anyo:"anyo"}")))

 ;; probamos
(try
  (def miFecha(Fecha.  "04" "noviembre" "2020"))
  (verFecha miFecha)
  
  (println "Dia:")
  (def dia(.nextLine entrada))
  (println "Mes:")
  (def mes(.nextLine entrada))
  (println "Anyo:")
  (def anyo(.nextLine entrada))
  (def miFecha2(Fecha.  dia mes anyo))
  (verFecha miFecha2)
 
  (catch Exception e 
     (JOptionPane/showMessageDialog nil,
         (str "Ha ocurrido una excepcion: \n" (.getMessage e))
    )
  )
)

