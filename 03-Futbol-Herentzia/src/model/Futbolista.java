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
public class Futbolista extends IntegranteSeleccion {

    private int dorsal;
    private Demarkazioa demarcacion;
    
    

    public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, Demarkazioa demarcacion) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;

    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Demarkazioa getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(Demarkazioa demarcacion) {
        this.demarcacion = demarcacion;
    }

    public String entrenar() {
        return "entrenar";
    }

    public String jugarPartido() {
        return "jugar partido";
    }

}
