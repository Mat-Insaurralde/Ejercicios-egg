package Service;

import Entidades.ParDeNumeros;

/**
 *
 * @author Matias Insaurralde
 */
public class ParDeNumerosService {

    ParDeNumeros newnumer = new ParDeNumeros();

    public void mostrarValores() {
        System.out.println("NUMEROS GUARDADOS");
        System.out.println("N1 " + newnumer.getN1());
        System.out.println("N2 " + newnumer.getN2());
        System.out.println("");
    }

    public double devolverMayor() {

        if (newnumer.getN1() > newnumer.getN2()) {

            return newnumer.getN1();

        } else if (newnumer.getN2() > newnumer.getN1()) {

            return newnumer.getN2();

        } else {
            return newnumer.getN1();
        }

    }

    public void calcularPotencia() {

        System.out.println("CALCULAR POTENCIA");
        System.out.println("-----------------");
        System.out.println("");
        double mayor = 0;
        double menor = 0;

        if (devolverMayor() == newnumer.getN1()) {
            mayor = Math.round(newnumer.getN1());
            menor = Math.round(newnumer.getN2());

        } else if (devolverMayor() == newnumer.getN2()) {
            mayor = Math.round(newnumer.getN2());
            menor = Math.round(newnumer.getN1());
        }

///MATH.POW(0,9)POTENCIAS 
        System.out.println("La potencia de " + mayor + " elevado al " + menor + " es: " + (int) Math.pow(mayor, menor));
        System.out.println("");
    }

    public void calculRaiz() {

        System.out.println("CALCULAR RAIZ");
        System.out.println("-------------");

        double menor = 0;

        if (devolverMayor() == newnumer.getN1()) {

            menor = newnumer.getN2();

        } else if (devolverMayor() == newnumer.getN2()) {

            menor = Math.round(newnumer.getN1());
        }

        ///SACA VALOR ABSOLUTO MATH:ABS()
        ////SACA RAIZ CUADRADA MATH:SQRT()       
        System.out.println("La raiz cuadra de "+menor+ " es "+Math.sqrt(Math.abs(menor)));
        

    }

}
