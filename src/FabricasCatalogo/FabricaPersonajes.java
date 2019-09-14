/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FabricasCatalogo;
import PersonajesCatalogo.*;
import ProductosCatalogo.*;
/**
 *
 * @author lenovo
 */
public abstract class FabricaPersonajes {
    
    protected Personaje personaje;
    protected String nArma;
    protected String nEscudo;
    protected ProductoArma arma;
    protected ProductoEscudo escudo;
    protected ProductoCuerpo cuerpo;
    
    public abstract void crearEscudo();
    public abstract void crearArma();
    public abstract void crearCuerpo();

    public Personaje getPersonaje() {
        return personaje;
    }

    public String getnArma() {
        return nArma;
    }

    public String getnEscudo() {
        return nEscudo;
    }

    public ProductoArma getArma() {
        return arma;
    }

    public ProductoEscudo getEscudo() {
        return escudo;
    }

    public ProductoCuerpo getCuerpo() {
        return cuerpo;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public void setnArma(String nArma) {
        this.nArma = nArma;
    }

    public void setnEscudo(String nEscudo) {
        this.nEscudo = nEscudo;
    }

    public void setArma(ProductoArma arma) {
        this.arma = arma;
    }

    public void setEscudo(ProductoEscudo escudo) {
        this.escudo = escudo;
    }

    public void setCuerpo(ProductoCuerpo cuerpo) {
        this.cuerpo = cuerpo;
    }
    
}
