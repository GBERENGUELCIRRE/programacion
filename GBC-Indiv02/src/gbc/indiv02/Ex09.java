/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gbc.indiv02;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author guillermoberenguel
 */
public class Ex09 {

    public static void main(String args[]) {
        try {
            Scanner sc = new Scanner(System.in);
            int num = 0, i, multi;

            System.out.println("Introducir numero");

            num = sc.nextInt();

            for (i = 1; i < 11; i++) {
                multi = num * i;
                System.out.println(" " + num + " * " + i + " = " + multi);
            }
        } catch (Exception e) {
            System.out.println("Introduzca un nuevo numero");
        }
    }
}
