
package Mains;

import Service.CursoService;

/**
 *
 * @author Matias
 */
import Entidades.Curso;
public class EJ6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      CursoService cc = new CursoService();
        
        
      Curso curso1 = cc.crearCurso();
     
      cc.calcularGananciasema(curso1);







    }
    
}
