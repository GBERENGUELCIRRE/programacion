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
public class Ex05 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int opcion;
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
                break;
            case 2:
                System.out.println("Resta");
                break;
            case 3:
                System.out.println("Multiplicacion");
                break;
            case 4:
                System.out.println("Division");
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
