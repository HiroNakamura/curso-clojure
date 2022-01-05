# Clojure

![Clojure](https://1.bp.blogspot.com/-CKSrls_dpQA/VAMgfM2QqnI/AAAAAAAAAzA/JVKpg0qVnMYI0ksTDB2IOeH9JSvooidvQCPcBGAYYCw/s805/Clooj.jpg.jpg)

## Programando en Clojure for Beginners

> Clojure es un lenguaje de programación dinámico de propósito general, que combina la accesibilidad y el desarrollo interactivo de un lenguaje de scripting con una infraestructura eficiente y robusta para la programación multiproceso. Clojure es un lenguaje compilado, pero sigue siendo completamente dinámico: todas las funciones compatibles con Clojure son compatibles en tiempo de ejecución. Clojure proporciona un fácil acceso a los marcos de Java, con sugerencias de tipo e inferencia de tipo opcionales, para garantizar que las llamadas a Java puedan evitar la reflexión.

Para descargar la versión actual es necesario contar con Git y Maven instalados:

```
git clone https://github.com/clojure/clojure.git
cd clojure
mvn -Plocal -Dmaven.test.skip=true package
```

Una vez que se ha creado el JAR, ejecutamos de la siguiente manera:
```
java -jar clojure.jar
```
Esto abrirá el REPL.

```java
    user=> (def num 33)
    user=> (println "Numero: "num);; Numero: 33
    user=> (defn foo [x] (+ x 5))
    user=> (foo 5);; 10
    user=> (+ 1 2 3 4 5 6);;  21
    user=> (doc foo);;
    user=> (defn foo "Mi funcion Clojure" [x] (* x 5))
    user=> (foo 4);; 20
    user=> (doc foo)
    user=> (doc doc)
    user=> (doc defn)
    user=> nil
    user=> true
    user=> false
    user=> (< 2 10);; true
    user=> (< 5 3);; false
    user=> (= 4 5);; false
    user=> (= 4 4);; true
    user=> (= (+ 2 2) 4);; true
    user=> (if (= 3 3)
            (println "X")
    )
    user=> (def nombre "Fernando")
    user=> (println "Hola, "nombre)
    user=> (doc nombre)
    user=> (let [x]
             (println "X: "x)
             (inc x)
        )
    user=> (let [x 3
                 y 4]
            (println "Suma("x","y")"(+ x y))
        )
    user=>
```
Para salir Ctrl + c


**hola_mundo.clj**
```java
(def saludo "Hola, mundo!!")
(println saludo)
```

**Ejecutando:**
```
$ java -jar clojure.jar hola_mundo.clj
```

## Instalando Clojure en Ubuntu

1. Dependencias
```bash
$ sudo apt-get install -y bash curl rlwrap
```
2. Descargar script
```bash
$ curl -O https://download.clojure.org/install/linux-install-1.10.2.774.sh
```
3. Permisos de jecución
```bash
$ chmod +x linux-install-1.10.2.774.sh
```
4. Ejecutar instalador
```bash
$ sudo ./linux-install-1.10.2.774.sh
```
5. Verificar instalación
```bash
$ clj
```

## Editores de código para Clojure
* [Counterclockwise](https://marketplace.eclipse.org/content/counterclockwise)
* [https://cider.mx/](https://cider.mx/)


Links:
* [https://clojure.org/](https://clojure.org/)
* [https://clojuredocs.org/](https://clojuredocs.org/)
* [https://learnxinyminutes.com/](https://learnxinyminutes.com/)
