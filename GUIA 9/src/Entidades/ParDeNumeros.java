
package Entidades;

/**
 *
 * @author Matias Insaurralde
 */
public class ParDeNumeros {
    ///ATRIBUTOS
  double n1;  
  double n2;  
    
    ///CONTRUCTORES

  ///CONSTRUCTOR VACIO CON NUMEROS ALEATORIOS
    public ParDeNumeros() {
        this.n1=Math.random()*50;
        this.n2=Math.random()*50;
    }
    
    //GETTERSANDSETTERS

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
