/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enumak.Demarkazioa;

/**
 *
 * @author agirrezabala.peru
 */
public class IntegranteSeleccion {

    public static void add(int i, String aitor, String fernandez, int i0, int i1, Demarkazioa demarkazioa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void add(int i, String javier, String clemente, int i0, String rfef) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void add(int i, String iñaki, String sertxiberrieta, int i0, String fisioterapia, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected int id;
    protected String nombre;
    private String apellidos;
    private int edad;
    
    public IntegranteSeleccion(){
        
    }

    public IntegranteSeleccion(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String concentrarse() {
        return "Concentrarse";
    }

    public String viajar() {
        return "Viajar";
    }

}
