
package ejercicio_5;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_5 {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int [] num = new int[12];
      int ingre;
      
      System.out.println("Bienvenido");
      System.out.println("---------------");
      
      
      for ( int i=0; i<12; i++) {
        System.out.println("Ingrese un numero positivo para la posicion " + (i+1) + ": ");
           ingre = sc.nextInt();
           
           while (ingre <= 0) {
                System.out.println("ERROR: El numero debe ser positivo. Intente de nuevo:");
                ingre = sc.nextInt();
            }
             
           num[i] += ingre + (i+1);
         }   
      
      System.out.println("---------------");
     
      for ( int i=0; i<=12; i++) {
      System.out.println("posicion " + (i + 1) + ": " + num[i]);
    }
   }
}