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
public class Ex02 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Introducir numero");
        num = sc.nextDouble();
        if (num > 0) {
            System.out.println("El numero es positivo");
        } else if (num < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es 0");
        }

    }
}
