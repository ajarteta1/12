/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import proyecto_pokemon.jugador.Jugador;

/**
 *
 * @author jaam-_000
 */
public class Teclado implements KeyListener {

    boolean moverse;

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

        Jugador.dx = 0;
        Jugador.dy = 0;

        if (ke.getKeyCode() == KeyEvent.VK_W) {
            Jugador.dy += 2;
        }
        if (ke.getKeyCode() == KeyEvent.VK_S) {
            Jugador.dy -= 2;
        }
        if (ke.getKeyCode() == KeyEvent.VK_A) {
            Jugador.dx += 2;
        }

        if (ke.getKeyCode() == KeyEvent.VK_D) {
            Jugador.dx -= 2;
        }

        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            Jugador.dy += 2;
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            Jugador.dy -= 2;
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            Jugador.dx += 2;
        }

        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            Jugador.dx -= 2;
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        if (ke.getKeyCode() == KeyEvent.VK_W) {
            Jugador.dy = 0;
        }
        if (ke.getKeyCode() == KeyEvent.VK_S) {
            Jugador.dy = 0;
        }
        if (ke.getKeyCode() == KeyEvent.VK_A) {
            Jugador.dx = 0;
        }

        if (ke.getKeyCode() == KeyEvent.VK_D) {
            Jugador.dx = 0;
        }
        if (ke.getKeyCode() == KeyEvent.VK_UP) {
            Jugador.dy = 0;
        }
        if (ke.getKeyCode() == KeyEvent.VK_DOWN) {
            Jugador.dy = 0;
        }
        if (ke.getKeyCode() == KeyEvent.VK_LEFT) {
            Jugador.dx = 0;
        }

        if (ke.getKeyCode() == KeyEvent.VK_RIGHT) {
            Jugador.dx = 0;
        }
    }

}
