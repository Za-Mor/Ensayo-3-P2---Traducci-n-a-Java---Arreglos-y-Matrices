package ejercicio_3;

/**
 *
 * @author Janina Fernanda Zari Mora
 */
import java.util.Scanner;
public class Ejercicio_3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
     int[] num = new int[15];
     int mayor;
     int posiMa;
     int posiMe;
     int menor;
     
      System.out.println("Bienvenido");
      System.out.println("---------------");
      
      System.out.println("Ingrese un numero entero: ");
      num[0] = sc.nextInt();
      mayor = num[0];
      menor = num[0];
      posiMa = num[0];
      posiMe = num[0];
      
     for ( int i=1; i<15; i++) {
       System.out.println("Ingrese otro numero entero: " );
         num[i] = sc.nextInt();
         
            if (num[i] >= mayor) {
                mayor = num[i]; 
                posiMa = (i + 1);
             }    
               if (num[i] <= menor) {
                menor = num[i];    
                posiMe = i + 1;
               }

            }
       
         }  
     
      System.out.println("-----------------------");
      System.out.println("Numero mayor: " + mayor + " (Encontrado en la posicion: " + posiMa + ")");
      System.out.println("Numero menor: " + menor + " (Encontrado en la posicion: " + posiMe+ ")");
     
     }
    
}
