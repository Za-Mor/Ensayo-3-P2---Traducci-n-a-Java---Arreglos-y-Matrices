
package ejercicio_9;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int[][] num = new int[5][5]; 
      int mayor;
      int menor;
    
      System.out.println("Bienvenido");
      System.out.println("---------------");
     
      System.out.println("ingrese un valor entero para la posicion: [1] [1]"); 
      num[0][0] = sc.nextInt();
      mayor = num[0][0];
      menor = num [0][0];
     
        for (int i=1 ; i< num.length; i++) {
           for (int j=0 ; j<num[i].length; j++) {
             
               System.out.println("ingrese un valor entero para la posicion: [" + (i + 1)+"] " + "["+ (j +1)+ "]"); 
               num[i][j] = sc.nextInt();
               
               if (num [i][j] >= mayor) {
                   mayor = num [i][j];         
                    }
               
                      if (num [i][j]  <= menor) {
                      menor = num [i][j];
         
                     }
                     
            }

        }
        
       System.out.println("------");   
       System.out.println("el numero menor es: " + menor );
       System.out.println("el numero mayor es: " + mayor );
       
    }
    
}
