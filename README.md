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


**hola_mundo.cjl**
```java
(def saludo "Hola, mundo!!")
(println saludo)
```

**Ejecutando:**
```
$ java -jar hola_mundo.cjl
```


Links:
* [https://clojure.org/](https://clojure.org/)
* [https://clojuredocs.org/](https://clojuredocs.org/)
* [https://learnxinyminutes.com/](https://learnxinyminutes.com/)