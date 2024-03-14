package es.pildoras.principal;

import java.util.ArrayList;
import java.util.*;

public class Estudiante {


    public Estudiante(String nombre, String apellido, String fechaNacimiento, String curso, String direccion, String telefono, String email, Colegio colegio) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.curso = curso;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.colegio = colegio;
    }

    public void inscribirCurso(String curso) {
        if (colegio.obtenerCursos().contains(curso)) {
            cursosInscritos.add(curso);
        } else {
            System.out.println("El curso no se imparte en el Colegio");
        }
    }

    public List<String> obtenerCursosInscritos() {
        return cursosInscritos;
    }

    public void setDatosContacto(String direccion, String telefono, String email) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getDatosEstudiante() {
        return "ID: " + id + " Nombre: " + nombre + " Apellido: " + apellido + " Fecha de Nacimiento: " + fechaNacimiento + " Curso: " + curso + " Direccion: " + direccion + " Telefono: " + telefono + " Email: " + email;
    }

    private String id;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String curso;
    private String direccion;
    private String telefono;
    private String email;
    private Colegio colegio;

    private List<String> cursosInscritos = new ArrayList<>();


}