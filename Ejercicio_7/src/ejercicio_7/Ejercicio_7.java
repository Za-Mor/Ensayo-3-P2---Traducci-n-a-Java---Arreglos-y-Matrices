
package ejercicio_7;

/**
 *
 * @author Janina Fernanda Zari
 */
import java.util.Scanner;
public class Ejercicio_7 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
     int[][] num = new int[4][4]; 
     int suma = 0;
     
     System.out.println("Bienvenido");
     System.out.println("---------------");
     
     for (int i=0 ; i< num.length; i++) {
           for (int j=0 ; j<num[i].length; j++) {
               
               System.out.println("ingrese un valor entero para la posicion: [" + (i + 1)+"] " + "["+ (j +1)+ "]"); 
               num[i][j] = sc.nextInt();
               
               suma += num[i][j];
           }
        }
    
             System.out.println("La suma total de todos los elementos es: " + suma);
            
             
     
    }
    
    
}
