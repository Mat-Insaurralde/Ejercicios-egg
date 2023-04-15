package EX4;

import java.util.Scanner;

public class Cuenta {

///ATRI
    public int saldo;
    public String titular;

//CONS
    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

////GETTERANDSETTER
    public int getSaldo() {

        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void retirar_saldo() {
        Scanner enter = new Scanner(System.in);
        String clave = null;
        int salnew;
        int retiro;

        System.out.println("CUENTA: " + titular);
        System.out.println("");
        System.out.println("SALDO: " + saldo);
        System.out.println("");
        System.out.println("---------------");
        System.out.println("RETIRO DE DINERO");

        do {

            System.out.println("¿Cuanto dinero desea retirar?");

            retiro = enter.nextInt();

            if (retiro <= saldo) {
                saldo = saldo - retiro;
            } else if (retiro > saldo) {
                System.out.println("No tiene sufuciente saldo!");
            }
            System.out.println("");
            System.out.println("Su daldo actual es: " + saldo);
            System.out.println("");

            System.out.println("¿Desea realizar otro retiro?(si/no)");

            clave = enter.nextLine();

            while (!clave.equals("si") && !clave.equals("no")) {

                System.out.println("Ingrese si o no");

                clave = enter.nextLine();
            }

        } while (!clave.equals("no"));

        System.out.println("Su saldo final es: " + saldo);

    }
}
