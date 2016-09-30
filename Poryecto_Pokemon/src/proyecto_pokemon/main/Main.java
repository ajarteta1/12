/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.main;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import proyecto_pokemon.juego.Manejador;
import proyecto_pokemon.mapas.Mapa;
import proyecto_pokemon.teclado.Teclado;

/**
 *
 * @author jaam-_000
 */
@SuppressWarnings("serial")
public class Main extends JPanel {
 Mapa mapa;
    static Main juego;
    Graphics2D g2d;
    static JFrame frame;
    public static int alto = 575, ancho =585;
    Manejador manejador;
    Teclado t = new Teclado();

    public static void main(String[] args) {
        frame = new JFrame("Hola");
        juego = new Main();
        frame.add(juego);
        frame.setSize(ancho, alto);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        juego.init();
        juego.run();

    }

    public void init() {
        manejador = new Manejador();
        manejador.init();
        frame.addKeyListener(t);
    }

    public void run() {
        while (true) {
            try {
                tick();
                repaint();
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void tick() {
        manejador.tick();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g2d = (Graphics2D) g;
        if(g2d != null){
        g2d.setColor(Color.blue);
        g2d.fillRect(0, 0, alto, ancho);
        manejador.render(g2d);
        }
    }

    public static JFrame getFrame() {
        return frame;
    }
}
