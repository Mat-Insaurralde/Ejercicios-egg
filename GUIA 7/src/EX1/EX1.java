package EX1;

import java.util.Scanner;

public class EX1 {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        Cancion c1 = new Cancion("hola","hols");

        System.out.println("CANCION");
        System.out.println("-------");
        System.out.println("Ingrese el autor: ");
        c1.setAutor(enter.nextLine());
        System.out.println("Ingrese el titulo: ");
        c1.setTitulo(enter.nextLine());
        System.out.println("");
        System.out.println("CANCION");
        System.out.println("AUTOR: " + c1.getAutor());
        System.out.println("TITULO: " + c1.getTitulo());

        
    }

}
