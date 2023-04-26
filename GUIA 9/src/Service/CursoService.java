
package Service;

import Entidades.Curso;

import java.util.Scanner;

/**
 *
 * @author Matias
 */
public class CursoService {
    Scanner enter = new Scanner(System.in);
    
    
    
    
    ///RETORNA VECTO CON ALUMNOS
    public String[] cargarAlumnos(){
    
        System.out.println("ALUMNOS");
        System.out.println("--------");
    
        //String alumnos []= new String [5];
        String alumnos[]=new String [5];
        for (int i = 0; i < alumnos.length; i++) {
            System.out.println("Ingrese el nombre del alumno : ");
            String nombre = enter.next();
            alumnos[i]=nombre;
         }
    
    return alumnos;
    }
    
    
    
    public Curso crearCurso(){
    
        Curso newcurso= new Curso();
        
        System.out.println("CREAR CURSO");
        System.out.println("-----------");
        System.out.println("");
    
        System.out.println("Ingrese el nombre del curso: ");
        newcurso.setNombreCurso(enter.next());
        System.out.println("");
        System.out.println("Ingrese la cantida de horas por dia: ");
        newcurso.setCantidadHorasdia(enter.nextInt());
        System.out.println("");
        System.out.println("Ingrese la cantidad de dias a la semana: ");
        newcurso.setCantidaddiasporsemana(enter.nextInt());
        System.out.println("");
        System.out.println("Ingrese el turno:  mañana o tarde");
        String turno=enter.next().toLowerCase();
        
        while (!"manana".equals(turno) && !"tarde".equals(turno) ){
        System.out.println("Turno incorrecto ingrese mañana o tarde!");
        turno=enter.next();
        }
        
        newcurso.setTurno(turno);
        System.out.println("");
        System.out.println("Ingrese el precio por hora: ");
        newcurso.setPrecioporhora(enter.nextInt());
        System.out.println("");
        newcurso.setAlumnos(cargarAlumnos());
        System.out.println("");
    return newcurso;
    }
    
    
    public void calcularGananciasema(Curso newcurso){
    
        System.out.println("CALCULA LA GANANCIA DE LA SEMANA");
        System.out.println("--------------------------------");
    int ganancia=newcurso.getCantidadHorasdia()*newcurso.getPrecioporhora()*5*newcurso.getCantidaddiasporsemana();
    
        System.out.println("La ganancia semanal fue de $ "+ganancia);
    
    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
