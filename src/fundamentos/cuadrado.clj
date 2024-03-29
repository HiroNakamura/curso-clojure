(ns cuadrado)

(import '(javax.swing JOptionPane));'
(defn introduceDato [s]
  (JOptionPane/showInputDialog
    (str s)
  )
)

(def numero(introduceDato "Introduce numero:"))

;;convertir String a número
(defn String->Number [str]
  (let [n (read-string str)]
       (if (number? n) n nil)))

;;función cuadrado
(defn cuadrado [n]
 (* n n)
)

;;'main' del programa
(try

  (JOptionPane/showMessageDialog nil,
     (str "El numero introducido es: "numero)
  )

  (JOptionPane/showMessageDialog nil,
     (str "Al cuadrado es: "(cuadrado (String->Number numero)))
  )


  (catch Exception e 
     (JOptionPane/showMessageDialog nil,
         (str "Error: " (.getMessage e))
    )
  )


)