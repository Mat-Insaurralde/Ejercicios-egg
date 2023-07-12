
package libreria.Servicios;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import libreria.Entidades.Autor;
import libreria.Persistencia.AutorDAO;

/**
 *
 * @author Matias Insaurralde
 */
public class AutorService {
   private final  Scanner enter = new Scanner(System.in).useDelimiter("\n");
   private final  AutorDAO dao = new AutorDAO();
    
     

     
     
     
     ///CREACION
    
    public void CrearAutor() throws Exception{
        System.out.println("Crear Autor");
        System.out.println("-----------------");

         System.out.println("Ingrese el nombre: ");
          String nombre =  enter.next();    
            
          if (nombre == null || nombre.trim().isEmpty()) {
              System.out.println("Debe ingresar el nombre!");
              throw new Exception("Debe ingresar el nombre!");
          }else{
            
             Autor autor = new Autor(null, nombre, true);
            dao.GuardarAutor(autor);
            System.out.println("Autor creado con exito!");
          }
          
    
    }
    

    ///MODIFICACION
    
    public void modificar () throws Exception{
        System.out.println("Modificar Autor ");
        System.out.println("----------------------");
        System.out.println("Ingrese el ID del autor: ");
       try{
        int ID =enter.nextInt();
        Autor autor = dao.BuscarAutorPorID(ID);
        
        System.out.println("Ingrese el nuevo nombre: ");
        String nombre = enter.next();
        if (nombre == null || nombre.trim().isEmpty()) {
              System.out.println("Debe ingresar el nombre!");
              throw new Exception("Debe ingresar el nombre!");
          
        }else{
        autor.setNombre(nombre);
        dao.editar(autor);       }
        
        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero!");
        } catch (NoSuchElementException e) {
            System.out.println("Debe ingresar un numero!");
        }
      
    }
    
 
    
    public void BajaOaltaAutor() throws Exception{
      try{
        System.out.println("Dar de baja o alta");
        System.out.println("------------------------");
        System.out.println("Ingrese el ID: ");
     
        int id = enter.nextInt();
     
        Autor autor = dao.BuscarAutorPorID(id);
      if(autor == null){
      throw new Exception("No existe autor con ese ID!");   }
        
        System.out.println("1)Baja ");
        System.out.println("2)Alta ");
        
        int op = enter.nextInt();
        switch(op) {
            case 1:
           autor.setAlta(false);
            System.out.println("Has Dado de baja el Autor!");
            break;
            case 2: 
            autor.setAlta(true);
            System.out.println("Has Dado de alta el Autor!");
            break;
            default:
            throw new IllegalArgumentException("Opción inválida.");
        }
        
          dao.editar(autor);
      
      
      } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero!");
        } catch (NoSuchElementException e) {
            System.out.println("Debe ingresar un numero!");
        }
      
      
    
    }
    
  
    
    //ELIMINACION
    
     public void eliminarAutor()  {
         System.out.println("Eliminar Autor");
         System.out.println("-------------------");
         System.out.println("Ingrese ID del autor: ");
     try{
         Integer id= enter.nextInt();
         
         dao.EliminarPorID(id);
         System.out.println("Autor eliminado con exito!");
     
     
         } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero!");
        } catch (NoSuchElementException e) {
            System.out.println("Debe ingresar un numero!");
        }
      
     
     
     }
    
    
    ///CONSULTAS
    
    
     public void ListaDeAutores(){
         System.out.println("Lista de Autores");
         System.out.println("---------------------");
         List<Autor>  lista  =  dao.listarTodosLosAutores();
     
       if(lista!=null){  
         for (Autor aux : lista) {
             System.out.println(aux);
             
         }
       }else{System.out.println("No hay autores!");}
     
     }
     
     
     public void mostrarAutorporID(){
         System.out.println("Buscar Autor por ID");
         System.out.println("-------------------------");
        try{
         int id = enter.nextInt();
         
         if(dao.BuscarAutorPorID(id) != null ){
         
         System.out.println(dao.BuscarAutorPorID(id));
         }
     
        }catch (InputMismatchException e) {
            System.out.println("Debe ingresar un numero entero!");
        } catch (NoSuchElementException e) {
            System.out.println("Debe ingresar un numero!");
        }
      
     
     }
     

    public void mostrarAutorPorNombre() throws Exception{
         System.out.println("Buscar Autor por Nombre");
         System.out.println("------------------------------------ ");
         String nombre = enter.next();
         
        if(nombre == null || nombre.trim().isEmpty()) {  
            System.out.println("Debe ingresar el nombre!");
            throw new Exception("Debe ingresar el nombre!");
        }else{
        if(dao.BuscarAutorPorNombre(nombre)!=null){
        
              System.out.println(dao.BuscarAutorPorNombre(nombre));
        }
      
        }
              
         
   
     
     
     
     }  
    
    
    
}
