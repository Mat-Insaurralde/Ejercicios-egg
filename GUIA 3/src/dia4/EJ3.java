
package dia4;

import java.util.Scanner;

/**
  @author Matias Insaurralde
 */
public class EJ3 {
    
    public static void main(String[] args) {
        
    Scanner ingresa = new Scanner(System.in);
    
    String f="";
    
    System.out.println("Ingresa una palabra o frase de 8 de largo");
    
    
    while (f.length()!=8) {
        
    f=ingresa.next();

    if (f.length()!=8){
    

    System.out.println("Incorrecto");}

   else
   
    System.out.println("Correcto");
    
    
    
    }
    }
    
}
