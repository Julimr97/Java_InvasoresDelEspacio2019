/*
 * La nave del juego
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author juli
 */
public class nave {
    public Image imagen = null;
    public int x = 0;
    public int y = 0;
    boolean pulsadoIzquierda = false;
    boolean pulsadoDerecha = false;
    
    public nave (){
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/nave.png"));
        } catch (IOException ex) {
            
    }
              }
        public void mueve (){
            if (pulsadoIzquierda){
                x--;
            }
            if (pulsadoDerecha){
                x++;
            }
            x=x+1;
        } 
}
