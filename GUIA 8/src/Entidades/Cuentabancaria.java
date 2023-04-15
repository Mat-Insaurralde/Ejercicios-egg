
package Entidades;

/**
 *
 * @author Matias
 */
public class Cuentabancaria {
  ////ATRIBUTOS
   private int  numeroCuenta;
   
   private long dniCliente;
    
   private double saldoActual;
   
   private String nombre; 
    
   ///CONSTRUCTORES

    public Cuentabancaria() {
    }

    public Cuentabancaria(int numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public Cuentabancaria(String nombre) {
        this.nombre = nombre;
    }
   
   ///GETTERSANDSETTERS

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
   
    
    
    
    
    
    
    
    
    
}
