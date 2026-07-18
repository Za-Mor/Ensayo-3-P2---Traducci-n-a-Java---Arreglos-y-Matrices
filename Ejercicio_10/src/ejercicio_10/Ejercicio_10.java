
package ejercicio_10;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_10 {

 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
      int[][] num = new int[3][5]; 
      int suma;
      int fila;
      int colu;
      
      System.out.println("Bienvenido");
     System.out.println("---------------");
     
     for (int i=0 ; i< num.length; i++) {
           for (int j=0 ; j<num[i].length; j++) {
               
               System.out.println("ingrese un valor entero para la posicion: [" + (i + 1)+"] " + "["+ (j +1)+ "]"); 
               suma = sc.nextInt();
               
                fila = i + 1;
                colu = j + 1;
                num [i][j] = suma + ( fila * colu);
              }
       }
     System.out.println("------");   
     for (int i=0 ; i<  num.length ; i++) {
           for (int j=0 ; j< num[i].length; j++) {
             
               System.out.print( num [i][j]+ " " );
               
               
            } 
            System.out.println(" "); 
              
        }
    
      System.out.println("------");    
       
    }
}  

