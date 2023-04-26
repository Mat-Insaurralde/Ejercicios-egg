
package Entidades;

import java.util.Date;

/**
 *
 * @author Matias
 */
public class Persona {
    
    private  String nombre;
    private  Date fechanaci;

    
    
    
    
    
    
    public Persona() {
    }
    
    
    
    public Persona(String nombre, Date fechanaci) {
        this.nombre = nombre;
        this.fechanaci = fechanaci;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(Date fechanaci) {
        this.fechanaci = fechanaci;
    }

    @Override
    public String toString() {
        return "Persona{" + " Nombre : " + nombre + ", Fecha Nacimiento : " + fechanaci + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
