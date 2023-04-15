package EX4;

import java.util.Scanner;

public class EX4 {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta((int) (Math.random() *10000),"");

        System.out.println("CUENTA BANCARIA");
        System.out.println("---------------");
        System.out.println("");
        System.out.println("Ingrese el titular de la cuenta: ");
        cuenta1.setTitular(enter.nextLine());
       
        cuenta1.retirar_saldo();

    }

}
