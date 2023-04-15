
package dia4;

import java.util.Scanner;

/**
 *
 * @author Matias Insaurralde
 */
public class EX4 {

    
    public static void main(String[] args) {
       //Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.

    Scanner ingresa=new Scanner (System.in);
    
    int n;
    
    System.out.println("Ingrese un numero del 1 al 10");
    
    n=ingresa.nextInt();
    
   
    if(n>0&&n<10){
    
      
    switch(n){
   
    case 1:  System.out.println("1=I");
    break;
    case 2:  System.out.println("2=II");
    break;
    case 3:  System.out.println("3=III");
    break;
    case 4:  System.out.println("4=IV");
    break;
    case 5:  System.out.println("5=V");
    break;
    case 6:  System.out.println("6=VI");
    break;
    case 7:  System.out.println("7=VII");
    break;
    case 8:  System.out.println("8=VIII");
    break;
    case 9:  System.out.println("9=IX");
    break;
    case 10:  System.out.println("10=X");
 
    
    }
    }else{System.out.println("El numero es Incorrecto!!");}
  
   
   
   
   
   
   }
    
    
    
    
    
    
    
    
    
    
    
    }
    

