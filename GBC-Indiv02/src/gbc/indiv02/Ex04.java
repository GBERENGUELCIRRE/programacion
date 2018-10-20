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
public class Ex04 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, resta, suma, multi;
        System.out.println("Introduzca el primer numero");
        num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = sc.nextInt();
        if (num1 > num2) {
            resta = num1 - num2;
            System.out.println("El resultado de la resta es: " + resta);
        } else if (num1 < num2) {
            suma = num1 + num2;
            System.out.println("El resultado de la suma es: " + suma);
        } else {
            multi = num1 * num2;
            System.out.println("El resultado de la multiplicacion es: " + multi);
        }
    }

}
