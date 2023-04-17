package Mains;

import Service.ParDeNumerosService;

/**
 *
 * @author Matias Insaurralde
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ParDeNumerosService num1 = new ParDeNumerosService();

        num1.mostrarValores();
        num1.devolverMayor();
        num1.calcularPotencia();
        num1.calculRaiz();

    }

}
