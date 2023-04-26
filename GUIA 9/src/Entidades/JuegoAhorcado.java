
package Entidades;

/**
 *
 * @author Matias Insaurralde
 */
public class JuegoAhorcado {
    private String[] palabra;
    private int letrasencon;
    private int oportunidades;
    private int restantes ;
    
    
    public JuegoAhorcado() {
    }

    public JuegoAhorcado(String[] palabra, int letrasencon, int oportunidades,int restantes) {
        this.palabra = palabra;
        this.letrasencon = letrasencon;
        this.oportunidades = oportunidades;
        this.restantes = restantes;
                }

   

    public int getRestantes() {
        return restantes;
    }

    public void setRestantes(int restantes) {
        this.restantes = restantes;
    }

    
    
    
    
    
    
    
    
    
    
    
    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasencon() {
        return letrasencon;
    }

    public void setLetrasencon(int letrasencon) {
        this.letrasencon = letrasencon;
    }

    public int getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(int oportunidades) {
        this.oportunidades = oportunidades;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
