
package bcg.online02;
import java.util.Scanner;
/**
 *
 * @author guillermoberenguel
 */
public class Ex10 {
    public static void main (String[]args){
    Scanner sc =new Scanner(System.in);
    int opcion;
    double num1,num2,res;
System.out.println("Introducir el primer numero");
num1= sc.nextDouble();
System.out.println("Introducir el segundo numero");
num2= sc.nextDouble();

        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Salir");

        System.out.println("Introduzca la opcion");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Suma");
                res=num1+num2;
                System.out.println("El resultado es "+res);
                break;
            case 2:
                System.out.println("Resta");
                res=num1-num2;
                System.out.println("El resultado es "+res);
                break;
            case 3:
                System.out.println("Multiplicacion");
                res=num1*num2;
                System.out.println("El resultado es "+res);
                break;
            case 4:
                System.out.println("Division");
                res=num1/num2;
                System.out.println("El resultado es "+res);
                break;
            case 5:
                System.out.println("salir");
                break;
            default:
                System.out.println("ESte numero no coincide con ninguna de las opciones");
                break;
        }

    
    }
    
}
