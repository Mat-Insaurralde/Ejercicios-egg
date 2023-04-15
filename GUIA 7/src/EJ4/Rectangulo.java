package EJ4;

import java.util.Scanner;

public class Rectangulo {

    Scanner enter = new Scanner(System.in);
///ATRIBUTOS
    private int base;
    private int altura;

//CONTRUCTORES
    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

//GETSET
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


///METODOS
    public void crearRectangulo() {
        System.out.println("RECTANGULO");
        System.out.println("----------");
        System.out.println("Ingrese el base: ");
        base = enter.nextInt();
        System.out.println("Ingrese el altura: ");
        altura = enter.nextInt();
        System.out.println("");
        System.out.println("DATOS");

        System.out.println("");
        System.out.println("El superficie es: " + superficie());
        System.out.println("");
        System.out.println("El perimetro es: " + perimetro());
        System.out.println("");

        
        

    }

    public int perimetro() {

        int perimetro = (base + altura)*2;

        return perimetro;
    }

    public double superficie() {
        double superficie = (double)(base * altura) / perimetro();

        return superficie;
    }

    public void dibuja() {
        System.out.println("DIBUJO");
        System.out.println("------");
        System.out.println("");
       
        for (int j = 0; j < altura; j++) {
      
        for (int i = 0; i < base; i++) {
            if(i==0||i==base-1||j==0||j==altura-1)     
            System.out.print("* ");   
            
            
            else System.out.print("  ");
            
       
        }
            System.out.println("");
        }    
            
            
        }
     
        
        
        
        
        
     
    }


