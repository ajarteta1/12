/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.jugador;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;
import proyecto_pokemon.main.Main;

/**
 *
 * @author jaam-_000
 */
public class Jugador {

    public static int yInicial = 0, xInicial = 0;
    public int x;
    public int y;
    public int alto;
    public int ancho;
    public Rectangle rect;

    public Jugador(int alto, int ancho) {
        this.x = (Main.alto / 2) + alto / 2;
        this.y = (Main.ancho / 2) + ancho / 2;
        this.alto = alto;
        this.ancho = ancho;
        rect = new Rectangle(x + 20, y + 20, alto, ancho);

    }

    public void tick() {
        rect.setBounds(x, y, alto, ancho);
    }

    public void render(Graphics2D g) {
        g.setColor(Color.red);
        g.fillRect(x, y, alto, ancho);
    }

}
