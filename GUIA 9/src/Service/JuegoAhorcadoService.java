package Service;

import Entidades.JuegoAhorcado;
import java.util.Arrays;

import java.util.Scanner;

/**
 *
 * @author Matias Insaurralde
 */
public class JuegoAhorcadoService {

    Scanner enter = new Scanner(System.in);

    JuegoAhorcado newjuego = new JuegoAhorcado();

    
    
    
    
    
    
    public void crearjuego() {
        System.out.println("JUEGO AHORCADO");
        System.out.println("--------------");
        System.out.println("");
        System.out.println("Ingrese la palabra: ");
        String palabra = enter.next();
        System.out.println("");
        System.out.println("Ingrese el numero de oportunidades: ");
        newjuego.setOportunidades(enter.nextInt());

        ///// VECTOR
        int longitudvector = palabra.length();

        String enterletras[] = new String[longitudvector];

        for (int i = 0; i < enterletras.length; i++) {

            enterletras[i] = palabra.substring(i, i + 1);

        }
        ///SETEA VECTOR LETRA 
        newjuego.setPalabra(enterletras);

        System.out.println("");
        System.out.println("---------------------------------------");
        System.out.println("");
        newjuego.setRestantes(longitudvector);
    }

    public void longitud() {
        System.out.println("");
        System.out.println("Longitud de la palabra " + newjuego.getPalabra().length);

    }

    public void buscar(String letra) {

        int fp = 0;

        for (int i = 0; i < newjuego.getPalabra().length; i++) {
            if (newjuego.getPalabra()[i].equals(letra)) {
                fp++;
            }
        }

        if (fp > 0) {
            System.out.println("La letra " + letra + " forma parte de la palabra");
        } else if (fp == 0) {
            System.out.println("La letra " + letra + " No forma parte de la palabra");
        }

    }

    public boolean encontradas(String letra) {
        int encon = 0;

        for (int i = 0; i < newjuego.getPalabra().length; i++) {

            if (newjuego.getPalabra()[i].equals(letra)) {
                newjuego.setLetrasencon(newjuego.getLetrasencon() + 1);
                newjuego.setRestantes(newjuego.getRestantes() - 1);
                Arrays.fill(newjuego.getPalabra(), i, i + 1, "");
                encon++;
            }
        }

        //IMPRIME
        System.out.println("Numero de letras (encontradas,faltantes): (" + newjuego.getLetrasencon() + "," + newjuego.getRestantes() + ")");

        ///DEVUELVE TRUE SI ES MAYOR LEC
        return encon > 0;
    }

    public void intentos(boolean encon) {

        if (encon == false) {
            newjuego.setOportunidades(newjuego.getOportunidades() - 1);

        } else {
        }

        System.out.println("Numero de oportunidades restantes: " + newjuego.getOportunidades());
        System.out.println("");
        System.out.println("---------------------------------------");

    }

    public void juego() {
        crearjuego();

        do {

            System.out.println("Ingrese letra a buscar:");
            String letra = enter.next();
            longitud();
            buscar(letra);
            intentos(encontradas(letra));

        } while (newjuego.getOportunidades() != 0 && newjuego.getRestantes() != 0);

        if (newjuego.getOportunidades() == 0) {
            System.out.println("Lo siento tus intentos se acabaron!! Has perdido tio");
        } else if (newjuego.getRestantes() == 0) {
            System.out.println("Felicitaciones has ganado!!! perry");
        }

        System.out.println("");

    }
}
