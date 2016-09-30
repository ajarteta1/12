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
public class TerrenoROCK extends Terreno {
    Image imagen;
    public TerrenoROCK(int x,int y){
        
        super(x,y,true,TipoDeTerreno.ROCK);
        this.imagen = new ImageIcon(getClass().getResource("rock.png")).getImage();
    }
}