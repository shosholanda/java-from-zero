import java.util.Scanner;

public class Ahorro {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        double cantidadAhorro;
        int cantidadMeses;
        double totalAhorro;

        System.out.print("Ingresar la cantidad a ahorrar en punto decimal: ");
        cantidadAhorro = input.nextDouble();
        System.out.print("Ingresar la cantidad de meses a ahorrar: ");
        cantidadMeses = input.nextInt();
        
        totalAhorro = cantidadAhorro * cantidadMeses;

        input.close();

        System.out.print("El ahorro total es de: ");
        System.out.println(totalAhorro);
    }
}