


import java.util.Scanner;


 // @author Matias Insaurralde
 
public class EJE5 {

   
    public static void main(String[] args) {
   
      //Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
      //Nota: investigar la función Math.sqrt().
 Scanner ingresar = new Scanner(System.in);
     
 System.out.println("Ingrese un numero entero");
        
 int n=0;
 
 
 n = ingresar.nextInt(); 
 
 double nd = n;
        
 System.out.println("El doble de "+ n + " es " + n*2 );      
 
 System.out.println("El triple de "+ n + " es " + n*3 ); 
 
 System.out.println("La raiz cuadrada de "+ n + " es " + Math.sqrt(nd) ); 
        
        
        
        
        
        
        
        
    }
    
}
