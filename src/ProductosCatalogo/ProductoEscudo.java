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
public abstract class ProductoEscudo {
    protected Escudo escudo;

    public Escudo getEscudo() {
        return escudo;
    }

    public void setEscudo(Escudo escudo) {
        this.escudo = escudo;
    }
    
}
