package Service;

import java.util.Arrays;
import javax.sound.midi.Soundbank;

/**
 *
 * @author Matias Insaurralde
 */
public class ArraysService {

    ///RECIBE POR PARAMETRO ARREGLOA
    public void iniciarA(double[] arre) {
        System.out.println("INICIAR ARRAY A CON N REALES RAMDOMS");
        System.out.println("----------------------------------");
        //SE COMLETA CON UN SOLO VALOR
        ///Arrays.fill(arre, Math.random() * 100);
        for (int i = 0; i < arre.length; i++) {
            arre[i] = Math.random() * 100;

        }
        System.out.println("");
    }

    public void mostrarArrays(double[] arre) {
        System.out.println("MOSTRAR ARRAY");
        System.out.println("-------------");
////IMPRIME ARREGLO OPCION 1
//System.out.println(Arrays.toString(arre));
////OPCION 2
        for (int i = 0; i < arre.length; i++) {
            System.out.println("[" + arre[i] + "]");

        }
        System.out.println("");
    }

    public void ordenar(double[] arre) {

        System.out.println("ORDENAR DE FORMA ASCENDENTE");
        System.out.println("---------------------------");

        Arrays.sort(arre);

        mostrarArrays(arre);

        System.out.println("");

    }

    public void iniciarB(double[] arregloA, double[] arregloB) {
        System.out.println("INICIAR ARRAY B");
        System.out.println("ARRAY INICIADO");
        System.out.println("");
        System.out.println("--------------");

        for (int i = 0; i < arregloB.length; i++) {

            if (i < 10) {
                Arrays.fill(arregloB, i, i+1, arregloA[i]);
            } else {
                Arrays.fill(arregloB, i, i+1, 0.5);
            }
        }
            ///MUESTRA    
            for (int j = 0; j < arregloB.length; j++) {
                System.out.println("[" + arregloB[j] + "]");

            }

        

    }

}
