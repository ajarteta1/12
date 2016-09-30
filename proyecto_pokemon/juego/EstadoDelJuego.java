/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.juego;

import java.awt.Graphics2D;

/**
 *
 * @author jaam-_000
 */
public abstract class EstadoDelJuego {
    public abstract void init();
    public abstract void tick();
    public abstract void render(Graphics2D g);
}
