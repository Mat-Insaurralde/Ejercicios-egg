package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class ServicioCadena {

    Scanner enter = new Scanner(System.in);

    Cadena newcadena = new Cadena("martina");

    public void mostrarVocales() {
        System.out.println("MOSTRAR VOCALES");
        int Cvocales = 0;

        for (int i = 0; i < newcadena.getLongitud(); i++) {

            String letra = newcadena.getFrase().substring(i, i + 1);

            if ("a".equals(letra) || "e".equals(letra) || "i".equals(letra) || "o".equals(letra) || "u".equals(letra)) {

                Cvocales = Cvocales + 1;

            }

        }

        System.out.println("La frase " + newcadena.getFrase() + " tiene " + Cvocales + " vocales");

    }

    public void invertirFrase() {

        int lon = newcadena.getLongitud();
        String letra = "";

        System.out.println("INVERTIR FRASE");

        while (lon != 0) {

            letra = letra + newcadena.getFrase().substring(lon - 1, lon);

            lon = lon - 1;

        }

        System.out.println(letra);

    }

    public void vecesRepetido() {

        System.out.println("BUSCAR CARACTER");
        System.out.println("");

        System.out.println("Ingrese la letra a buscar: ");

        int crepetido = 0;

        String letra = enter.next();

        for (int i = 0; i < newcadena.getLongitud(); i++) {

            String let = newcadena.getFrase().substring(i, i + 1);

            if (let.equals(letra)) {

                crepetido = crepetido + 1;

            }

        }

        System.out.println("El caracter se repite " + crepetido + " veces");

    }
    
    public void compararLongitud(){
    
        System.out.println("COMPARAR LONGITUD");
        System.out.println("");
    
        System.out.println("Ingrese una frase a comparar su longitud: ");
    
        String frase=enter.nextLine();
    
        int fraselon= frase.length();
    
         if(fraselon==newcadena.getLongitud()){
             System.out.println("La longitud de las frases son iguales!");
         
         }else if (fraselon>newcadena.getLongitud()){
             System.out.println("La frase ingresada tiene una longitud mayor ");
         
         }else{ System.out.println("La frase ingresada tiene una longitud menor ");
         
         }
    
    
    
    
    
    }
    
    public void unirFrases(){
        System.out.println("UNIR FRASES");
        System.out.println("");
        System.out.println("Ingresa la frase a unir: ");
        String frase= enter.nextLine();
    
        frase= newcadena.getFrase().concat(frase);
    
        System.out.println("El resultado es: "+frase);
    
    
    }
    
    
    public void reemplazar(){
        System.out.println("REEMPLAZA LETRA A");
        System.out.println("");
        System.out.println("Ingrese el caracter con que desee remplazar: " );
        String caracter=enter.next();
        String frase="";
    
     for (int i = 0; i < newcadena.getLongitud(); i++) {

            String letra = newcadena.getFrase().substring(i, i + 1);

            if ("a".equals(letra)) {

                letra=caracter;
  
                
            }
           frase=frase+letra;
        }
    
        System.out.println("Resultado: "+frase);
    
    
    
    
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    }
    
    
    public void contiene(){
        System.out.println("CONTIENE LETRA");
        System.out.println("");
        System.out.println("Ingrese una letra a buscar: ");
        String letra=enter.next();
    boolean contiene;
        int chequea = 0;
        
     for (int i = 0; i < newcadena.getLongitud(); i++) {

            String let = newcadena.getFrase().substring(i, i + 1);

            if (letra.equals(let)) {
         
                chequea++;
    }
          
        }
    
     if(chequea>=1){contiene=true;
     }else {contiene=false;}
     
     
        System.out.println("Resultado: "+contiene);
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
