/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonajesCatalogo;

import PersonajesCatalogo.Armas.*;

/**
 *
 * @author lenovo
 */
public class Personaje {
    
    private Arma arma;
    private Escudo escudo;

    public Personaje() {
    }

    public Arma getArma() {
        return arma;
    }

    public Escudo getEscudo() {
        return escudo;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }
    
}
