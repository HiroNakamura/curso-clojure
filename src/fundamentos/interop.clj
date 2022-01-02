(ns interop)

(comment
  Importamos libreria de 
    Java en codigo
        Clojure
)

(import '(javax.swing JOptionPane));'
(import java.util.Date);;
(import '(java.util Scanner))


;;defino el método introduceDato
(defn introduceDato []
    (JOptionPane/showInputDialog
         (str "Introduce una cadena:")
     )
)

;;Introducimos dato
(def entrada (introduceDato))
;;imprimimos
(JOptionPane/showMessageDialog nil,
   (str "Cadena: "entrada)
)

;; Obtenemos el nombre del SO
(def sistema(. (. System (getProperties)) (get "os.name")))

    (JOptionPane/showMessageDialog nil,
       (str "Estas usando "sistema)
)

;;Fechas
(def fecha (java.time.LocalDateTime/now))
(def hoy (Date.))
(try
  (println "Hoy es "fecha)
  (println "Hoy es"(Date.))
  (JOptionPane/showMessageDialog nil,
       (str "Hoy es [java.time]:\n "fecha))
  (JOptionPane/showMessageDialog nil,
       (str "Hoy es [java.util]:\n "hoy))
 (catch Exception e 
     (JOptionPane/showMessageDialog nil,
         (str "Error: \n" (.getMessage e))
    )
  )
)

;;Usando scanner
(def scan (Scanner. *in*))
;;Cadena
(println "Suelta una linea: ")
(def linea (.nextLine scan))

;;Flotante
(println "Introduce un numero flotante: ")
(def flotante (.nextFloat scan))

;;Entero
(println "Introduce un numero entero: ")
(def entero (.nextInt scan))

(try
 (println "Linea: "linea)
 (println "Flotante: "flotante)
 (println "Entero: "entero)
 (catch Exception e 
     (JOptionPane/showMessageDialog nil,
         (str "Error: \n" (.getMessage e))
    )
  )
)








