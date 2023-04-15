
package dia4;

import java.util.Scanner;

/**
 *
 * @author Matias Insaurralde
 */
public class EX5 {

   public static void main(String[] args) {
       

    Scanner ingresa=new Scanner (System.in);
    
    char L;
    double monto;
    System.out.println("Ingrese la clase de socio A , B o C ");
    
    L=ingresa.next().charAt(0);
    
     
    switch(L){
   
    case 'a':  System.out.println("Ingrese el valor del Tratamiento: ");
    monto=ingresa.nextInt();
    
    System.out.println("Con el 50% de descuento pagas : $ "+ (monto-(0.5*monto)) );
    break;
    case 'b':  System.out.println("Ingrese el valor del Tratamiento: ");
    monto=ingresa.nextInt();
    System.out.println("Con el 35% de descuento pagas: $ "+(monto-(0.35*monto)) );
    break;
    
    case 'c':  System.out.println("Ingrese el valor del Tratamiento: ");
    monto=ingresa.nextInt();
    System.out.println("No posee descuento pagas : $ "+monto );
    
    
    }
    

   }
}