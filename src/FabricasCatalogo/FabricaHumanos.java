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
public class FabricaHumanos extends FabricaPersonajes{

    public FabricaHumanos() {
        this.personaje=new Humano();
    }
    
    @Override
    public void crearCuerpo(){
        cuerpo = new ProductoElfo();
    }
    
    @Override
    public void crearArma(){
        ProductoArma Arma;
        switch(this.nArma){
            case "Espada":
                Arma = new ProductoEspada();
                break;
            case "Arco":
                Arma = new ProductoArco();
                break;
            case "Lanza":
                Arma = new ProductoLanza();
                break;
            default:
                Arma = null;
                break;
        }
        this.arma = Arma;
    }
    
    @Override
    public void crearEscudo(){
        ProductoEscudo Escudo;
        switch(this.nEscudo){
            case "Madera":
                Escudo = new ProductoEMadera();
                break;
            case "Hierro":
                Escudo = new ProductoEHierro();
                break;
            case "Adamantium":
                Escudo = new ProductoEAdamantium();
                break;
            default:
                Escudo = null;
                break;
        }
        this.escudo = Escudo;
    }
    
}
