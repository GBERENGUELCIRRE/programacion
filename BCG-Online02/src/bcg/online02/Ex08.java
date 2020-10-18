
package bcg.online02;
import java.util.Scanner;
import java.io.*;
/**
 *
 * @author guillermoberenguel
 */
public class Ex08 {
    public static void main (String[]args)throws IOException{
    int i,num,res;
    char s;
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("Introduzca el numero para tabla multiplicar");
        num = sc.nextInt();
        for (i=0;i<=10;i++){
            res=num*i;
        System.out.println(+num+"X"+i+"="+res);
        } //HE TENIDO QUE CONSULTAR EN INTERNET LA PARTE DE LA PREGUNTA,
        //PROBE CON EL TRY Y CATCH Y NO ME SALIA BIEN
        System.out.println("¿Quieres mostrar otra tabla de multiplicar?");
        s = (char)System.in.read();
        }while(s=='S'||s=='s');      
  }
    }
    

