package Entidades;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class Mesecreto {

    private String[] docemeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};      
    private String messecreto=docemeses[5];

    
    
    
    
    
    public Mesecreto() {
    }

    public Mesecreto(String[] docemeses, String messecreto) {
        
        this.docemeses = docemeses;
        this.messecreto = messecreto;
    
    }

    
    
    
    
    
    
    
    
    public String[] getDocemeses() {
        return docemeses;
    }

    public void setDocemeses(String[] docemeses) {
        this.docemeses = docemeses;
    }

    public String getMessecreto() {
        return messecreto;
    }

    public void setMessecreto(String messecreto) {
        this.messecreto = messecreto;
    }

    public void ejecvutarjuego() {

        Scanner enter = new Scanner(System.in);

    
        System.out.println("ADIVINE EL MES SECRETO");
        System.out.println("----------------------");
        String mes;
        System.out.println("Introduzca el nombre del mes en minúsculas:");

        mes = enter.next();

        while (!mes.equals(getMessecreto())) {

            System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes ");

            mes = enter.next();

        }
        System.out.println("¡Ha acertado!");

    }

}
