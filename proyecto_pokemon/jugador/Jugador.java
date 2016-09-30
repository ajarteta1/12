/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.jugador;

import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;
import proyecto_pokemon.main.Main;
import proyecto_pokemon.mapas.Mapa;
import proyecto_pokemon.terreno.Terreno;

/**
 *
 * @author jaam-_000
 */
public class Jugador {

    public static int yInicial = 0, xInicial = 0;
    public static int x;
    public static int y;
    public static int dx;
    public static int dy;
    public int alto;
    public int ancho;
    public static Rectangle rect;
    boolean moverse;
    public Image imagen;

    public Jugador(int alto, int ancho) {
        this.x = (Main.alto / 2) + alto / 2;
        this.y = (Main.ancho / 2) + ancho / 2;
        this.alto = alto;
        this.ancho = ancho;
        rect = new Rectangle(x + 20, y + 20, alto, ancho);
        imagen = new ImageIcon(getClass().getResource("personaje.png")).getImage();
    }

    public void tick() {
        moverse = true;
        for (Terreno t : Mapa.terrenos) {
            if (t.solido) {
                if (t.rect.intersects(Jugador.x - dx, Jugador.y - dy, Jugador.rect.width, Jugador.rect.width)) {
                    moverse = false;
                }
            }
        }
        if (moverse) {
            Jugador.xInicial += dx;
            Jugador.yInicial += dy;
        }
        rect.setBounds(x, y, alto, ancho);
    }

    public void render(Graphics2D g) {
        g.setColor(Color.red);
        g.fillRect(x, y, 0, 0);
        g.drawImage(imagen, x, y, alto, ancho, null);
    }

}
