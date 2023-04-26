package Mains;

import Service.FechaService;
import java.util.Date;

/**
 *
 * @author Matias
 */
public class Data {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FechaService nuevafecha = new FechaService();

        
        
        Date nacimiento = nuevafecha.fechaNacimiento();

        Date fechaactual = nuevafecha.fechaActual();

        System.out.println("EDAD DE LA PERSONA");
        System.out.println("------------------");
        System.out.println("La edad de usuario es: " + nuevafecha.diferencia(nacimiento, fechaactual));

    }

}
