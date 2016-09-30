/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.terreno;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.ImageIcon;
import proyecto_pokemon.items.ItemEn;
import proyecto_pokemon.items.Pokemon;
import proyecto_pokemon.jugador.Jugador;

/**
 *
 * @author jaam-_000
 */
public class Terreno {

    public static final int size = 100;
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
        if (null != tipodeterreno) {
            switch (tipodeterreno) {
                case GRASS:
                    this.image = new ImageIcon(getClass().getResource("grass.png")).getImage();
                    break;
                case DIRT:
                    this.image = new ImageIcon(getClass().getResource("dirt.png")).getImage();
                    break;
                case TREE:
                    this.image = new ImageIcon(getClass().getResource("tree.png")).getImage();
                    break;
                case WATER:
                    this.image = new ImageIcon(getClass().getResource("water.png")).getImage();
                    break;
                case STEEL:
                    this.image = new ImageIcon(getClass().getResource("steel.png")).getImage();
                    break;
                case ICE:
                    this.image = new ImageIcon(getClass().getResource("ice.png")).getImage();
                    break;
                case ROCK:
                    this.image = new ImageIcon(getClass().getResource("rock.png")).getImage();
                    break;
                case HOT:
                    this.image = new ImageIcon(getClass().getResource("hot.png")).getImage();
                    break;
                default:
                    break;
            }
        }
    }

    public void tick() {
        rect.setBounds(x + Jugador.xInicial, y + Jugador.yInicial, size, size);
     /*   for (ItemEn i : itemen) {
            i.tick();
        }*/
    }

    public void render(Graphics2D g) {
        g.drawImage(image, x + Jugador.xInicial, y + Jugador.yInicial, size, size, null);
        /*for (ItemEn i : itemen) {
            i.render(g);
        }*/
    }
}
