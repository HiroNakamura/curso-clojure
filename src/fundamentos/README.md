Revisando los fundamentos del lenguaje Clojure.

# Fundamentos en Clojure

Para ejecutar programas en Clojure debes comprobar tener Java (JDK) en tu sistema:

```bash
$ java -version

```

Para ejecutar programas en Clojure debes abrir una terminal y teclear:
```bash

$ java -jar clojure.jar programa.cjl

```

En Clojure puedes declarar una variable de esta forma:
```java

(comment
  Esto es un
     comentario multilinea
)

;; Tipos
(def entero 33)
(def strCad "El general no tiene quien le escriba.")
(def verdadero true)
(println "Entero: "entero)
(println "Cadena: "strCad)
(if (= verdadero true)
  (println "¡Verdadero!")
)
```
Entrando al REPL:
```bash
$ java -jar clojure.jar
user=> (+ 1 2 3 4)
10
user=> (/ 20 2)
10
user=> (mod 220 200)
20
user=> (= 34 43)
false
user=> (< 34 43)
true
user=> (let [x 5
             y 6]
          (println ""x" + "y" = "(+ x y))
       )
5 + 6 = 11
user=> (let [cont 3]
            (println "Cont: "cont)
            (inc cont))
Cont:  3
4
user=>
``` 
Para salir Ctrl + C
