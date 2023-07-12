
package libreria;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import libreria.Servicios.AutorService;
import libreria.Servicios.EditorialService;
import libreria.Servicios.LibroService;

/**
 *
 * @author Matias Insaurralde
 */
public class LibreriaMain {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception  {

        Scanner  enter = new Scanner(System.in).useDelimiter("\n");
        
     
        try{
        System.out.println("LIBRERIA");
        System.out.println("--------------");
        System.out.println("1) Menu de Autores");
        System.out.println("2) Menu de Editoriales");
        System.out.println("3) Menu de Libros");
        System.out.println("Ingrese una opcion:");
        int op = enter.nextInt();
        switch (op) {
            case 1: MenuAutor();
            break;   
            case 2: MenuEditorial();
            break;
            case 3:MenuLibro();
            break;
            default:
                throw new IllegalArgumentException("Opcion invalida");
        }
       
         } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero entero!");
         }
       
        
        
        
        
        
    }     

        
        
 private  static void MenuAutor() throws Exception{
 Scanner  enter = new Scanner(System.in).useDelimiter("\n");
 AutorService autor = new AutorService();
  
     System.out.println("Menu De Autores");
     System.out.println("----------------------");
     System.out.println("1)Crear Autor");
     System.out.println("2)Eliminar Autor");
     System.out.println("3)Modificar Autor");
     System.out.println("4)Bucar Autor por nombre");
     System.out.println("5)Buscar Autor por ID");
     System.out.println("6)Dar de baja o Alta un Autor");
     System.out.println("7)Lista de Autores");
     System.out.println("Ingrese una opcion: ");
     System.out.println("");
     int op = enter.nextInt();
     
     switch (op) {
            case 1: autor.CrearAutor();
            break;   
            case 2: autor.eliminarAutor();
            break;
            case 3:autor.modificar();
            break;
            case 4:autor.mostrarAutorPorNombre();
            break;
            case 5:autor.mostrarAutorporID();
            break;
            case 6:autor.BajaOaltaAutor();
            break;
            case 7:autor.ListaDeAutores();
            break;
            
            
            default:
                throw new IllegalArgumentException("Opcion invalida");
        }
  
  
   
   }
         
        
        
        
        
  private  static void MenuLibro() throws Exception{
      Scanner  enter = new Scanner(System.in).useDelimiter("\n");
      LibroService libro = new LibroService();

 try{
     System.out.println("Menu De Libros");
     System.out.println("--------------------");
     System.out.println("1)Crear Libro");
     System.out.println("2)Eliminar Libro");
     System.out.println("3)Modificar Libro");
     System.out.println("4)Bucar Libro por titulo");
     System.out.println("5)Buscar libro por ISBN");
     System.out.println("6)Buscar libros por nombre de autor");
     System.out.println("7)Buscar libros por nombre de editoral"); 
     System.out.println("8)Lista de libros");
      System.out.println("9)Dar de baja o Alta un libro");
   System.out.println("Ingrese una opcion: ");
     System.out.println("");
      int op = enter.nextInt();
     
     switch (op) {
            case 1: libro.CrearLibro();
            break;   
            case 2: libro.eliminarLibro();
            break;
            case 3: libro.modificarLibro();
            break;
            case 4: libro.BuscarLibrosPorTitulo();
            break;
            case 5:libro.BuscarLibroPorISBN();
            break;
            case 6:libro.BuscarLibrosPorNombreDeAutor();
            break;
            case 7:libro.BuscarLibrosPorNombreDeEditorial();
            break;
            case 8:libro.ListaDeLibros();
            break;     
            case 9:libro.BajaOaltaLibro();
            break;
       
            
            
            default:
                throw new IllegalArgumentException("Opcion invalida");
        }
        
         } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero entero!");
         }
       
        
   
   }
                
        
        
        
 private  static void MenuEditorial() throws Exception{
Scanner  enter = new Scanner(System.in).useDelimiter("\n");
EditorialService editorial = new EditorialService();
  
   try{
     System.out.println("Menu De Editorial");
     System.out.println("------------------------");
     System.out.println("1)Crear Editorial");
     System.out.println("2)Eliminar Editorial");
     System.out.println("3)Modificar Editorial");
     System.out.println("4)Bucar Editorial por nombre");
     System.out.println("5)Buscar Editorial por ID"); 
     System.out.println("6)Lista de Editoriales");
     System.out.println("7)Dar de baja o alta un editorial"); 
     System.out.println("Ingrese una opcion: ");
     System.out.println("");
     int op = enter.nextInt();
     
     switch (op) {
            case 1: editorial.crearEditorial();
            break;   
            case 2: editorial.eliminarEditorial();
            break;
            case 3: editorial.modificarEditorial();
            break;
            case 4: editorial.BuscarEditorialPorNombre();
            break;
            case 5:editorial.BuscarEditorialPorID();
            break;
            case 6:editorial.ListaDeEditoriales();
            break;
            case 7: editorial.BajaOaltaEditorial();
            break;
            
            default:
                throw new IllegalArgumentException("Opcion invalida");
        }
        
         } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero entero!");
         }
       
        
  
  
  
  
   
   }
             
        
        
        
        
    
    
    
    
    }
    

