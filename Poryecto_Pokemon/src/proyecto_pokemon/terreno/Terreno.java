/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.terreno;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import proyecto_pokemon.jugador.Jugador;
import java.awt.Rectangle;

/**
 *
 * @author jaam-_000
 */
public class Terreno {

    public static final int size = 20;
    public int x;
    public int y;
    public Image image;
    public boolean solido;
    public TipoDeTerreno tipodeterreno;
    public Rectangle rect = new Rectangle();

    public Terreno(int x, int y, boolean solido, TipoDeTerreno tipodeterreno) {
        this.x = x;
        this.y = y;
        this.solido = solido;
        if (tipodeterreno == tipodeterreno.GRASS) {
            this.image = new ImageIcon(getClass().getResource("grass.png")).getImage();
        } else {
            this.image = new ImageIcon(getClass().getResource("dirt.png")).getImage();
        }

    }

    public void tick() {
        rect.setBounds(x, y, size, size);
    }

    public void render(Graphics2D g) {
        g.drawImage(image, x + Jugador.xInicial, y + Jugador.yInicial, size, size, null);
    }
}
