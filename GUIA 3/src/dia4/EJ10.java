
package dia4;

import java.util.Scanner;

/**
  @author Matias Insaurralde
 */
public class EJ10 {
    
    public static void main(String[] args) {
    
    int n=0;    
    int cont=0;    
    Scanner ingresa = new Scanner(System.in);   
    
    System.out.println("Ingresa 4 numeros (entre el 1 y 20)");
    
   do{
    
    n=ingresa.nextInt();
    
    System.out.print(""+n+ "");
    
    for (int i = 0; i < n; i++){
    
    System. out. print ("*");}
    
    cont=cont+1;
   
                       
   } while (cont<4);
   
    
    }
    
    }
    

