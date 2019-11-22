/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_angelvasquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Angel
 */
public class Inventario {
     private File archivo = null;
     public Inventario(String path) {
        archivo = new File(path);
    }
     public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void escribirArchivo(String cambio) throws IOException
    {
       FileWriter fw = null;
       BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo,true);
            bw = new BufferedWriter(fw);
            
                bw.write(cambio+"\n");
                
            
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
}
