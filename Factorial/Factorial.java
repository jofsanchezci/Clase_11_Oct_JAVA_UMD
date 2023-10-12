import java.util.Scanner;
public class Factorial {

  
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double numero = teclado.nextDouble();
        teclado.close();
        System.out.println("\nEl factorial de " + numero + " es: " + factorial(numero));
    }
    
    public static double factorial(double numero) {
        //caso base
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero-1);
    }
    
}