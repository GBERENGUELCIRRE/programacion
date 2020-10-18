
package bcg.online02;
import java.util.Scanner;
/**
 *
 * @author guillermoberenguel
 */
public class Ex03 {
    public static void main (String[]args){
        Scanner sc= new Scanner(System.in);
        int num1,num2;
        System.out.println("Introducir primer numero");
        num1=sc.nextInt();
        System.out.println("Introducir segundo numero");
        num2=sc.nextInt();
        if(num1!=num2){
            if(num1>num2){
                System.out.println("El primer numero es mayor");
            }
            else{
                System.out.println("El segundo numero es mayor");
            }
        }
        else{
            System.out.println("los numeros son iguales");
        }
    }
}
