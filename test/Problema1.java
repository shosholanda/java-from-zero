import java.util.Scanner;

public class Problema1 {
    
    public static void main (String[] args){
  	Scanner input = new Scanner(System.in);

	  int a;
	  int b;
	  int c;
	  double solucionP;
	  double solucionN;

	  System.out.println("Ingrese el valor de a: ");
	  a = input.nextInt();

	  System.out.println("Ingrese el valor de b: ");
	  b = input.nextInt();

	  System.out.println("Ingrese el valor de c: ");
	  c = input.nextInt();

	  input.close();

	  solucionP = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/ (2*a);
	  solucionN = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/ (2*a);

	  System.out.println("Soluciones:");
	  System.out.print("X_1: ");
	  System.out.println(solucionP);
	  System.out.println("X_2: " + solucionN);
    }
}
