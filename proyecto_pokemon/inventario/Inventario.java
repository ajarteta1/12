/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.inventario;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author jaam-_000
 */
public class Inventario {

    private int x, y;
    private int width, height;
    private int col =5, fil = 5;
    private CopyOnWriteArrayList<Slots> slots;

    public Inventario(int x, int y) {
        this.x = x;
        this.y = y;
        slots=new CopyOnWriteArrayList<Slots>();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < fil; j++) {
                if (j == (fil - 1)) {
                    y += 35;
                }
                slots.add(new Slots(x + (i * (Slots.tam + 10)), y+ (j* (Slots.tam + 10)), null));
                if (j == (fil - 1)) {
                    y -= 35;
                }
            }
        }
        width = col * (Slots.tam + 10);
        height = fil * (Slots.tam + 10);
    }

    public void tick() {
        for (Slots s : slots) {
            s.tick();
        }
    }

    public void render(Graphics2D g) {
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x - 14, y - 17, width -10, height+25 );
        g.setColor(Color.black);
        g.drawRect(x - 14, y - 17, width-10 , height+25 );
                for (Slots s : slots) {
            s.render(g);
        }
    }
}
