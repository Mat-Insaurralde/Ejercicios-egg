
import java.util.Scanner;




 
 // @author Matias Insaurralde
 
public class EJ1 {
    
    public static void main(String[] args) {
    //Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. El programa deberá después mostrar el resultado de la suma
  Scanner leer = new Scanner(System.in);      
 int resul,num1,num2;
 resul=0; 
 num1=0;
  num2=0;
  System.out.println("Ingrese un numero: ");
  
  num1 = leer.nextInt(); 
  
  System.out.println("Ingrese otro numero: ");
  
  num2 = leer.nextInt();
  
  resul = num1+num2;

////  System.out.println("La suma de los numeros es : " + resul);





    }
    
}
