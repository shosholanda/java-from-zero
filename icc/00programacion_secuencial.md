# Programación secuencial

Programar es como escribir un libro, tiene un inicio, y un final y cosas interesantes para leer. Pero programar es todavía más poderoso, ya que existen palabras especiales que nos permitirán hacer cosas con la lectura del libro, por ejemplo, regresar al anterior capítulo, saltarme porciones de texto, o parar en algun punto de leer. 

Poco a poco iremos viendo cómo es que se usan estas "estructuras" para poder saltar sobre el libro de un lado a otro. Por ahora, lo primero que haremos es leer el libro de principio a fin, es decir, como leeríamos normalmente un libro. Este tipo de programar se le conoce como programación secuencial, ya que se leen instrucciones 1 x 1. 

Crearemos un pequeño problema usando programación secuencial.

## Problema 

Crear un programa que calcule el área de cualquier polígono regular, dados los parámetros
- Numero de lados del polígono.
- Base
- Apotema

El diagrama de flujo correspondiente es secuencial, es decir, solo hay una forma de llegar al final.


```java
import java.util.Scanner;

public class Problema1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lados;
        double lado, apotema;

        System.out.print("Ingrese número de lados del polígono: ");
        lados = input.nextInt();

        System.out.print("Ingrese el tamaño de un lado: ");
        lado = input.nextDouble();

        System.out.print("Ingrese el tamaño de la apotema: ");
        apotema = input.nextDouble();
        input.close();

        double area = (lados*lado) * apotema / 2;

        System.out.println("El área del polígono de " + lados + " lados es: " + area);
    }
}
```

