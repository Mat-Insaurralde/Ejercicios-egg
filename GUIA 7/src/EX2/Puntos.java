
package EX2;

import java.util.Scanner;


public class Puntos {

Scanner enter=new Scanner(System.in);



///ATRIBUTOS
public double x1,x2,y1,y2;







//CONS

    public Puntos() {
    }


//GETTERSANDSETTERS

    public Puntos(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }



    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }




//METODOS

public void crearPuntos(){
    System.out.println("DISTANCIA DE PUNTOS");
    System.out.println("-------------------");
    System.out.println("");
    System.out.println("Ingrese las coordenadas del P1");
    x1=enter.nextDouble();
    x2=enter.nextDouble();
    System.out.println("Ingrese las coordenadas del P2");
    y1=enter.nextDouble();
    y2=enter.nextDouble();



}
    
    
public double calculaDistancia(){

   double raizp1 = (x2-x1);
   double raizp2 = (y2-y1);
  
    
    
   // double distancia = Math.sqrt((raizp1*raizp1)+(raizp2*raizp2)); 
 

double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));



return distancia;
}    
    
    
    
    
    

}
