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
    int enemigostotal = 1000;

    @Override
    public void init() {
        mapa = new Mapa(25, 25,true);
    }

    @Override
    public void tick() {
        mapa.tick();
    }

    @Override
    public void render(Graphics2D g) {
        if (g != null) {
            g.setColor(Color.black);
            if (enemigostotal != 0) {
                mapa.render(g);
                enemigostotal-=1;
            }
            if (enemigostotal==0) {
                enemigostotal=1000;     
                mapa=new Mapa(25,25,false);
                mapa = new Mapa(25, 25,true);


            }
        }

    }

}
