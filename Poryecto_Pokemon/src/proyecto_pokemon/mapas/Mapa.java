/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.mapas;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import proyecto_pokemon.jugador.Jugador;
import proyecto_pokemon.terreno.Terreno;
import proyecto_pokemon.terreno.TerrenoDirt;
import proyecto_pokemon.terreno.TerrenoGrass;

/**
 *
 * @author jaam-_000
 */
public class Mapa {

    public static ArrayList<Terreno> terrenos = new ArrayList<Terreno>();
    int altomapa, anchomapa;
Rectangle rect;
    public Jugador j;

    public Mapa(int altomapa, int anchomapa) {
        this.altomapa = altomapa;
        this.anchomapa = anchomapa;
        j = new Jugador(10, 10);
        generarmapa();
    }

    public void generarmapa() {
        Random r = new Random();
        Image imagen = null;
        int index;
        for (int x = 2; x < anchomapa + 2; x++) {
            for (int y = 2; y < altomapa + 2; y++) {
                index = r.nextInt(5);

                if (index == 0) {
                    terrenos.add(new TerrenoDirt(x * Terreno.size, y * Terreno.size));

                } else {
                    terrenos.add(new TerrenoGrass(x * Terreno.size, y * Terreno.size));
                }
            }

        }
        for (int x = 0; x < anchomapa + 4; x++) {
            for (int y = 0; y < 2; y++) {
                terrenos.add(new TerrenoDirt(x * Terreno.size, y * Terreno.size));
            }
            for (int y = altomapa; y < altomapa + 2; y++) {
                terrenos.add(new TerrenoDirt(x * Terreno.size, y * Terreno.size));
            }
        }
        for (int y = 2; y < anchomapa; y++) {
            for (int x = 0; x < 2; x++) {
                terrenos.add(new TerrenoDirt(x * Terreno.size, y * Terreno.size));
            }
            for (int x= altomapa+2; x< altomapa + 4; x++) {
                terrenos.add(new TerrenoDirt(x * Terreno.size, y * Terreno.size));
            }
        }
    }

    public void tick() {
        for (Terreno t : terrenos) {
            t.tick();
        }
        j.tick();
    }

    public void render(Graphics2D g) {
        for (Terreno t : terrenos) {
            t.render(g);
            j.render(g);
        }
    }

}
