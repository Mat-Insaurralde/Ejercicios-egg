
package dia4;

import java.util.Scanner;

/**
 *
 * @author Matias Insaurralde
 */
public class EX10 {

   
    public static void main(String[] args) {
      /// Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
      //Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.

   Scanner enter= new Scanner(System.in);
    
   int mul,n = 0; 
    
   mul=(int)(Math.random()*10) * (int)(Math.random()*10);
    
        System.out.println("JUEGO DE ADIVINANZA!!");
        System.out.println("======================");
        
        System.out.println(mul);
      
   System.out.println("Ingrese un numero buena suerte!!!");
   
   n=enter.nextInt();
    while(n!=mul){   
        System.out.println("Numero incorrecto ingrese otro!");
        n=enter.nextInt();
   
   }
    if(n==mul){System.out.println("Enhorabuena Has encontrado el numero correcto!!");}
    
    
    
    
    
    
    
    
    
    }
    
}
