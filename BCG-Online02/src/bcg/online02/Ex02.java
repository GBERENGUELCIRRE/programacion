
package bcg.online02;
import java.util.Scanner;
/**
 *
 * @author guillermoberenguel
 */
public class Ex02 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introducir numero");
        num=sc.nextInt();
        if (num!=0){
            if (num<0){
            System.out.println("El numero es negativo");
            }
            else if(num>0){
            System.out.println("El numero es positivo");
        }
        }
        else {
            System.out.println("el numero es cero");
        }
        
    }
}
