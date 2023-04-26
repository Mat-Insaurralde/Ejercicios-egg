package Mains;

import Entidades.Persona;
import Service.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class EJ5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        
        PersonaService pp = new PersonaService();

        
        
        System.out.println("ingrese la persona 1");
        Persona p1 = pp.crearPersona();
        System.out.println("");
        System.out.println("La edad de " + p1.getNombre() + " es " + pp.calcularEdad(p1));
        System.out.println("");
        
        
        
        System.out.println("ingrese la persona 2");
        Persona p2 = pp.crearPersona();
        System.out.println("");
        System.out.println("La edad de " + p2.getNombre() + " es " + pp.calcularEdad(p2));
        System.out.println("");
        
        
        
        System.out.println("Ingrese la edad a comparar: ");
        int edadc = enter.nextInt();
        System.out.println(pp.menorQue(p2, edadc));
        System.out.println("");

        pp.mostarPersona(p1, p2);

    }

}
