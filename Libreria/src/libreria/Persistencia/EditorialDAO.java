package libreria.Persistencia;

import java.util.List;

import libreria.Entidades.Editorial;

/**
 *
 * @author Matias Insaurralde
 */
public class EditorialDAO extends DAO {

    public void GuardarEditorial(Editorial edi) {
        guardar(edi);
    }

    public void editar(Editorial edi) {

        super.editar(edi);

    }

    public void EliminarEditorailPorID(int id) {
        conectar();

        Editorial edi = null;

        try {

            edi = em.find(Editorial.class, id);  ///SI USAMOS EL METODO BUSCAR POR ID NO FUNCIONA
            if (edi == null) {
                throw new Exception("El ID ingresado no existe!");
            }

            eliminar(edi);

        } catch (Exception e) {

            System.out.println(e.getMessage());

        } finally {

            desconectar();

        }

    }

    

    
    
    
    
    public List<Editorial> listarTodosLosEditorial() {
        conectar();

        List<Editorial> edis = null;

        try {
            edis = em.createQuery("SELECT p FROM Editorial p").getResultList();
            if (edis == null) {

                throw new Exception("No hay autores!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {

            desconectar();
        }

        return edis;
    }

    public Editorial BuscarEditorialPorNombre(String nombre) {
        conectar();
        Editorial edi = null;
        try {
            edi = (Editorial) em.createQuery("SELECT m FROM Editorial m WHERE m.nombre LIKE :nombre").setParameter("nombre", nombre).getSingleResult();
            if (edi == null) {
                throw new Exception("No existe un autor con ese nombre!");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            desconectar();
        }

        return edi;
    }

    public Editorial BuscarEditorialPorID(int id) {
        conectar();
        Editorial edi = em.find(Editorial.class, id);

        try {

            if (edi == null) {
                throw new Exception("El ID ingresado no existe!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            desconectar();
        }

        return edi;
    }

}
