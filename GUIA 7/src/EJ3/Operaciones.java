
package EJ3;

import java.util.Scanner;


public class Operaciones {
Scanner enter =new Scanner(System.in);
//ATRIBUTOS
    
private int n1;
private int n2;    

///CONSTRUCTOR

    public Operaciones() {
    }

    public Operaciones(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

///METODOSGETSET

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

///METODOS

public void crearOperacion(){
    System.out.println("Ingrese los dos numeros de la operacion: ");
    n1=enter.nextInt();
    n2=enter.nextInt();
    System.out.println("");
    System.out.println("------------------------------------------");
}


public int sumar(){
int suma=n1+n2;
     System.out.println("SUMA");
   System.out.println("La suma de los numeros es: "+suma);
   System.out.println(""); 
    
  
    
    return suma;
}


public int restar(){
int resta=n1-n2;
  System.out.println("RESTA");
   System.out.println("La resta de los numeros es: "+resta);
   System.out.println(""); 
       
   return resta;
}


public int multiplicar(){
System.out.println("MULTIPLICACION"); 
int mul;


if(0==n1 || n2==0)  { mul=0;
System.out.println("Se esta multiplicando por cero el resultado es: "+mul);}
else {
    mul=n1*n2;
    System.out.println("La multiplicacion de estos numeros es: "+mul);
    }


    System.out.println("");



return mul;
}


public double dividir(){
double division;   
System.out.println("DIVISION"); 

if(0==n1||n2==0)  { division=0;
System.out.println("Se esta dividiendo por cero el resultado es: "+division);}
else {
    division=(double)n1/n2;
    System.out.println("La division de estos numeros es: "+division);
    }



 return division;
}










}
    

