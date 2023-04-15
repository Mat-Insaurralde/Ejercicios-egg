
package EX3;

import java.util.Scanner;


public class Juego {
Scanner enter=new Scanner(System.in);

//ATRIBUTOS

public int adivi,intentos,n,jg1,jg2,ni;


//CONTRU

    public Juego() {
    }

    public Juego(int adivi, int intentos, int n, int jg1, int jg2, int ni) {
        this.adivi = adivi;
        this.intentos = intentos;
        this.n = n;
        this.jg1 = jg1;
        this.jg2 = jg2;
        this.ni = ni;
    }
    
    
    
 ///GETTERSANDSETTERS   

    public Scanner getEnter() {
        return enter;
    }

    public void setEnter(Scanner enter) {
        this.enter = enter;
    }

    public int getAdivi() {
        return adivi;
    }

    public void setAdivi(int adivi) {
        this.adivi = adivi;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getJg1() {
        return jg1;
    }

    public void setJg1(int jg1) {
        this.jg1 = jg1;
    }

    public int getJg2() {
        return jg2;
    }

    public void setJg2(int jg2) {
        this.jg2 = jg2;
    }

    public int getNi() {
        return ni;
    }

    public void setNi(int ni) {
        this.ni = ni;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    
    
  
    
    
   
    
    ///METODOS

public void iniciar_juego(){
    System.out.println("JUEGO DE ADIVINANZA");
    System.out.println("-------------------");
    System.out.println("");
    
    System.out.println("JUGADOR 1 ");
    System.out.println("Ingresa un numero: "); adivi= enter.nextInt();
    System.out.println("");
    System.out.println("Ingresa el numero de intentos de JUGADOR 2:");intentos=enter.nextInt();
     



}
  int c=0;  
    
 public void adivinanza(){
     System.out.println(""); 
     System.out.println("-------------------------------------------");
     System.out.println("");
     System.out.println("JUGADOR 2 ADIVINA EL NUMERO!!");
     System.out.println("Tienes " +intentos+ " intentos");
     System.out.println("");
 
 do{
 
     System.out.println("Ingresa un numero: ");
     ni=ni+1;
     n=enter.nextInt();
     if(n>adivi){System.out.println("El numero es mas bajo!");}
     else if(n<adivi){System.out.println("El numero es mas alto!");}
     else if(n==adivi){jg2=jg2+1;System.out.println("Felicitaciones has encontrado el numero!!!");}
     
     
     
 
 
 
 c=c+1;
 }while(n!=adivi&&c<intentos);
     
  if(jg2==0){jg1=jg1+1;System.out.println("Lo sentimos has perdido JUGADOR 2 :(");
  
  
  
  }   
     System.out.println("");
     System.out.println("NUMERO DE INTENTOS PARA HALLAR EL NUMERO: "+ni);
     System.out.println("");
     System.out.println("JUGADOR 1 GANO " + jg1 + " VECES");
     System.out.println("");
     System.out.println("JUGADOR 2 GANO " + jg2 + " VECES");
     
     
     
     
     
     
     
     
 
 
 }   
    
    
    
    

    
}
