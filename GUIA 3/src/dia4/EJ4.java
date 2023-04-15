
package dia4;

import java.util.Scanner;

/**
  @author Matias Insaurralde
 */
public class EJ4 {

 
    public static void main(String[] args) {
         Scanner ingresa = new Scanner(System.in);
    
    String pl;     
    String f;
    String c="a";
    
    System.out.println("Ingresa una palabra o frase ");
        
    f=ingresa.next().toLowerCase();
 
    pl=f.substring(0,1);
    
    if(pl.equals(c)){
    System.out.println("CORRECTO!!");
    } else { 
    System.out.println("INCORRECTO!!");
            }
    
    }
} 

