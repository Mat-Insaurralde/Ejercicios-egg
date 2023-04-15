
package dia7;

import java.util.Scanner;


/**
  @author Matias
 */
public class EJ1 {
    
    public static void main(String[] args) {
    Scanner ingresa=new Scanner (System.in);    
    String blanco = null,palabra,letra; 
    
    
    
    
    System.out.println("Ingrese la palabra");
    
    palabra=ingresa.next().toLowerCase();
    
    int longitud=palabra.length();
    
    for(int i=0 ; i<=longitud-1 ; i++){
    
    letra=palabra.substring(i, i+1);
    
    switch(letra){
    case "a":
    
    letra="".concat("@");
    break;
    case "e":
    letra="".concat("#");
    break;
    case "i":
    letra="".concat("$");
    break;
    case "o":
    letra="".concat("%");
    break;
    case "u":
    letra="".concat("*"); 
    break;
    } 
    
    
    
    
    
    System.out.print(letra);
        
        
        
        
    }
    
    
    }
    
}
