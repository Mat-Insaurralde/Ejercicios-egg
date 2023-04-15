
package dia4;

import java.util.Scanner;

/* @author Matias Insaurralde
 */
public class EJ7 {
    
    public static void main(String[] args) {
        
    Scanner ingresa = new Scanner(System.in);
    
    int tipomotor;
    
    System.out.println("Ingresa el tipo de motor del 1 al 4 :");
    
    tipomotor=ingresa.nextInt();
    
    switch (tipomotor){
 
    case 1:
        System.out.println("La bomba es una bomba de agua");
            break;
    
    case 2:
        System.out.println("La bomba es una bomba de gasolina");
                break;
    
    case 3:
        System.out.println("La bomba es una bomba de hormigon");
        break;
    
    case 4:
        System.out.println("La bomba es una bomba de pasta alimenticia");
        break;
    
    default:
        System.out.println("No existe un valor válido para tipo de bomba");
    }
      
        
    }
    
}
