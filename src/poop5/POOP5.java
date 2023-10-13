/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase principal que muestra el uso de las clase alumno y fecha
 */
public class POOP5 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Se crea un objeto de la clase Alumno
         * Con los métodos setNombre() y setApellido se modifican esos atributos
         * Se imprime toda la información del alumno
         */
        Alumno alumno =new Alumno();                                                 //se inicializa con NULL
        alumno.setNombre("Sandra");                                               //modifica el nombre del alumno
        alumno.setApellido("Martinez");
        System.out.println(alumno);
        
        /**
         * Se crea un objeto de la clase fecha e inicializa con el constructor lleno, dando valores para dia, mes y anio
         * Se crea un segundo objeto de la clase Alumno, y se inicializa con el constructor lleno, dando valores para todos sus atributos
         * Se imprime toda la información del segundo alumno
         */
        Fecha fecha =new Fecha(17,7,2004);
        Alumno alu2 =new Alumno("Alfredo","Mendoza",
                "Computacion","FI",3,fecha);
        System.out.println(alu2);
    }
}
