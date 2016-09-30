/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import proyecto_pokemon.jugador.Jugador;
import proyecto_pokemon.mapas.Mapa;
import proyecto_pokemon.terreno.Terreno;

/**
 *
 * @author jaam-_000
 */
public class Teclado implements KeyListener {
    boolean mover;

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

         mover = true;
        int newx = 0, newy = 0;
        if (ke.getKeyCode() == KeyEvent.VK_W) {
            newy += 1;
        }
        if (ke.getKeyCode() == KeyEvent.VK_S) {
            newy -= 1;
        }
        if (ke.getKeyCode() == KeyEvent.VK_A) {
            newx += 1;
        }

        if (ke.getKeyCode() == KeyEvent.VK_D) {
            newx -= 1;
        }
        for (Terreno t : Mapa.terrenos) {
            if (t.solido) {
                if (t.rect.intersects(newx, newy, Jugador.xInicial - newx, Jugador.yInicial - newy)) {
                    mover = false;
                }
            }

        }
        if (mover==true) {
            Jugador.xInicial += newx;
            Jugador.yInicial += newy;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
