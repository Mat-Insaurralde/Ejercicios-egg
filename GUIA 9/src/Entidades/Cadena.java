
package entidades;

/**
 *
 * @author Matias
 */
public class Cadena {
    
    public String frase;
    public int longitud;

    
    
    
    ////CONSTRUC
    
    
    
    public Cadena() {
    }

    public Cadena(String frase) {
       
        this.frase = frase;
       this.longitud = frase.length();
    }
    
    
   /////GETTERSANDSETTERS 

    
    
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
