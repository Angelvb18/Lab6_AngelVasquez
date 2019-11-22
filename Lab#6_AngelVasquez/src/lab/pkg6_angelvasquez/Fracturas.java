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
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Angel
 */
public class Fracturas {
    private File archivo = null;
     public Fracturas(String path) {
        archivo = new File(path);
    }
     public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    public void escribirArchivo(ArrayList<Producto> a ) throws IOException
    {
       FileWriter fw = null;
       BufferedWriter bw = null;
       SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy ");
       Date fecha = new Date();
        try {
            fw = new FileWriter(archivo,false);
            bw = new BufferedWriter(fw);
            bw.write("                                   Supermercado El Barrio\n");
            bw.write("                           Factura #1             "+df.format(fecha)+"\n");
            bw.write("                        Produc.                Cant                Precio\n");
            Double to=0.0;
           for (int i = 0; i < a.size(); i++) {
                /**/
               if (i%2==0) {
                   bw.write("                              "+a.get(i).getNombre()+"           "+a.get(i).getCant()+"                  L."+a.get(i).getPrecio()+"\n");
               }
               else
               {
                   bw.write("                              "+a.get(i).getNombre()+"           "+a.get(i).getCant()+"                  L"+a.get(i).getPrecio()+"\n");
               }
               to+=a.get(i).getCant()*a.get(i).getPrecio();
           }
            bw.write("                                                                                       Total:"+to);
            
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
}
