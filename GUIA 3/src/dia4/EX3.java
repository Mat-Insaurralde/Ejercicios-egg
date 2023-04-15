
package dia4;

import java.util.Scanner;

/**
 *
 * @author Matias Insaurralde
 */
public class EX3 {

  
    public static void main(String[] args) {
    
   // Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje. 
            //Nota: investigar la función equals() de la clase String.
  Scanner ingresa =new Scanner(System.in);
          
  String l;
  char letra ='a';
  
  System.err.println("Ingrese una letra:"); 
    
  l=ingresa.next();  
    
  switch(l){
      
      case "a":
          System.out.println("Es una vocal");
         break;
      
      case "e":
          System.out.println("Es una vocal");
         break;
      case "i":
          System.out.println("Es una vocal");
         break;
      case "o":
          System.out.println("Es una vocal");
         break;
      case "u":
          System.out.println("Es una vocal");
         break;
     
      default:
          System.out.println("No es una vocal");
         break;
      
      
      
      
      
  } 
  
  
  
  
  
  
  
    
    
    
    
    
    
    
    
    
    
    }
    
}
