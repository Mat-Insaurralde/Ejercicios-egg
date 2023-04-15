
package dia4;

import java.util.Scanner;

/**
  @author Matias Insaurralde
 */
public class EJG1 {
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
    Scanner ingresa= new Scanner(System.in);
    int n1,n2,opc;
    String s,a="s";    
    boolean salir = false;
     
    System.out.println("Ingrese dos numeros enteros: ");
    
    n1=ingresa.nextInt();
    
    n2=ingresa.nextInt();
    
    do{
    
   
       System.out.println("==============================================================");
        
    System.out.println(" MENU \n ===== \n 1. SUMAR \n 2. RESTAR \n 3. MULTIPLICAR \n 4. DIVIDIR \n 5. SALIR \n ELIJA UNA OPCION \n ============================================================== ");
    
    opc=ingresa.nextInt();
    
    switch(opc){
    
    case 1: System.out.println("La suma es "+(n1+n2));
            break;
    
    case 2: System.out.println("La resta es "+(n1-n2));
            break;
    
    case 3: System.out.println("La multiplicacion es "+(n1*n2));
            break;
    
    case 4: System.out.println("La division es "+(n1/n2));
            break;
    
    case 5: System.out.println("Esta seguro que desea salir? (S/N)");
        s=ingresa.next();   
    
    if(a.equals(s)){
    salir=true;
    } else {System.out.println("Ingrese dos numeros enteros: ");
    
    n1=ingresa.nextInt();
    
    n2=ingresa.nextInt();
    }
    
    }
    }while (!salir);
            
        
        }
        }
    
    

