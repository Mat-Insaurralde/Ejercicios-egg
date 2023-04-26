package Service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class FechaService {

    Scanner enter = new Scanner(System.in);

    public Date fechaNacimiento() {

        System.out.println("Ingrese el año: ");
        int año = enter.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = enter.nextInt();
        System.out.println("Ingrese el dia: ");
        int dia = enter.nextInt();

        Date nacimiento = new Date(año - 1900, mes, dia);

        return nacimiento;
    }

    public Date fechaActual() {
    ///DATE() TRAE LA FECHA ACTUAL
        Date actual = new Date();

        return actual;
    }

    public int diferencia(Date naci, Date actu) {
        ///GETYEAR TRAE EL AÑO GETDAY DIA GETMONTH MES
        int año = actu.getYear() - naci.getYear() ;

        ////EVALUA EL MES Y DIA PARA SABER SI YA CUMPLIO AÑOS
        if (actu.getMonth() <= naci.getMonth() && actu.getDay() < naci.getDay() ||   actu.getMonth() < naci.getMonth()   ) {
            return año - 1;
        } else {
            return año;
        }

    }

}
