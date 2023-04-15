
package dia4;

// @author Matias Insaurralde

import java.util.Scanner;


public class EJ6 {

    public static void main(String[] args) {
     
        Scanner ingresa = new Scanner(System.in);
        
        int n1,n2;
        
        System.out.println("Ingresar dos numeros enteros: ");
        
        n1 = ingresa.nextInt();
        n2 = ingresa.nextInt();
        
        if (n1>25&&n2>25){
            System.out.println("Los dos numeros son mayores a 25! ");
         }
        
        else if (n1>25){
        System.out.println("El numero "+n1+" es mayot a 25");
        }
         
        else if (n2>25){
        System.out.println("El numero "+n2+" es mayot a 25");
        }
        
         else {System.out.println("Ninguno de los dos numeros ingresados son mayores a 25 ");}
        
        
        
        
    
    
    
    
    
    }
    
}
