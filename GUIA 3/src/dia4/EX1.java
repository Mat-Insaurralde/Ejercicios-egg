
package dia4;

import java.util.Scanner;

/**
  @author Matias Insaurralde
 */
public class EX1 {
    
    public static void main(String[] args) {
     
        //Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
        //si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
    
    Scanner ingresa = new Scanner(System.in);
    int nt,d = 0,h = 0;
        
    
    System.err.println("Ingrese los minutos :");
        
    nt=ingresa.nextInt();
    
    
    while(nt>=1440){
    
        if(nt>=1440){d=d+1;nt=nt-1440;}else{}
        
    }
    
     while(nt>=60){
    
        if(nt>=60){h=h+1;nt=nt-60;}
        else{}
    }
    System.err.println("Los minutos equivalen a : \nDIAS: "+d+" \nHORAS: "+h );
    
    
    
    
    
    }
    
}
