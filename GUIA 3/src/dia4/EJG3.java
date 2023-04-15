
package dia4;

import java.util.Scanner;

/**
  @author Matias Insaurralde
 */
public class EJG3 {
    
    public static void main(String[] args) {
    Scanner ingresa = new Scanner(System.in);
    
    int n;
    
    System.out.println("Ingresa numero del cuadrado: ");
    
    n=ingresa.nextInt();
    
    //linea superior
    for(int i=0 ;i<n ;i++) {
    
    System.out.print(" *");
     }
    System.out.println();
    
    ///CENTROOOOOO
    for(int i=0 ;i<n-2 ;i++) {
    
    System.out.print(" * ");
    
    for(int j=0 ;j < n-2 ;j++) {
     System.out.print("  ");   
    } 
    System.out.println("* "); 
    
    }
     
    
    
  
    ///linea inferior
    for(int i=0 ; i < n ; i++) {
    
    System.out.print(" *");
     }

    
    }
    }

