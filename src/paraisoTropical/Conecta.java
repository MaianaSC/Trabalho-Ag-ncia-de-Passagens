
package paraisoTropical;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Maiana
 */
public class Conecta extends Thread{
    public static LocalArquivos aqr = new LocalArquivos();
     public void run() {
        while (true) {
            try {
                Socket meuSocket = new Socket("197.0.0.1", 1097);
                aqr.enviaArquivo("Voo", meuSocket);
                System.out.println("Salvou");
            } catch (IOException ex) {
                Logger.getLogger(ParaisoTropical.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
