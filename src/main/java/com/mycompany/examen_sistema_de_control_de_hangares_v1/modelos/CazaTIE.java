/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_sistema_de_control_de_hangares_v1.modelos;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

/**
 *
 * @author jfabr
 */
@Entity
@DiscriminatorValue("CAZA")
public class CazaTIE extends NaveGalactica{

    private int indiceManiobra;

    public CazaTIE() {
    }

    public CazaTIE(String nombre, int indiceManiobra) {
        super(nombre);
        this.indiceManiobra = indiceManiobra;
    }

    public int getIndiceManiobra() {
        return indiceManiobra;
    }

    public void setIndiceManiobra(int indiceManiobra) {
        this.indiceManiobra = indiceManiobra;

    }
}
