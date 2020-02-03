package paraisoTropical;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Maiana
 */
public class LocalArquivos {

    public static void gravaVoo(ArrayList<Voos> lista) {
        File arq = new File("Voo.txt");
        try {
            FileOutputStream fout = new FileOutputStream(arq);
            ObjectOutputStream oos = new ObjectOutputStream(fout);

            oos.writeObject(lista);

            oos.flush();
            oos.close();
            fout.close();
        } catch (Exception ex) {
            System.err.println("Erro!! " + ex);
        }

    }

    public static ArrayList<Voos> lerVoo() {
        File arq = new File("Voo.txt");
        try {
            FileInputStream fin = new FileInputStream(arq);
            ObjectInputStream oin = new ObjectInputStream(fin);

            ArrayList<Voos> lista = (ArrayList<Voos>) oin.readObject();

            oin.close();
            fin.close();

            return lista;
        } catch (Exception ex) {
            System.err.println("Erro!! " + ex);
        }
        return null;
    }

    public static void enviaArquivo(String nomeArquivo, Socket cliente) {
        try {
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            OutputStream os = null;

            File myFile = new File(nomeArquivo);
            byte[] mybytearray = new byte[(int) myFile.length()];
            fis = new FileInputStream(nomeArquivo);
            bis = new BufferedInputStream(fis);
            bis.read(mybytearray, 0, mybytearray.length);
            os = cliente.getOutputStream();
            os.write(mybytearray, 0, mybytearray.length);
            os.flush();

            fis.close();
            bis.close();
            os.close();
        } catch (FileNotFoundException ex) {
            System.err.println("Arquivo não Encontrado " + nomeArquivo);
        } catch (IOException ex) {
            System.err.println(ex);
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public static void recebeArquivo(String nomeArquivo, Socket cliente) {
        final int FILE_SIZE = 100000000; // maior que o arquivo a ser recebido

        int bytesRead;
        int current = 0;
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            byte[] mybytearray = new byte[FILE_SIZE];
            InputStream is = cliente.getInputStream();
            fos = new FileOutputStream(nomeArquivo);
            bos = new BufferedOutputStream(fos);
            bytesRead = is.read(mybytearray, 0, mybytearray.length);
            current = bytesRead;
            do {
                bytesRead = is.read(mybytearray, current, (mybytearray.length - current));
                if (bytesRead >= 0) {
                    current += bytesRead;
                }
            } while (bytesRead > -1);

            bos.write(mybytearray, 0, current);
            bos.flush();

            fos.close();
            bos.close();
        } catch (Exception ex) {
            System.err.println(ex.toString());
        }
    }
}
