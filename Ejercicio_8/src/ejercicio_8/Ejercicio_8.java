
package ejercicio_8;

/**
 *
 * @author Janina Fernanda Zari
 */
import java.util.Scanner;
public class Ejercicio_8 {

   
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
               
              }
       }
     System.out.println("------");   
     for (int i=0 ; i<  num.length ; i++) {
           for (int j=0 ; j< num[i].length; j++) {
             
               if ( i == j){
                System.out.print( num[i][j] + " "); 
                 suma += num[i][j];
               } else {
                
               System.out.print( " ");
               }
               
            } 
            System.out.println(" "); 
              
        }
    
      System.out.println("------");   
     System.out.println("La suma de la diagonal es: " +suma );
    }
    
}
