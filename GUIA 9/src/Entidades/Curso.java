/*
 *cuyos atributos serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno (mañana o tarde),  
precioPorHora y alumnos. Donde alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los nombres de cada alumno.
A continuación, se implementarán los siguientes métodos:

 */
package Entidades;

/**
 *
 * @author Matias Insaurralde
 */
public class Curso {
    
 private String nombreCurso;   
 private int    cantidadHorasdia;   
 private int    cantidaddiasporsemana;   
 private String turno;   
 private int    precioporhora;   
 private String  alumnos[] ;   

 
 
 public Curso() {
    }

 
 
    public Curso(String nombreCurso, int cantidadHorasdia, int cantidaddiasporsemana, String turno, int precioporhora,String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasdia = cantidadHorasdia;
        this.cantidaddiasporsemana = cantidaddiasporsemana;
        this.turno = turno;
        this.precioporhora = precioporhora;
        this.alumnos = alumnos;
    }

    

    
    
    
    
    
    
    
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasdia() {
        return cantidadHorasdia;
    }

    public void setCantidadHorasdia(int cantidadHorasdia) {
        this.cantidadHorasdia = cantidadHorasdia;
    }

    public int getCantidaddiasporsemana() {
        return cantidaddiasporsemana;
    }

    public void setCantidaddiasporsemana(int cantidaddiasporsemana) {
        this.cantidaddiasporsemana = cantidaddiasporsemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioporhora() {
        return precioporhora;
    }

    public void setPrecioporhora(int precioporhora) {
        this.precioporhora = precioporhora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
