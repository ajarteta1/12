/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.inventario;

import proyecto_pokemon.items.Items;

/**
 *
 * @author jaam-_000
 */
public class Stacks {

    private int tamaño;
    private Items item;

    public Stacks(int tamaño) {
        this.tamaño = 100;
        this.item = item;
    }

        public Stacks(int tamaño, Items item) {
        this.tamaño = tamaño;
        this.item = item;
    }

    public int getTamaño() {
        return tamaño;
    }

    public Items getItem() {
        return item;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    

}
