/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bcg.online02;
import java.util.Scanner;
/**
 *
 * @author guillermoberenguel
 */
public class Ex09 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un número entero positivo: ");
            num= sc.nextInt();
            if(num<=0){
                System.out.println("Debe introducir un número positivo");
            }
        }while(num<=0);
        
        //Mostrar los múltiplos de N desde 1 hasta M
        System.out.println("Divisores de " + num + ":");
        for (int i = 1;i<num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
    
    

