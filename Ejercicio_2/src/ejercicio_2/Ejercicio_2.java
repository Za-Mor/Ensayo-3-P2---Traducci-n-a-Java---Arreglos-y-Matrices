
package ejercicio_2;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_2 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
     double[] num = new double[10];
     double suma = 0;
     double prom;
     
      System.out.println("Bienvenido");
      System.out.println("---------------");
     
     for ( int i=0; i<10; i++) {
       System.out.println("Ingrese un numero real para la posicion " + (i+1) + ":" );
         num[i] = sc.nextDouble();
         suma = (suma + num[i]);
     
     } 
     
     prom = (suma/10);
     
     System.out.println("---------------");
     
     System.out.println("Suma total: " +suma);
     System.out.println("promedio: " +prom);
      
    }
    
}
