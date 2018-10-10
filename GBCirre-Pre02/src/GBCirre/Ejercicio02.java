
package GBCirre;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main (String [] args){
        int numero=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introducir numero");
        numero = sc.nextInt();
        if (numero%2==0) {
            System.out.println("EL numero es par");
            
        }
        else{
            System.out.println("El numero es impar");
        }
        
        
}
}