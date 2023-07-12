
package libreria.Servicios;

import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;
import libreria.Entidades.Autor;
import libreria.Entidades.Editorial;
import libreria.Entidades.Libro;

import libreria.Persistencia.AutorDAO;
import libreria.Persistencia.EditorialDAO;
import libreria.Persistencia.LibroDAO;

/**
 *
 * @author Matias Insaurralde
 */
public class LibroService {

  private final  Scanner enter = new Scanner(System.in).useDelimiter("\n");
 
  private final  AutorDAO daoAutor = new AutorDAO();
  private final LibroDAO daolibro = new LibroDAO();
  private final  EditorialDAO daoEditorial = new EditorialDAO();

     
     
     
     ///CREACION
    
    public void CrearLibro() throws Exception{
        System.out.println("Crear Libro");
        System.out.println("-----------------");
 try{     
 
        System.out.println("Titulo: ");
        String titulo =  enter.next();    
        if (titulo == null || titulo.trim().isEmpty()) {
        System.out.println("Debe ingresar el titulo!"); 
        throw new Exception("Debe ingresar el titulo!");
        }
        System.out.println("Año: ");
        int anio = enter.nextInt();
        System.out.println("Numero de Ejemplares: ");
        int ej = enter.nextInt();
        System.out.println("Numeros de Ejemplares Prestados: ");
        int ejpres=enter.nextInt();
        System.out.println("Numeros de Ejemplares Restantes: ");
        int ejres= enter.nextInt();
         
    Autor autor = BuscarAutorDelLibroNuevo();
    Editorial edi = BuscarEditorialDelLibroNuevo();
         
        Libro libro = new Libro(null, titulo, anio, ej, ejpres, ejres, true, autor, edi);
           
        daolibro.GuardarLibro(libro);
         
           
       } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero entero!");
         }
       
     
    
    }
    

    
    ///MODIFICACION
    
    public void modificarLibro () throws Exception{
        System.out.println("Modificar Libro ");
        System.out.println("----------------------");
        System.out.println("Ingrese el ISBN del Libro: ");
       try{
        long isbn =enter.nextInt();
        Libro libro = daolibro.BuscarLibroPorIsbn(isbn);
       
        if(libro != null  ){
        System.out.println("¿Que desea modificar?");
        System.out.println("1) Titulo ");
        System.out.println("2) Año ");
        System.out.println("3) Numero de Ejemplares ");
        System.out.println("4) Numeros de Ejemplares Prestados ");
        System.out.println("5) Numeros de Ejemplares Restantes ");     
        System.out.println("6) Cambiar Autor ");     
        System.out.println("7) Cambiar Editorial ");     
        
        int op = enter.nextInt();
        
            switch (op) {
                case 1:
                       System.out.println("Nuevo Titulo: ");
                       String titulo =  enter.next();   
                         if (titulo == null || titulo.trim().isEmpty()) {
                         System.out.println("Debe ingresar el titulo!"); 
                         throw new Exception("Debe ingresar el titulo!");
                         }
                       libro.setTitulo(titulo);
                      break;
                case 2:
                       System.out.println("Nuevo Año: ");
                       int anio = enter.nextInt();
                       libro.setAnio(anio);
                      break;
                case 3:
                     System.out.println("Nuevo Numero de Ejemplares: ");
                     int ej = enter.nextInt();
                     libro.setEjemplares(ej);
                     break;
                case 4:
                        System.out.println("Nuevo Numero de Ejemplares Prestados: ");
                        int ejpres=enter.nextInt();
                        libro.setEjemplaresPrestados(ejpres);
                      break;
                case 5:
                      System.out.println("Nuevo Numero de Ejemplares Restantes: ");
                      int ejres= enter.nextInt();
                      libro.setEjemplaresRestantes(ejres);
                      break;
                case 6:
                       System.out.println("Cambiar Autor ");
                       System.out.println("--------------------");
                       libro.setAutor(BuscarAutorDelLibroNuevo());
                      break;
                case 7:
                        System.out.println("Cambiar Editorial ");
                        System.out.println("------------------------");
                        libro.setEditorial(BuscarEditorialDelLibroNuevo());
                    break;
                default:
                    throw new IllegalArgumentException("Opcion invalida!");
            }
       daolibro.editar(libro);
        }
            
     } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero!");
         }
       
     
        
       
    }
    
    
      
    public void BajaOaltaLibro() throws Exception{
      try{
        System.out.println("Dar de baja o alta");
        System.out.println("------------------------");
        System.out.println("Ingrese el ISBN: ");
        long isbn = enter.nextInt();
        Libro libro = daolibro.BuscarLibroPorIsbn(isbn);
      
      if(libro == null){
      System.out.println("No existe Libro con ese ISBN!");   }else{
        
        System.out.println("1)Baja ");
        System.out.println("2)Alta ");
        
        int op = enter.nextInt();
        switch(op) {
            case 1:
           libro.setAlta(false);
                System.out.println("Has dado de Baja el libro!");
            break;
            case 2: 
            libro.setAlta(true);
                 System.out.println("Has dado de Alta el libro!");
            break;
            default:
            throw new IllegalArgumentException("Opción inválida.");
        }
        
          daolibro.editar(libro);
      }
        }catch (InputMismatchException  i  ) {
             System.out.println("Debe ingresar un numero entero!");
         }catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero!");
         }
       
      
    
    }
    
    
    
    //ELIMINACION
    
     public void eliminarLibro()  {
         System.out.println("Eliminar Libro");
         System.out.println("-------------------");
         System.out.println("Ingrese Isbn del autor: ");
          try { 
         long isbn= enter.nextInt();
         daolibro.EliminarPorISBNLibro(isbn);
         } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero!");
         }
       
     
     
     }
    
    
    ///CONSULTAS
    
    
     public void ListaDeLibros(){
         System.out.println("Lista de Libros");
         System.out.println("---------------------");
   
         List<Libro>  lista  =  daolibro.listarTodosLosLibros();
     if(lista!=null){
         for (Libro aux : lista) {
             System.out.println(aux);
             
         }
     }
     }
     
 
     public void BuscarLibroPorISBN(){
         System.out.println("Buscar Autor por ISBN");
         System.out.println("-------------------------");
         System.out.println("Ingrese el ISBN: ");
         try {
          long isbn = enter.nextInt();
     
         if(daolibro.BuscarLibroPorIsbn(isbn)!=null ){
         System.out.println(daolibro.BuscarLibroPorIsbn(isbn));
          }

         } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero!");
         }
       

          
     }
     
     
    public void BuscarLibrosPorTitulo() throws Exception{
         System.out.println("Buscar libros  por Titulo");
         System.out.println("----------------------------- ");
         System.out.println("Ingrese el titulo: ");
      
        try { 
            String nombre = enter.next();
              if (nombre == null || nombre.trim().isEmpty()) {
        System.out.println("Debe ingresar el titulo!"); 
        throw new Exception("Debe ingresar el titulo!");
        }
           if(daolibro.BuscarLibroPorTitulo(nombre)!=null ){    
           System.out.println(daolibro.BuscarLibroPorTitulo(nombre));
     }
        
          } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero!");
         }   
     }  
    
    
   public Autor BuscarAutorDelLibroNuevo() throws Exception{
   
      System.out.println("Autores ");
      System.out.println("------------");
        Autor autor=null;    
        
        List<Autor> listaAutores =  daoAutor.listarTodosLosAutores() ;
        try{
       if(listaAutores!=null){
           for (Autor aux : listaAutores) {
               System.out.println(aux);
           }
          
           System.out.println("1) Ingresar un Autor de la lista");
           System.out.println("2) Ingresar un autor nuevo");
          
           int op= enter.nextInt();
           switch (op) {
               case 1: System.out.println("-----------------------------------");
                            System.out.println("Ingresar el ID del Autor ");
                            int aut = enter.nextInt();
                            autor =  daoAutor.BuscarAutorPorID(aut);
               break;  
              
               case 2: 
                   System.out.println("-----------------");
                   System.out.println("Nuevo Autor");
                 
                   System.out.println("Ingrese el nombre");     
                   String nm=enter.next();
                     if (nm == null || nm.trim().isEmpty()) {
                     System.out.println("Debe ingresar el nombre!"); 
                    throw new Exception("Debe ingresar el nombre!");
                    }
                   autor = new Autor(null, nm, true);
                   daoAutor.GuardarAutor(autor);
                  break;
                  default:
                  throw new IllegalArgumentException("Opción inválida: " );
          }
           }else{
                   System.out.println("-----------------");
                   System.out.println("Nuevo Autor");
                  
                   System.out.println("Ingrese el nombre");     
                   String nm=enter.next();
                    if (nm == null || nm.trim().isEmpty()) {
                    System.out.println("Debe ingresar el nombre!"); 
                    throw new Exception("Debe ingresar el nombre!");}
                   autor = new Autor(null, nm, true);
                   daoAutor.GuardarAutor(autor);
       
       
       } } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero!");
         }
       
     
 
   return autor;
   
   } 
    

    public Editorial BuscarEditorialDelLibroNuevo() throws Exception{
    
            System.out.println("Editoriales");
            System.out.println("---------------");
            Editorial edi=null;
            
            
            List<Editorial>   editoriales =  daoEditorial.listarTodosLosEditorial();
        
            for (Editorial aux : editoriales) {
                System.out.println(aux);
                
            }
            try{
            if(editoriales!=null){
            System.out.println("1) Ingresar un editorial de la lista");
            System.out.println("2) Crear  un editorial");
            int op = enter.nextInt();
            
            switch (op) {
            case 1:
                System.out.println("Ingrese el ID: ");   
                 int id=enter.nextInt();
                 edi = daoEditorial.BuscarEditorialPorID(id);
                 
                 break;
            case 2:
                   System.out.println("---------------------");
                   System.out.println("Nuevo Editorial");
                 
                   System.out.println("Ingrese el nombre");     
                   String nm=enter.next();
                      if (nm == null || nm.trim().isEmpty()) {
                     System.out.println("Debe ingresar el nombre!"); 
                    throw new Exception("Debe ingresar el nombre!");
                    }
                   edi = new Editorial(null, nm, true);
                   daoEditorial.GuardarEditorial(edi);
                  break;       
                  default:
                  throw new IllegalArgumentException("Opción inválida: " );    
            }
            
            
            }else{System.out.println("---------------------");
                      System.out.println("Nuevo Editorial");
                 
                   System.out.println("Ingrese el nombre");     
                   String nm=enter.next();
                    if (nm == null || nm.trim().isEmpty()) {
                     System.out.println("Debe ingresar el nombre!"); 
                    throw new Exception("Debe ingresar el nombre!");
                    }
                   edi = new Editorial(null, nm, true);
                   daoEditorial.GuardarEditorial(edi); }
          
            
            } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero!");
         }
       
     
    return edi;
    
    
    }
    
    public  void BuscarLibrosPorNombreDeAutor() throws Exception{
      try{
        System.out.println("Buscar Libro por nombe de autor");
        System.out.println("-------------------------------------------");
        String nombre =enter.next();
    
          if (nombre == null || nombre.trim().isEmpty()) {
                     System.out.println("Debe ingresar el nombre!"); 
                    throw new Exception("Debe ingresar el nombre!");
          }else{
        

        if(daolibro.BuscarLibrosPorNombreAutor(nombre) !=null ){
        List<Libro> lista = daolibro.BuscarLibrosPorNombreAutor(nombre);
            
            for (Libro libro : lista) {
                System.out.println(libro);
            }
            
     
        }

          }
         } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero!");
         }
       
      
    }
      
    public  void BuscarLibrosPorNombreDeEditorial() throws Exception{
        System.out.println("Buscar Libro por nombe de editorial");
        System.out.println("-----------------------------------------------");
       try{
        String nombre =enter.next();
         if (nombre == null || nombre.trim().isEmpty()) {
                     System.out.println("Debe ingresar el nombre!"); 
                    throw new Exception("Debe ingresar el nombre!");
         }else{
        
        
        if( daolibro.BuscarLibrosPorNombreEditorial(nombre)  != null ){
         List<Libro> lista = daolibro.BuscarLibrosPorNombreEditorial(nombre);
            
            for (Libro libro : lista) {
                System.out.println(libro);
            }

        
        }
        
         }
         } catch (InputMismatchException  e  ) {
             System.out.println("Debe ingresar un numero entero!");
         } catch(NoSuchElementException r){
             System.out.println("Debe ingresar un numero!");
         }
       
     
    
    }
    
    
    
    
    
    
    
    
}
