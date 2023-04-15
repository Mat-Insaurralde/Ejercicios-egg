
package dia4;

import java.util.Scanner;

/**
  @author Matias
 */
public class EJ1 {

     public static void main(String[] args) {

// Crear un programa que dado un número determine si es par o impar.
  Scanner ingresa = new Scanner(System.in);
     
  int n=0;
  
  System.out.println("Ingrese un numero");
    
  n=ingresa.nextInt();
  
  if (n%2 !=0) {
  
   System.out.println("Este numero es impar"); 
  }
   else
    System.out.println("Este numero es par");   
           
        
    
    
    }
    
}