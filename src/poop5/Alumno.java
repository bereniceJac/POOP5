/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que almacena los datos de alumno
 */
public class Alumno {
    private String nombre, apellido, carrera, escuela;
    private int semestre; //composición usar elementos de una clase dentro de otra clase
    private Fecha fNacimiento;
    
    /**
     * Constructor vacío de alumno
     */
    public Alumno() {
    }
    
    /**
     * Constructor lleno de alumno
     * @param nombre nombre del alumno en String
     * @param apellido apellido del alumno en String
     * @param carrera carrera del alumno en String
     * @param escuela escuela del alumno en String 
     * @param semestre semestre del alumno en int
     * @param fNacimiento fecha de nacimiento en tipo Fecha
     */
    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * Método que regresa el nombre del alumno
     * @return regresa el nombre del alumno
     */
    
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Método que modifica el nombre del alumno
     * @param nombre nombre del alumno
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método que regresa el apellido del alumno
     * @return regresa el apellido del alumno 
     */
    public String getApellido() {
        return apellido;
    }
    
    /**
     * Método que modifica el apellido del alumno
     * @param apellido apellido del alumno
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    /**
     * Método que regresa la carrera de alumno
     * @return carrera del alumno
     */
    public String getCarrera() {
        return carrera;
    }
    
    /**
     * Método que modifica la carrera del alumno
     * @param carrera  carrera del alumno
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    /**
     * Método que regresa la escuela del alumno
     * @return la escuela del alumno
     */
    public String getEscuela() {
        return escuela;
    }
    
    /**
     * Método que modifica la escuela del alumno
     * @param escuela escuela del alumno
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    
    /**
     * Método que regresa el semestre del alumno
     * @return el semestre del alumno
     */
    public int getSemestre() {
        return semestre;
    }
    
    /**
     * Método que modifica el semestre del alumno
     * @param semestre semestre del alumno
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    /**
     * Método que regresa la fecha de nacimiento del alumno
     * @return la fecha de nacimiento del alumno
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }
    
    /**
     * Método que modifica la fecha de nacimiento del alumno
     * @param fNacimiento fecha de nacimiento del alumno
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * Método que imprime una frase que da a entender que el alumno se fue a dormir
     */
    public void dormir(){
        System.out.println("Mimido");
    }
    
    /**
     * Método que imprime una frase que da entender que el alumno está comiendo
     */
    public void comer (){
        System.out.println("Comiendo");
    }
    
    /**
     * Método que imprime una frase que da a entender que el alumno estudia
     */
    public void estudiar(){
        System.out.println("Estudiando");
    }
    
    /**
     * Método que imprime una frase que da entender que el alumno trabaja
     */
    public void trabajar(){
        System.out.println("Chambeando");
    }
    
   /**
     * Método que imprime una frase que da entender que el alumno juega
     */
    public void jugar(){
        System.out.println("Mood gamer");
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos del alumno
     * @return returna una concatenación de los valores de los atributos del alumno
     */
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", carrera=" + carrera + ", escuela=" + escuela + ", semestre=" + semestre + ", fNacimiento=" + fNacimiento + '}';
    }
}
