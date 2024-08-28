import java.util.Scanner;

public class Triangulo {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double base;
        int altura;

        System.out.print("Ingrese la base del triángulo: ");
        base = input.nextInt();

        System.out.print("Ingrese la altura del triángulo: ");
        altura = input.nextInt();

        double area = base * altura / 2;

        System.out.println("El área de triángulo es: " + area);
        input.close();
    }
}
