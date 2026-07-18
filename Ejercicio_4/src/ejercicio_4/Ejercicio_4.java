
package ejercicio_4;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_4 {

    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      int [] num = new int[20];
      int canPosi= 0;
      int canNega= 0;
      int sumaPar =0;
      int sumaIm = 0;
      
      System.out.println("Bienvenido");
      System.out.println("---------------");
      
      for ( int i=0; i<15; i++) {
          
       System.out.println("Ingrese un numero entero para la posicion " + (i+1) + ": ");
           num[i] = sc.nextInt();
           if (num[i] != 0) {
              
            if (num[i]%2 == 0) {
               canPosi++;
               sumaPar += num[i];
               
            } else {
              canNega++;
              sumaIm += num[i];
            }
          }       
        }
      System.out.println("---------------");
      System.out.println("Cantidad de numeros pares: " + canPosi);
      System.out.println("Cantidad de numeros impares: " + canNega);
      System.out.println("Suma de los pares: " + sumaPar);
      System.out.println("Suma de los impares: " + sumaIm);
    }
    
}
