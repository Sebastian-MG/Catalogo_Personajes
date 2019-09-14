/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalogopersonajes;

import InterfazCatalogo.GUICatalogo;
import java.awt.Color;

/**
 *
 * @author lenovo
 */
public class CatalogoPersonajes {

    public CatalogoPersonajes() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GUICatalogo cat = new GUICatalogo();
        //cat.setBounds(0, 0, 865, 543);
        cat.setLocationRelativeTo(null);
        cat.getContentPane().setBackground(Color.yellow);
        cat.setVisible(true);
    }
    
}
