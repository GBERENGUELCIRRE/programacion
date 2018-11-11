/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BGCIndiv03;

import java.util.Scanner;

/**
 *
 * @author guillermoberenguel
 */
public class BGCIndiv03 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       Usuario usuario1=new Usuario ("Pedro","Perez Perez",31);
       Producto producto1=new Producto ("HDD40SAM","DISCO DURO", 5);
       Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("1.Datos Empleado");
        System.out.println("2.Datos Producto");
        System.out.println("3.Salir");
        System.out.println("Introduzca la opcion");
         try{
        opcion = sc.nextInt();
       
        switch (opcion) {
            case 1:
                System.out.println("Datos Empleado");
                System.out.println("Nombre: "+usuario1.getNombre());
                System.out.println("Apellidos: "+usuario1.getApellidos());
                System.out.println("Edad: "+usuario1.getEdad());
                break;
            case 2:
                System.out.println("Datos Producto");
                System.out.println("Referencia: "+producto1.getReferencia());
                System.out.println("Nombre: "+producto1.getNombre());
                System.out.println("Unidades: "+producto1.getUnidades());
                break;
            case 3:
                System.out.println("Salir");
                break;
            default:
                System.out.println("Este numero no coincide con ninguna de las opciones");
                break;
        }
        }
        catch (Exception e) {
            System.out.println("Introduzca de nuevo los numeros");
        }
    }
}
