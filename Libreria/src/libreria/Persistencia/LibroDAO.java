package libreria.Persistencia;

import java.util.List;
import javax.persistence.NoResultException;

import libreria.Entidades.Libro;

/**
 *
 * @author Matias Insaurralde
 */
public class LibroDAO extends DAO {

    
    
   
    
    
    public void GuardarLibro(Libro libro) {
    super.guardar(libro);
    }

    public void editar(Libro libro){
    super.editar(libro);
    }
    
    public void EliminarPorISBNLibro(long isbn) {
        conectar();

        Libro libro = null;

        try {

            libro = em.find(Libro.class, isbn);  ///SI USAMOS EL METODO BUSCAR POR ID NO FUNCIONA
            if (libro == null) {
                throw new Exception("El ISBN ingresado no existe!");
            }

            eliminar(libro);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            desconectar();

        }

    }
    
    
    
    
    
    
    
    
    
    public List<Libro> listarTodosLosLibros() {
        conectar();

        List<Libro> libros = null;

        try {
            libros = em.createQuery("SELECT p FROM Libro p").getResultList();
            if (libros == null) {

                throw new Exception("No hay libros!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {

            desconectar();
        }

        return libros;
    }

    public Libro BuscarLibroPorTitulo(String titulo) {
        conectar();
        Libro libro = null;
        try {
            libro = (Libro) em.createQuery("SELECT m FROM Libro m WHERE m.titulo LIKE :titulo").setParameter("titulo", titulo).getSingleResult();
         

        } catch ( NoResultException  e) {
            System.out.println("No existe este Titulo! " );
        
        } finally {
            desconectar();
        }

        return libro;
    }

    public Libro BuscarLibroPorIsbn(long isbn) {
        conectar();

        Libro libro = null;

        try {
             libro = em.find(Libro.class, isbn);
            
            if (libro == null) {
                throw new Exception("El ISBN ingresado no existe!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            desconectar();
        }

        return libro;
    }
    
    public List<Libro> BuscarLibrosPorNombreAutor(String nombre){
          
             conectar();
        List<Libro> libros = null;
    
        try {
            libros =  em.createQuery("SELECT a FROM Libro a JOIN a.autor b  WHERE b.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
         

        } catch ( NoResultException  e) {
            System.out.println("No existen libros con ese nombre de Autor " );
        
        } finally {
            desconectar();
        }

        return libros;
    
    }

  public List<Libro> BuscarLibrosPorNombreEditorial(String nombre){
           conectar();
        List<Libro> libros = null;
        try {
            libros =  em.createQuery("SELECT a FROM Libro a JOIN a.editorial b  WHERE b.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
         

        } catch ( NoResultException  e) {
            System.out.println("No existen libros con ese nombre de Editorial! " );
        
        } finally {
            desconectar();
        }

        return libros;
    
    }



}
