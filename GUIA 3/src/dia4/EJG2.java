
package dia4;

import java.util.Scanner;

/**
  @author Matias Insaurralde
 */
public class EJG2 {

    public static void main(String[] args) {
   
    Scanner ingresa = new Scanner(System.in);    
     
    int cc=0;
    int ci=0;
    int l;
    
    String cadenas,letras,x,o;


do{
    
    System.out.println("===================== \n Dispositivo RS232 \n=====================\nIngrese las cadenas ");
    
    cadenas=ingresa.next().toLowerCase();    
   
    l=cadenas.length();   
   
    x= cadenas.substring(0,1);
    o= cadenas.substring(l-1);
  
   if( l <=5 && "x".equals(x) && "o".equals(o) ){
   
   cc=cc+1;
    
   }else if("&&&&&".equals(cadenas)){
   
       }    
   
   
   else{ ci=ci+1;}
   
  
 
    
    } while (!"&&&&&".equals(cadenas));

System.out.println("==============Lecturas Correctas : " +cc+ " \nLecturas Incorrectas :" +ci);

    
    }

    }
    

