package Service;

import Entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class PersonaService {

    private Scanner enter = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        System.out.println("Ingresar nombre: ");

        String nombre = enter.next();

        System.out.println("Ingrese la fecha de nacimiento año/mes/dia :");

        Date fechana = new Date(enter.nextInt() - 1900, enter.nextInt() - 1, enter.nextInt());
        System.out.println("");

        return new Persona(nombre, fechana);
    }

    public int calcularEdad(Persona p1) {

        Date actual = new Date();

        int edad = actual.getYear() - p1.getFechanaci().getYear();

        ///AVALUA PARA DESCONTAR AÑO
        if (p1.getFechanaci().getDay() < actual.getDay() && actual.getMonth() <= p1.getFechanaci().getMonth() || actual.getMonth() < p1.getFechanaci().getMonth()) {

            return edad - 1;

        } else {
            return edad;
        }

    }

    public boolean menorQue(Persona p2, int edad2) {

        return calcularEdad(p2) < edad2;
    }

    public void mostarPersona(Persona uno, Persona dos) {

        System.out.println("¿La informacion de que persona desea? ");
        System.out.println("1) Persona 1");
        System.out.println("2) Persona 2");
        System.out.println("");
        int opc = enter.nextInt();

        switch (opc) {
            case 1:
                System.out.println(uno.toString());
                break;
            case 2:
                System.out.println(dos.toString());
                break;

        }

    }

}
