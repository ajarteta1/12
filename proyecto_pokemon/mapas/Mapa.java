/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.mapas;

import java.awt.Graphics2D;

import java.util.ArrayList;
import java.util.Random;
import proyecto_pokemon.inventario.Inventario;
import proyecto_pokemon.items.ItemEn;
import proyecto_pokemon.items.Items;
import proyecto_pokemon.jugador.Jugador;
import proyecto_pokemon.terreno.Terreno;
import proyecto_pokemon.terreno.TerrenoDIRT;
import proyecto_pokemon.terreno.TerrenoHOT;
import proyecto_pokemon.terreno.TerrenoICE;
import proyecto_pokemon.terreno.TerrenoROCK;
import proyecto_pokemon.terreno.TerrenoSTEEL;
import proyecto_pokemon.terreno.TerrenoTREE;
import proyecto_pokemon.terreno.TerrenoWATER;
import proyecto_pokemon.terreno.TerrenoGRASS;

/**
 *
 * @author jaam-_000
 */
public class Mapa {

    public static ArrayList<Terreno> terrenos = new ArrayList();
    public static ArrayList<ItemEn> itemen = new ArrayList();
    int altomapa, anchomapa;

    public Jugador j;
    public Inventario inventario;

    public Mapa(int altomapa, int anchomapa, boolean b) {
        this.altomapa = altomapa;
        this.anchomapa = anchomapa;
        j = new Jugador(60, 60);
        inventario = new Inventario(80, 40);
        if (b) {
            generarmapa();
        } else {
            generarmapab();
        }

    }

    public void generarmapab() {
            terrenos.removeAll(terrenos);


        for (int y = -20; y < altomapa + 20; y++) {
            for (int x = -20; x < anchomapa + 20; x++) {
                terrenos.add(new TerrenoGRASS(x * Terreno.size, y * Terreno.size));
            }
            for (int x = anchomapa; x < anchomapa + 20; x++) {
                terrenos.add(new TerrenoGRASS(x * Terreno.size, y * Terreno.size));
            }
        }
    }

    public void generarmapa() {
        Random r = new Random();
        int index;
        for (int x = 5; x < anchomapa - 5; x++) {
            for (int y = 0; y < altomapa; y++) {
                index = r.nextInt(11);
                switch (index) {
                    case 0:
                        terrenos.add(new TerrenoDIRT(x * Terreno.size, y * Terreno.size));
                        break;
                    case 1:
                        terrenos.add(new TerrenoROCK(x * Terreno.size, y * Terreno.size));
                        break;
                    case 2:
                        terrenos.add(new TerrenoWATER(x * Terreno.size, y * Terreno.size));
                        break;
                    default:
                        terrenos.add(new TerrenoGRASS(x * Terreno.size, y * Terreno.size));
                        break;
                }
            }
        }
        for (int y = 5; y < altomapa - 5; y++) {
            for (int x = 0; x < 5; x++) {
                index = r.nextInt(11);
                switch (index) {
                    case 0:
                        terrenos.add(new TerrenoDIRT(x * Terreno.size, y * Terreno.size));
                        break;
                    case 1:
                        terrenos.add(new TerrenoROCK(x * Terreno.size, y * Terreno.size));
                        break;
                    case 2:
                        terrenos.add(new TerrenoWATER(x * Terreno.size, y * Terreno.size));
                        break;
                    default:
                        terrenos.add(new TerrenoGRASS(x * Terreno.size, y * Terreno.size));
                        break;
                }
            }
            for (int x = anchomapa - 5; x < anchomapa; x++) {
                index = r.nextInt(11);
                switch (index) {
                    case 0:
                        terrenos.add(new TerrenoDIRT(x * Terreno.size, y * Terreno.size));
                        break;
                    case 1:
                        terrenos.add(new TerrenoROCK(x * Terreno.size, y * Terreno.size));
                        break;
                    case 2:
                        terrenos.add(new TerrenoWATER(x * Terreno.size, y * Terreno.size));
                        break;
                    default:
                        terrenos.add(new TerrenoGRASS(x * Terreno.size, y * Terreno.size));
                        break;
                }
            }
        }
        for (int y = -20; y < altomapa + 20; y++) {
            for (int x = -20; x < 0; x++) {
                terrenos.add(new TerrenoTREE(x * Terreno.size, y * Terreno.size));
            }
            for (int x = anchomapa; x < anchomapa + 20; x++) {
                terrenos.add(new TerrenoTREE(x * Terreno.size, y * Terreno.size));
            }
        }
        for (int x = 0; x < anchomapa; x++) {
            for (int y = -20; y < 0; y++) {
                terrenos.add(new TerrenoTREE(x * Terreno.size, y * Terreno.size));
            }
            for (int y = altomapa; y < altomapa + 20; y++) {
                terrenos.add(new TerrenoTREE(x * Terreno.size, y * Terreno.size));

            }
        }

        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                terrenos.add(new TerrenoGRASS(x * Terreno.size, y * Terreno.size));
                itemen.add(new ItemEn("Item"));
            }
            for (int y = altomapa - 5; y < altomapa; y++) {
                terrenos.add(new TerrenoSTEEL(x * Terreno.size, y * Terreno.size));
            }
        }
        for (int x = anchomapa - 5; x < anchomapa; x++) {
            for (int y = 0; y < 5; y++) {
                terrenos.add(new TerrenoICE(x * Terreno.size, y * Terreno.size));
            }
            for (int y = altomapa - 5; y < altomapa; y++) {
                terrenos.add(new TerrenoHOT(x * Terreno.size, y * Terreno.size));
            }
        }
    }

    public void tick() {
        for (Terreno t : terrenos) {
            t.tick();
        }
        for (ItemEn i : itemen) {
            i.tick();
        }
        j.tick();
        inventario.tick();
    }

    public void render(Graphics2D g) {
        for (Terreno t : terrenos) {
            t.render(g);

        }
        for (ItemEn i : itemen) {
            i.render(g);
        }

        j.render(g);
        inventario.render(g);
    }

}
