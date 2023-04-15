
package dia4;

import java.util.Scanner;

/**
  @author Matias Insaurralde
 */
public class EJ5 {
    
    public static void main(String[] args) {
      
    Scanner ingresa = new Scanner(System.in); 

    int vl,suma = 0,n;
    
    System.out.println("Ingrese un limiite positivo : ");
    
    vl=ingresa.nextInt();
    
    
    
    while(suma<vl){
    
    System.out.println("Ingrese numeros a sumar ");
    
    n=ingresa.nextInt();
    
      suma=suma+n;
    }
    System.out.println("La suma de los numeros es : "+suma);
    
    }
    
}
