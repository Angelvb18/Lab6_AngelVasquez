/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_angelvasquez;

import java.util.Date;

/**
 *
 * @author Angel
 */
public class Producto {
    /*8 dígitos que único para cada bebida,
    nombre de la marca 
    , nombre de la bebida 
    , cantidad de azúcar en onzas ,
    cantidad de alcohol en porcentaje(No puede ser mayor a 100), 
    si es producto nacional o no
    , número de lote ,que colorantes tiene(Azul-4 , Rojo-69 , Verde-420 ,
    Amarillo-77 , 
    Blanco-07 puede tener más de uno) ,
    precio,
    cantidad,
    y fecha de vencimiento.*/
    private int codigo;
    private String nombre;
    private double cantonz;
    private double cantalchol;
    private char  nacional;
    private int numlote;
    private String Colorante;
    private Double precio;
    private int cant;
    private Date fecha_vencimiento;

    public Producto(int codigo, String nombre, double cantonz, double cantalchol, char nacional, int numlote, String Colorante, Double precio, int cant, Date fecha_vencimiento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantonz = cantonz;
        this.cantalchol = cantalchol;
        this.nacional = nacional;
        this.numlote = numlote;
        this.Colorante = Colorante;
        this.precio = precio;
        this.cant = cant;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantonz() {
        return cantonz;
    }

    public void setCantonz(double cantonz) {
        this.cantonz = cantonz;
    }

    public double getCantalchol() {
        return cantalchol;
    }

    public void setCantalchol(double cantalchol) {
        this.cantalchol = cantalchol;
    }

    public char getNacional() {
        return nacional;
    }

    public void setNacional(char nacional) {
        this.nacional = nacional;
    }

    

    public int getNumlote() {
        return numlote;
    }

    public void setNumlote(int numlote) {
        this.numlote = numlote;
    }

    public String getColorante() {
        return Colorante;
    }

    public void setColorante(String Colorante) {
        this.Colorante = Colorante;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", fecha_vencimiento=" + fecha_vencimiento + '}';
    }
    
    
}
