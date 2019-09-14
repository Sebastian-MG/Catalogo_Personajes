/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductosCatalogo;

import PersonajesCatalogo.Armas.*;
/**
 *
 * @author lenovo
 */
public abstract class ProductoArma {
    protected Arma arma;

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }
    
}
