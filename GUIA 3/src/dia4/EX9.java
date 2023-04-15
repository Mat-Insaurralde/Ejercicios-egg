
package dia4;

import java.util.Scanner;

/**
 *
 * @author Matias Insaurralde
 */
public class EX9 {

    public static void main(String[] args) {
        // RESTASSUCESIVAS
Scanner enter=new Scanner(System.in);

int n1,n2,resta = 0,coci = 0,c = 0;        

System.out.println("Ingrese dos numeros enteros mayor a '1' ");
        



System.out.println("Dividendo: ");
n1=enter.nextInt();
while(n1<=0){System.out.println("Ingrese un numero mayor a '0' ");n1=enter.nextInt()  ;}
System.out.println("Divisor: ");
n2=enter.nextInt();
while(n2<=0){System.out.println("Ingrese un numero mayor a '0' ");n2=enter.nextInt()  ;}


do{
   
if(c==0){
resta=n1;}
c=c+1; 


resta=resta-n2;

        
        
coci=coci+1;        
}while(resta>n2);

        System.out.println("El residuo es "+ resta +" y el cociente es "+ coci );





    }
    
}
