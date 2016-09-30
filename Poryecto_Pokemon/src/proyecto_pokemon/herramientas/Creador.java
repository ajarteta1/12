/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_pokemon.herramientas;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author jaam-_000
 */
public class Creador {

    public BufferedImage loadResource(String path, String tipoArchivo) {
        BufferedImage imagen =null;
        try {
            imagen = ImageIO.read(getClass().getClassLoader().getResource(path + "." + tipoArchivo));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imagen;

    }
}
