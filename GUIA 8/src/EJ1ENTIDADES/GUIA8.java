
package EJ1ENTIDADES;

import Entidades.Cuentabancaria;


public class GUIA8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    CuentaBancariaServicio primera = new CuentaBancariaServicio();
    
        Cuentabancaria cuenta1 = primera.CrearCuenta();
        
        primera.ingresar(cuenta1);
        
        primera.retirarDinero(cuenta1);
        
        primera.extraccionrapida(cuenta1);
        
        primera.consultarsaldo(cuenta1);
        
        primera.consultardatos(cuenta1);
        
        
        
        
    
    
    
    }
    
}
