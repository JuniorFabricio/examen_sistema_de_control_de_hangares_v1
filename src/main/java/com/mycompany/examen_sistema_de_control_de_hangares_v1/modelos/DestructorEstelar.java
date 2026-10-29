/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_sistema_de_control_de_hangares_v1.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

/**
 *
 * @author jfabr
 */
@Entity
@Table(name = "destructores_estelares_joined")
@PrimaryKeyJoinColumn(name = "nave_id")
public class DestructorEstelar extends NaveGalactica {

    private int potenciaEscudos;

    public DestructorEstelar() {
    }

    public DestructorEstelar(String nombre, int potenciaEscudos) {
        super(nombre);
        this.potenciaEscudos = potenciaEscudos;
    }

    public int getPotenciaEscudos() {
        return potenciaEscudos;
    }

    public void setPotenciaEscudos(int potenciaEscudos) {
        this.potenciaEscudos = potenciaEscudos;
    }

}
