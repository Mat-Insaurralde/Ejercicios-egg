
package dia4;

import java.util.Scanner;

/**
 *
 * @author Matias Insaurralde
 */
public class EX8 {

    
    public static void main(String[] args) {
        // Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números impares. 
        //Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
    
    Scanner ingresa = new Scanner(System.in);
    
       
  int n = 0; 
   
  int conp = 0,coni = 0,conn = 0; 
   

   do{  
  
  System.out.println("Ingrese numeros enteros: ");
    
  n=ingresa.nextInt();
    

  if(n>0){
  conn=conn+1;
    
 if(n%2==0){conp=conp+1;}else{coni=coni+1;}
  }
  }while(n%5!=0);
  
           
   System.out.println("Total de numeros leidos: "+conn );
   System.out.println("Total de numeros pares: "+conp );
   System.out.println("Total de numeros impares: "+coni );
   
    
    
    }
    
}
