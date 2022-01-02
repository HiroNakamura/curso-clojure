(ns excepciones)

(import '(javax.swing JOptionPane));'

;;Division entre cero
(println "Dividimos 3/0")
(try
  (println "Division entre cero:"(/ 3 0))
 ;;(catch Exception e (str "error: " (.getMessage e)))
 (catch Exception e 
     (JOptionPane/showMessageDialog nil,
         (str "Error: " (.getMessage e))
    )
  )
)

;;Formato de numero
(println "Formato de número")
(try
  (println "Suma:"(+ "3" 21))
 (catch Exception e 
     (JOptionPane/showMessageDialog nil,
         (str "Error: \n" (.getMessage e))
    )
  )
)


;;Cadenas
(println "Cadenas null")
(def cadena nil)
(try
  (println (clojure.string/upper-case cadena))
 (catch Exception e 
     (JOptionPane/showMessageDialog nil,
         (str "Error: \n" (.getMessage e))
    )
  )
)

;;Dividir entre cero
(println "Dividir entre cero")
(try
  (/ 1 "0")
  (catch Exception e
    (prn "Ha ocurrido una excepcion:" e)))

;;Error de sintaxis
(println "Error de sintaxis")
(try
  (eval 'w)
  (catch Exception e 
     (JOptionPane/showMessageDialog nil,
         (str "Error: \n" (.getMessage e))
    )
  )
)



















