
package dia4;

import java.util.Scanner;

/*
 @author Matias Insaurralde
 */
public class EJ9 {
   // Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
    //El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
    public static void main(String[] args) {
    
    Scanner ingrese = new Scanner(System.in);
    
    int n,suma,cont;
    suma=0;
    cont=0;
    System.out.println("Ingrese 20 numeros a sumar.. Para finalizar precionar 0 ");

    do {
    
    n=ingrese.nextInt();
    
    if(n>0){
    
    suma=n+suma;
    
    }
        
    cont=cont+1;
    
    } while  (n!=0&&cont!=20);   
        
   
     System.out.println("Se capturo el cero!! La suma de los numeros leidos es "+suma);
    
    
    
    
    
    
    }
    
}
