package ejercicio_1;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] num = new int[10];
       
         System.out.println("Bienvenido");
         System.out.println("---------------");
       
       for ( int i=0; i<10; i++) {
       
        System.out.println("Ingrese un numero entero para la posicion " + (i+1) + ":" );
         num[i] = sc.nextInt();
           
       }
        System.out.println("---------------");
        
        for ( int i=0; i<10; i++) {
       
        System.out.println("posicion " + (i+1) + ": " + num[i] );
       
        }
   }
}
