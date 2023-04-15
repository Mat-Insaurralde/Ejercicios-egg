


import java.util.Scanner;


 // @author Matias Insaurralde
 
public class EJE3 {

    
    public static void main(String[] args) {
     ///Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
     //Nota: investigar la función toUpperCase() y toLowerCase() en Java.

     Scanner ingresa = new Scanner (System.in);
  
     String frase;      

     System.out.println("Ingese una frase");

     frase = ingresa.next(); 
     
     System.out.println("Minusculas");
     
     System.out.println(frase.toLowerCase());

     System.out.println("Mayusculas");
     
     System.out.println(frase.toUpperCase());
    }
    
}
