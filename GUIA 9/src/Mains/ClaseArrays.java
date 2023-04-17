
package Mains;

import Service.ArraysService;

/**
 *
 * @author Matias Insaurralde
 */
public class ClaseArrays {

   
    public static void main(String[] args) {
       
        ArraysService nuevo = new  ArraysService();   
        
    double arregloA[] = new double [50];
    double arregloB[] = new double [20];
        
    
    ////ENVIAR POR PARAMETRO arregloA
    
    nuevo.iniciarA(arregloA);
    nuevo.mostrarArrays(arregloA);    
    nuevo.ordenar(arregloA);
    nuevo.iniciarB(arregloA, arregloB);
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
