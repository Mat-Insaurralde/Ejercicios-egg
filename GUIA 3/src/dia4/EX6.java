
package dia4;

import java.util.Scanner;

/**
 *
 * @author Matias Insaurralde
 */
public class EX6 {

   
    public static void main(String[] args) {
 //Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general
    
 Scanner ingresa = new Scanner(System.in);   
    
 
       int  np,em = 0;       
float estatura,suma = 0,esm = 0;
 
 
 
 System.out.println("Ingrese el numero de personas: ");   
    
 np=ingresa.nextInt();   
    
 
 
 
 for (int i = 0; i < np; i++) {
            
       
 System.out.println("Ingrese la estatura de la persona");   
    
 estatura=ingresa.nextFloat();
 
 
 suma=suma+estatura;      
 
 if (estatura < 1.60 ) { 
     
     esm=estatura+esm;
     
     em=em+1;
 }else{}
 
 }   
       
  System.out.println("el promedio de estatura menor a 1.60 es: "+esm/em); 
    
  System.out.println("el promedio de estatura general es: "+suma/np); 






 
    
    }
    
}
