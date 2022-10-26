/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad01_04;

/**
 *
 * @author morti
 */
public class Jugador extends Persona{
    
    private String nombre;
    private int fechaNacimiento;
    private String posicion;
    private Seleccion equipo;
    
    
    public String mostrarInfo(){
        return this.getNombre()+" juega en la selección de "+this.equipo.getNombre();
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPosicion() {
        return posicion;
    }

    public Seleccion getEquipo() {
        return equipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEquipo(Seleccion equipo) {
        this.equipo = equipo;
    }
    
}