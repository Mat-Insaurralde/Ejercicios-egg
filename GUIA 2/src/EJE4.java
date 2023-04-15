


import java.util.Scanner;


 // @author Matias Insaurralde

public class EJE4 {

    //Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).

    public static void main(String[] args){
int grados,gradosf;
        
Scanner ingresar = new Scanner(System.in);    

System.out.println("Ingrese los grados centigrados");

grados = ingresar.nextInt();

gradosf = 32 + (9 * grados / 5);

System.out.println("Los grados equivalen a Fº " + gradosf   );

    }
    
}
