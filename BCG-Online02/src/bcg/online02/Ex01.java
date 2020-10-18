package bcg.online02;
import java.util.Scanner;
/**
 *
 * @author guillermoberenguel
 */
public class Ex01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.println("Introducir numero");
        num1=sc.nextInt();
        if (num1>=0){
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }
    }
    
}
