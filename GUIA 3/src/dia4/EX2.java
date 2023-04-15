
package dia4;

/**
 *
 * @author Matias Insaurralde
 */
public class EX2 {

  
    public static void main(String[] args) {
        
       //Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 
    int A=1,B=2,C=3,D=4,AX = 0;    
    
    System.err.println("Valores Iniciales\n-------------\nVALOR DE A:"+A+ "\nVALOR DE B:"+B+"\nVALOR DE C:"+C+"\nVALOR DE D:"+D+"\nVALOR DE AX:"+AX     );
     
    
    AX=B;
     A=D;
     B=C;
     C=A;
     D=AX;
     
     System.err.println("Valores Finales\n-------------\nVALOR DE A:"+A+ "\nVALOR DE B:"+B+"\nVALOR DE C:"+C+"\nVALOR DE D:"+D+"\nVALOR DE AX:"+AX     );
    
    
    
    
    
    
    
    
    
    }
    
}
