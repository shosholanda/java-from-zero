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
