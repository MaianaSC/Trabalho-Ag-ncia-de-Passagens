package paraisoTropical;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import paraisoTropical.TelaPrincipal;

/**
 *
 * @author Maiana
 */
public class ParaisoTropical  {
    
    public static void main(String[] args) {
       TelaCarregamento obj = new TelaCarregamento();

       obj.setVisible(true);
        try {
          Thread.sleep(1500);
        } catch (Exception erro) {
        }

        obj.setVisible(false);
        new TelaCarregamento().setVisible(true);
        
        
        TelaPrincipal op = new TelaPrincipal();
        op.setLocation(2, 31);
        op.setVisible(true);
        
    }

   
}
