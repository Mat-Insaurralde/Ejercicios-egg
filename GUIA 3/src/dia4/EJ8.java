
package dia4;

import java.util.Scanner;

/*
  @author Matias Insaurralde
 */
public class EJ8 {

    
    public static void main(String[] args) {
    
   //Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

    Scanner ingresa = new Scanner(System.in);    
   
    int nota=0;
    
    System.out.println("Ingresar una nota entre 0 y 10 ");
    
    nota = ingresa.nextInt();
        
    while(nota>10){
        
    System.out.println("Nota no valida ingresar otra ");
    
    nota = ingresa.nextInt();
    
    
    }    
        
   
        
       
        
    }
    
}
