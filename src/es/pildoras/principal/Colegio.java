package es.pildoras.principal;

import java.util.*;

public class Colegio {

    public Colegio(String nombre, String direccion, String telefono, String director, int capacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.director = director;
        this.capacidad = capacidad;
    }

    public void matricularEstudiante(Estudiante estudiante) {

        if (estudiantes.size() < capacidad) {
            estudiantes.add(estudiante);
        } else {
            System.out.println("Capacidad Máxima Alcanzada");
        }
    }

    public void expulsarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    public void contratarProfesor(String profesor) {

        profesores.add(profesor);


    }

    public void despedirProfesor(String profesor) {
        profesores.remove(profesor);
    }

    public void agregarCurso(String curso) {
        cursos.add(curso);
    }

    public void eliminarCurso(String curso) {
        cursos.remove(curso);
    }

    public String getDatosColegio() {
        return "Nombre: " + nombre + " Direccion: " + direccion + " Telefono " + telefono + " Capacidad " + capacidad + " Director " + director;
    }

    public void setDatosColegio(String nombre, String direccion, String telefono, int capacidad, String director) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.capacidad = capacidad;
        this.director = director;
    }

    // Método para matricular a un Estudiante
    public void matricularEstudiante(Estudiante estudiante, String curso) {
        if (estudiantes.size() < capacidad) {
            if (cursos.contains(curso)) {
                estudiante.inscribirCurso(curso);
                estudiantes.add(estudiante);
            } else {
                System.out.println("El curso no se imparte en el Colegio");
            }
        } else {
            System.out.println("Capacidad Maxima Alcanzada");
        }
    }

    // Método para obtener la lista de cursos
    public List<String> obtenerCursos() {
        return cursos;
    }

    private String nombre;
    private String direccion;
    private String telefono;
    private String director;
    private int capacidad;

    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<String> profesores = new ArrayList<>();
    private List<String> cursos = new ArrayList<>();
}