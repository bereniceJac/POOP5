/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 *
 * @author Jacinto Robledo Valeria Berenice
 * Clase que almacena los datos de una fecha
 */
public class Fecha {
    private int dia, mes, anio;
    
    /**
     * Constructor vacío de fecha
     */
    public Fecha() {
    }
    
    /**
     * Constructor lleno de fecha
     * @param dia dia de la fecha en int
     * @param mes mes de la fecha en int
     * @param anio año de la fecha en int
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    /**
     * Método que regresa el dia de la fecha
     * @return dia de la fecha
     */
    public int getDia() {
        return dia;
    }
    
    /**
     * Método que modifica el dia de la fecha
     * @param dia dia de la fecha
     */
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    /**
     * Método que regresa el mes de la fecha
     * @return mes de la fecha
     */
    public int getMes() {
        return mes;
    }
    
    /**
     * Método que modifica el mes de la fecha
     * @param mes mes de la fecha
     */
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    /**
     * Método que regresa el anio de la fecha
     * @return anio de la fecha
     */
    public int getAnio() {
        return anio;
    }
    /**
     * Método que modifica el anio de la fecha
     * @param anio anio de la fecha
     */
    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    /**
     * Método toString sobrescrito que muestra los valores de los atributos de la fecha
     * @return returna una concatenación de los valores de los atributos de la fecha
     */
    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
}
