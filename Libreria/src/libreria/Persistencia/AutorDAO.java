package libreria.Persistencia;

import java.util.List;

import libreria.Entidades.Autor;

/**
 *
 * @author Matias Insaurralde
 */
public class AutorDAO extends DAO {

    
    
    
    
    public void GuardarAutor(Autor autor) {
    guardar(autor);
    }

    public void editar(Autor autor) {

        super.editar(autor);

    }

     public void EliminarPorID(int id) {
        conectar();

        Autor autor = null;

        try {

            autor = em.find(Autor.class, id);  ///SI USAMOS EL METODO BUSCAR POR ID NO FUNCIONA
            if (autor == null) {
                throw new Exception("El ID ingresado no existe!");
            }

            eliminar(autor);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            desconectar();

        }

    }


     
     
    public List<Autor> listarTodosLosAutores() {
        conectar();

        List<Autor> autores = null;

        try {
            autores = em.createQuery("SELECT p FROM Autor p").getResultList();
            if (autores == null) {

                throw new Exception("No hay autores!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {

            desconectar();
        }

        return autores;
    }

    public Autor BuscarAutorPorNombre(String nombre) {
        conectar();
        Autor autor = null;
        try {
            autor = (Autor) em.createQuery("SELECT m FROM Autor m WHERE m.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
            if (autor == null) {
                throw new Exception("No existe un autor con ese nombre!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            desconectar();
        }

        return autor;
    }

    public Autor BuscarAutorPorID(int id) {
        conectar();
        Autor autor = null; 

        try {
           autor = em.find(Autor.class, id);
            if (autor == null) {
                throw new Exception("El ID ingresado no existe!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            desconectar();
        }

        return autor;
    }

}
