(ns cadenas)


(defn convertir_to_cadena [numero]
    (String/valueOf numero)
)


(def numero 299)
(println "Numero: "numero)
(println "Tipo: "(type numero))
(println "Cadena: "(convertir_to_cadena numero))
(println "Tipo: "(type (convertir_to_cadena numero)))
(println "Longitud de la cadena [count]:"(count (convertir_to_cadena numero)))
