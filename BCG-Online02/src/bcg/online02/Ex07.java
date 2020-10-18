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
public class Ex07 {
     public static void main (String[]args){
        int i,num,res;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca el numero para tabla multiplicar");
        num = sc.nextInt();
        for (i=0; (i<11); i++){
            res=num*i;
                System.out.println(+num+"X"+i+"="+res);
        } 
        }
}
