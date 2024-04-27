# Cómo crear programas en Java

En general, **TODOS** los programas y aplicaciones son escritas en texto plano (de que abrir bloc de notas y empezar a escribir). Hay algunas aplicaciones llamadas IDE que se especializan en facilitar más el entorno de trabajo de algunos proyectos grandes.

Lo que buscamos es poder escribir código sin preocuparnos por el tipo de letra o colores y preocuparnos más por que nuestro programa sea rápido, de resultados correctos y resistente a fallos. Por lo que nunca usaremos editores de texto como *Word* o *Bloc de Notas* ya que estos se especializan más en la presentación del texto.


Procedemos a crear un nuevo archivo de texto. Para este programa en **PARTICULAR** guardaremos nuestro archivo como:
*HolaMundo.java*

**Nota**: Es importante estar en la carpeta correcta antes de crear, compilar y ejecutar el programa. puedes usar el comando
```bash
$ pwd
```

Para ver en qué carpeta te encuentras exactamente. Y cambiarte/crear una nueva carpeta donde quieras trabajar. Puedes ver más comandos útiles [aquí](../linux/comandos.md)

Lo podemos hacer de muchas formas. Como abrir nuestro editor favorito de textos y dar en Archivo > Nuevo archivo y especificamos el nombre de arriba. Si estamos en emacs, podemos usar C-x C-f y seguidamente escribir el nombre de archivo o desde la terminal como

```bash
$ touch HolaMundo.java
```

Abrimos este archivo con cualquier editor de texto y procederemos a anotar lo siguiente, con cuidado y sin que se nos vaya ningún símbolo. Los espacios de la izquierda también son importantes. No se te olvide guardar al final el archivo.

```java
public class HolaMundo {

    public static void main (String[] args) {
        System.out.println("Hola mundo!");
    }

}
```

Ya tenemos nuestro primer programa escrito en Java. Es muy *simple*, pero todos empezamos siempre por algo ¿no?

Como mencionamos anteriormente, la computadora debe traducir este "*idioma*" a algo que la misma computadora pueda entender. Para esto debemos utilizar el compilador de Java y nos generará un archivo binario, exactamente en bytecode que tiene una extensión .class.

Para compilar el archivo escribimos lo siguiente en la terminal. (Nota: debemos estar en la misma carpeta donde guardamos el archivo!)

```bash
$ javac HolaMundo.java
```

javac viene de *java compiler*. Si no tenemos errores de "*ortografía*" (sintáxis o semántica) el compilador debería gener el archivo compilado, de lo contrario habría que ver en qué pudimos habernos equivocado a la hora de copiar el código de arriba.

Podemos ver la traducción que generó el compilador si utilizamos el siguiente comando

```bash
$ cat HolaMundo.class
```

Nos aparecerá algo que no podemos encontrar ningún sentido, símbolos raros que solamente la computadora entiende. cat sirve para mostrar un archivo "tal cual es internamente". ¿Qué pasa si hacemos cat al archivo HolaMundo.java?


Finalmente, ejecutaremos nuestro programa utilizando el ejecutador de aplicaciones de java, que es con el comando:

```bash
$ java HolaMundo
```

En la terminal debería aparecernos el mensaje que escribimos anteriormente, estamos "**imprimiendo**" en pantalla el texto "*Hola mundo*".

Lo importante es que quede claro cómo crear, compilar y ejecutar un programa. El código como tal será explicado a medida que se vaya avanzando.

