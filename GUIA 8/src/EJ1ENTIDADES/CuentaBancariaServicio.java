package EJ1ENTIDADES;

import Entidades.Cuentabancaria;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Matias
 */
public class CuentaBancariaServicio {

    Scanner enter = new Scanner(System.in);

    public Cuentabancaria CrearCuenta() {

        Cuentabancaria cuenta1 = new Cuentabancaria();

        System.out.println("Cuenta Bancaria");
        System.out.println("---------------");
        System.out.println("");
        System.out.println("Ingrese el nombre y apellido: ");
        cuenta1.setNombre(enter.nextLine());
        System.out.println("Ingrese numero de DNI: ");
        cuenta1.setDniCliente(enter.nextLong());
        System.out.println("Ingrese el numero de cuenta: ");
        cuenta1.setNumeroCuenta(enter.nextInt());

        return cuenta1;

    }

    public double ingresar(Cuentabancaria cuenta1) {

        System.out.println("¿Cuanto dinero desea ingresa?");

        double ingresa = enter.nextDouble();

        cuenta1.setSaldoActual(cuenta1.getSaldoActual() + ingresa);
        System.out.println("");
        System.out.println("Su saldo actualizado es $ " + cuenta1.getSaldoActual());
        return cuenta1.getSaldoActual();
    }

    public double retirarDinero(Cuentabancaria cuenta1) {

        System.out.println("¿Cuanto dinero desea retirar?");

        double retira = enter.nextDouble();

        if (retira <= cuenta1.getSaldoActual()) {

            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - retira);
            System.out.println("El saldo actualizado es $ " + cuenta1.getSaldoActual());

        } else if (retira > cuenta1.getSaldoActual()) {

            System.out.println("Se retira el maximo posible que son $ " + cuenta1.getSaldoActual());

            cuenta1.setSaldoActual(0);
            System.out.println("");
            System.out.println("Su saldo actualizado es de $ " + cuenta1.getSaldoActual());
        }

        return cuenta1.getSaldoActual();
    }

    public void extraccionrapida(Cuentabancaria cuenta1) {
        String valida;
        System.out.println("");
        System.out.println("EXTRACCION RAPIDA");
        System.out.println("Su saldo actual es $" + cuenta1.getSaldoActual());

        double veinte = (20 * cuenta1.getSaldoActual()) / 100;
        System.out.println("");
        System.out.println("Usted solo puede retirar el 20% que son $ " + veinte);
        System.out.println("");
        System.out.println("Desea realzar la operacion?(si/no)");

        valida = enter.nextLine();
        do {
            System.out.println("Ingrese si o no!");
            valida = enter.nextLine();

        } while (!"si".equals(valida) && !"no".equals(valida));
        
        
        if ("si".equals(valida)) {
            cuenta1.setSaldoActual(cuenta1.getSaldoActual() - veinte);
            System.out.println("Su saldo actualizado es de $ " + cuenta1.getSaldoActual());
        }
    }

    public void consultarsaldo(Cuentabancaria cuenta1) {

        System.out.println("");
        System.out.println("SU SALDO DISPONIBLE ES $ " + cuenta1.getSaldoActual());

    }

    public void consultardatos(Cuentabancaria cuenta1) {
        System.out.println("");
        System.out.println("CUENTA BANCARIA");
        System.out.println("---------------");
        System.out.println("");
        System.out.println("TITULAR DE LA CUENTA: " + cuenta1.getNombre());
        System.out.println("");
        System.out.println("DNI : " + cuenta1.getDniCliente());
        System.out.println("");
        System.out.println("NUMERO DE CUENTA: " + cuenta1.getNumeroCuenta());
        System.out.println("");
        System.out.println("SALDO DE LA CUENTA: " + cuenta1.getSaldoActual());

    }

}
