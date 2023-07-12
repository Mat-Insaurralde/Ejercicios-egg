
package libreria.Servicios;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import libreria.Entidades.Editorial;
import libreria.Persistencia.EditorialDAO;

/**
 *
 * @author Matias Insaurralde
 */
public class EditorialService {
   
    
    
   private final  Scanner enter = new Scanner(System.in).useDelimiter("\n");
   private final  EditorialDAO daoEdi = new EditorialDAO();
    
     

     
     
     
     ///CREACION
    
    public void crearEditorial() throws Exception{
        System.out.println("Crear Editorial");
        System.out.println("-------------------");
        String nombre ;
         
        try {
   
         System.out.println("Ingrese el nombre: ");
          nombre =  enter.next();    
          
          if (nombre == null || nombre.trim().isEmpty()) {
               System.out.println("Debe ingresar el nombre!");
          }else{
          
            Editorial edi = new Editorial(null, nombre, true);
            daoEdi.GuardarEditorial(edi);
            System.out.println("Editorial creado con exito!"); 
          }
      
       } catch(Exception r){
             System.out.println("Huebo un error!");
         }
       
        
    }
    

    
    
    ///MODIFICACION
    
    public void modificarEditorial (){
        System.out.println("Modificar Editorial ");
        System.out.println("----------------------");
        System.out.println("Ingrese el ID del Editorial: ");
        try{
        int ID =enter.nextInt();
        System.out.println("Ingrese el nuevo nombre: ");

        String nombre = enter.next();
        
         if (nombre == null || nombre.trim().isEmpty()) {
               System.out.println("Debe ingresar el nombre!");
          }else{
            Editorial edi = new Editorial(ID, nombre, true); 
            daoEdi.editar(edi);
            System.out.println("Editorial Actualizado con exito!");
             
         }
       
        
         } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero entero!");
         }
       
     
        
    }

    
    public void BajaOaltaEditorial() throws Exception{
      try{
        System.out.println("Dar de baja o alta");
        System.out.println("------------------------");
        System.out.println("Ingrese el ID: ");
     
        int id = enter.nextInt();
     
        Editorial edu = daoEdi.BuscarEditorialPorID(id);
     
      if(edu == null){
      throw new Exception("No existe editorial con ese ID!");   }
        
        System.out.println("1)Baja ");
        System.out.println("2)Alta ");
        
        int op = enter.nextInt();
        
        switch(op) {
            case 1:
           edu.setAlta(false);
           System.out.println("Has Dado de baja el Editorial!");
            break;
            case 2: 
            edu.setAlta(true);
            System.out.println("Has Dado de baja el Editorial!");
            break;
            default:
            throw new IllegalArgumentException("Opción inválida.");
        }
        
          daoEdi.editar(edu);
      
       } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
       } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero entero!");
         }
       
     
        
      
    
    }
    
  
    //ELIMINACION
    
     public void eliminarEditorial()  {
         System.out.println("Eliminar Autor");
         System.out.println("-------------------");
         System.out.println("Ingrese ID del Editorial: ");
     try{
         Integer id= enter.nextInt();
         
         daoEdi.EliminarEditorailPorID(id);
         System.out.println("Editorial eliminado con exito!");
       } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
       } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero entero!");
         }
       
     
     
     }
    
    
    ///CONSULTAS
    
    
     public void ListaDeEditoriales(){
         System.out.println("Lista de Editoriales");
         System.out.println("-------------------------");
         List<Editorial>  lista  =  daoEdi.listarTodosLosEditorial();
     
         if(lista != null){
         for (Editorial aux : lista) {
             System.out.println(aux);
             
         }
         }else{System.out.println("No hay editoriales!");}
     
     }
     
     
     public void BuscarEditorialPorID(){
         System.out.println("Buscar Autor por ID");
         System.out.println("-------------------------");
       try{
         
         int id = enter.nextInt();
     
         if(  daoEdi.BuscarEditorialPorID(id) != null    ){
         System.out.println(daoEdi.BuscarEditorialPorID(id));
         }
         
         
         
          } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
          } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero entero!");
         }
       
     
     }
     
     
     
    public void BuscarEditorialPorNombre(){
         System.out.println("Buscar Editorial por Nombre");
         System.out.println("------------------------------------ ");
       
         String nombre = enter.next();
          
         if(daoEdi.BuscarEditorialPorNombre(nombre)!=null){
         
         if (nombre == null || nombre.trim().isEmpty()) {
         System.out.println("Debe ingresar el nombre!");
          }else{
         System.out.println(daoEdi.BuscarEditorialPorNombre(nombre));
         }  
         
         }
     
     }  
    
}
