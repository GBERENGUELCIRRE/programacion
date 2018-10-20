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
public class Ex10 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = 0, contador = 1;
        try {
            System.out.println("Introduce el numero");
            num = sc.nextInt();

            for (contador = 1; contador < num; contador++) {
                if (num % contador == 0) {
                    System.out.print(" " + contador);
                }
            }
        } catch (Exception e) {
            System.out.println("Introduzca un nuevo numero");
        }
    }
}
