
package EX6;


public class Rectangulo {
    //ATRI
  public double lado1,lado2;  
    
    ///CON

    public Rectangulo() {
    }

    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
  
  ///GETTREANDSETTERS

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }
   
    
    
    
   ///METODO
  public double calculararea(){
  
  double area= lado1*lado2;
  
  
 return area; 
  }
    
    
}
