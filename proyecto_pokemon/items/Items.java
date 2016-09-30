/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.items;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author jaam-_000
 */
public class Items {
    public String nombre;
    public Image imagen;

    public Items(String nombre) {
        this.nombre = nombre;
        this.imagen = new ImageIcon(getClass().getResource("Item.png")).getImage();
    }

    public String getNombre() {
        return nombre;
    }

    
}
