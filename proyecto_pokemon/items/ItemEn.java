/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.items;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import proyecto_pokemon.terreno.Terreno;

/**
 *
 * @author jaam-_000
 */
public class ItemEn {

    Terreno terreno;
    boolean visible;//para pokemons legendarios
    public Rectangle rect = new Rectangle();
    public String nombre;
    public Image imagen;

    public ItemEn(String nombre) {
        this.nombre = nombre;
        this.imagen = new ImageIcon(getClass().getResource("Item.png")).getImage();
    }
    public String getNombre() {
        return nombre;
    }
    public void tick() {
        //  rect.setBounds(x + Jugador.xInicial, y + Jugador.yInicial, size, size);
    }

    public void render(Graphics2D g) {
        imagen = new ImageIcon(getClass().getResource("Item.png")).getImage();
//        g.drawImage(imagen, terreno.x + 10, terreno.y + 10, terreno.size - 20, terreno.size - 20, null);
    }

}
