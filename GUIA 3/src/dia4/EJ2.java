
package dia4;

import java.util.Scanner;

/**
  @author Matias Insaurralde
 */
public class EJ2 {

    public static void main(String[] args) {
      
//Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java.

Scanner ingresa = new Scanner(System.in);

String f,c;

c="eureka";

System.out.println("Ingrese una frase");

f=ingresa.next();

if (f.toLowerCase().equals(c)){System.out.println("correcto");
    
} else {System.out.println("Incorrecto ");}
        
  
    
    }
    }
    
    
  
