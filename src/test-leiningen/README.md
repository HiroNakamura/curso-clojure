# Leiningen

## Aprendiendo Clojure con Leiningen

> Leiningen es la forma más sencilla de utilizar Clojure. Con un enfoque en la automatización de proyectos y la configuración declarativa, se sale de su camino y le permite concentrarse en su código.


Sitio oficial: https://leiningen.org/


### Instalando Leiningen

1. Descargue el script lein (o en Windows lein.bat)
2. Colóquelo en su $ PATH donde su shell pueda encontrarlo (por ejemplo, ~ / bin)
3. Configúrelo para que sea ejecutable (chmod a + x ~ / bin / lein)
4. Ejecútelo (lein) y descargará el paquete de autoinstalación

### Instalando Leiningen con SDKMAN!

```
$ sdk install leiningen
```

### Creando un proyecto
```
$ lein new app my-stuff
# Generating a project called my-stuff based on the 'app' template.

$ # see how it looks like using the "tree" command
$ tree -F -a --dirsfirst my-stuff/

my-stuff/
├── doc/
│   └── intro.md
├── resources/
├── src/
│   └── my_stuff/
│       └── core.clj
├── test/
│   └── my_stuff/
│       └── core_test.clj
├── CHANGELOG.md
├── .gitignore
├── .hgignore
├── LICENSE
├── project.clj
└── README.md

$ cd my-stuff
$ lein run
```

