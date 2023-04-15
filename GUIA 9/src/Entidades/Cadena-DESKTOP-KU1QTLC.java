
package Entidades;

/**
 *
 * @author Matias Insaurralde
 */
public class Cadena {
    ///ATRIBUTOS
    
    
    public String frase = "mariano";
    public int longi=frase.length();
    
    
    
    
    ///CONTRUCTORES

    public Cadena() {
    }

    public Cadena(String frase) {
        this.frase = frase;
        
    }
    
    //GETTERSANDSETTERS

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongi() {
        return longi;
    }

    public void setLongi(int longi) {
        this.longi = longi;
    }
    
    
    
    
    
    
    
    
    
    
}
