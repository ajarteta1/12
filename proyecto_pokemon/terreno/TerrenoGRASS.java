/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.terreno;
import java.awt.Image;
import javax.swing.ImageIcon;
/**
 *
 * @author jaam-_000
 */
public class TerrenoGRASS extends Terreno {
    Image imagen;
    public TerrenoGRASS(int x,int y){
        
        super(x,y,false,TipoDeTerreno.GRASS);
        this.imagen = new ImageIcon(getClass().getResource("grass.png")).getImage();
    }
}
