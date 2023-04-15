
package dia4;

import java.util.Scanner;

/**
 *
 * @author Matias Insaurralde
 */
public class EX7 {

    
    public static void main(String[] args) {
        //Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
        //Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.
    
    Scanner ingresa = new Scanner(System.in);   
    
 
       int  n,valor,cont = 0,NMenor = 0,NMayor = 0,promedio = 0;
 
 
 
 System.out.println("Cuantos numeros desea ingresa? ");   
    
  n=ingresa.nextInt();   
  
  
  
  while(cont!=n ){  
  System.out.println("Ingrese un numero: ");      
  valor=ingresa.nextInt();  
  promedio=promedio+valor ;    
    
  if(cont==0){NMenor=valor; NMayor=valor;}
  
  else if(valor<NMenor){NMenor=valor;}
  
  if(valor>NMayor){ NMayor=valor; }
  
  
    
    
      
        
  cont=cont+1;      
  }
        
        
     System.out.println("Valor maximo "+NMayor);       
     System.out.println("Valor minimo "+NMenor);       
     System.out.println("Promedio de los numeros:" +promedio/n);     
        
        
        
        
        
    
    }
    
}
