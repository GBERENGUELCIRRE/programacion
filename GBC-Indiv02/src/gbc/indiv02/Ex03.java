/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gbc.indiv02;

import java.util.Scanner;

/**
 *
 * @author guillermoberenguel
 */
public class Ex03 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca el primer numero");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("El primer numero es mayor");
        } else if (num1 < num2) {
            System.out.println("EL segundo numero es mayor");
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
