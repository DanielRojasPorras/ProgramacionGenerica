/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.progra.programaciongenerica.elementos;

/**
 *
 * @author drios
 */
public class Chocolate {

    private String marca;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Chocolate(String marca) {
        super();
        this.marca = marca;
    }
}
