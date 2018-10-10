package GBCirre;
    import java.util.Scanner;
public class Ejercicio01 {
    public static void main(String[] args) {
        int edad=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("Introducir la edad");
        edad = sc.nextInt();
        if (edad < 18){
            System.out.println("Es menor de edad");
            
        }
        else{
            System.out.println("es mayor de edad");
        }

   
    }
}
