package EX6;

import java.util.Scanner;

public class EX6 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        Rectangulo rectangulo1 = new Rectangulo();

        System.out.println("Ingresar datos del rectangulo");
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("Ingresar lado 1:");
        rectangulo1.setLado1(enter.nextDouble());
        System.out.println("Ingresar lado 2:");
        rectangulo1.setLado2(enter.nextDouble());
        System.out.println("");
        System.out.println("El area del rectangulo es: "+rectangulo1.calculararea());
    
    
    
    
    
    
    
    }

}
