/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.juego;

import java.awt.Color;
import java.awt.Graphics2D;
import proyecto_pokemon.mapas.Mapa;

/**
 *
 * @author jaam-_000
 */
public class Jugar extends EstadoDelJuego {

    Mapa mapa;

    @Override
    public void init() {
        mapa = new Mapa(25, 25);
    }

    @Override
    public void tick() {
        mapa.tick();
    }

    @Override
    public void render(Graphics2D g) {
        mapa.render(g);
    }

}
