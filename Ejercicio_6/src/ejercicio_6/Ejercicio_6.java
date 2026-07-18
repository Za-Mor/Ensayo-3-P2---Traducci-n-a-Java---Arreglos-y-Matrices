
package ejercicio_6;

/**
 *
 * @author Janina Fernanda Zari
 */
import java.util.Scanner;
public class Ejercicio_6 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
     
      int[][] num = new int [3][4];
       
       System.out.println("Bienvenido");
       System.out.println("---------------");
      
       for (int i=0 ; i< num.length; i++) {
           for (int j=0 ; j<num[i].length; j++) {
               
               System.out.println("ingrese un valor entero para la posicion: [" + (i + 1)+"] " + "["+ (j +1)+ "]"); 
               num[i][j] = sc.nextInt();
               
           }
        }
       
        for (int i=0 ; i<  num.length ; i++) {
           for (int j=0 ; j< num[i].length; j++) {
             
             System.out.print( num[i][j] + " "); 
               
               
           }
          System.out.println(" "); 
        }
          
    }
    
    
    
}
