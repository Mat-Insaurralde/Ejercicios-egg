
package EX5;

import java.util.Scanner;


public class Empleado {
 Scanner enter = new Scanner(System.in);
//ATRIBUTOS

public String nombre;
public int edad;
public int salario;


//CONTR

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

////GETTERSANDSETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    ///METODOS
    
public void datosempleado(){
    System.out.println("AUMENTO SALARIAL");
    System.out.println("----------------");
    System.out.println("");
    System.out.println("Ingrese el nombre del empleado: ");
    nombre=enter.nextLine();
    System.out.println("Ingrese la edad: ");
    edad=enter.nextInt();
    System.out.println("Ingrese el salario actual: ");
    salario=enter.nextInt();
    System.out.println("");

}
    
    
    
    
    
public int calcularAumento(){
int aumento = 0 ;


if (edad>=30) { aumento = (int)(salario * 0.1 + salario) ; }
else if(edad<=30 ) { aumento= (int) (salario * 0.05 + salario);}



return aumento;
}




















}
