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
public class Manejador {
    public EstadoDelJuego estado;
    public Manejador(){
        estado = new Jugar();
        
    }
    public void init(){
        estado.init();
    }
    public void tick(){
        estado.tick();
    }
    public void render(Graphics2D g){
        estado.render(g);
    }
    public void cambiarEstado(EstadoDelJuego nuevoestado){
        estado =nuevoestado;
        estado.init();
    }
}
