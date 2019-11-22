/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_angelvasquez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class AdminProducto {
        private ArrayList <Producto>listaproductos = new ArrayList();
    private File archivo = null;

    public AdminProducto(String path) {
        archivo = new File(path);
    }

    public ArrayList<Producto> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(ArrayList<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }
    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }    
    
    public void setProducto(Producto p)
    {
       this.listaproductos.add(p);
    }

    @Override
    public String toString() {
        return "AdminProducto{" + "listaproductos=" + listaproductos + ", archivo=" + archivo + '}';
    }
    public void escribirArchivo() throws IOException
    {
       FileWriter fw = null;
       BufferedWriter bw = null;
       SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        try {
            fw = new FileWriter(archivo,false);//Remplazar todo
            bw = new BufferedWriter(fw);
            for (Producto t : listaproductos) {
                bw.write(t.getCodigo()+";");
                bw.write(t.getNombre()+";");
                bw.write(t.getCantonz()+";");
                bw.write(t.getCantalchol()+";");
                bw.write(t.getNacional()+";");
                bw.write(t.getNumlote()+";");
                bw.write(t.getColorante()+";");
                bw.write(t.getPrecio()+";");
                bw.write(t.getCant()+";");
                bw.write(df.format(t.getFecha_vencimiento())+";");
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }
    public void cargarArchivo()
    {
        Scanner sc = null;
        listaproductos = new ArrayList();
        SimpleDateFormat fi = new SimpleDateFormat("dd/MM/yyyy");
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                
                while (sc.hasNext()) {
                   Producto p = new Producto(sc.nextInt(),sc.next(),sc.nextDouble(), sc.nextDouble(),sc.next().charAt(0), sc.nextInt(),sc.next(), sc.nextDouble(), sc.nextInt(),fi.parse(sc.next()));
                   listaproductos.add(p);
                }
                
            } catch (Exception e) {
                System.out.println(e.getCause());
            }
            sc.close();
        }
    }

}
