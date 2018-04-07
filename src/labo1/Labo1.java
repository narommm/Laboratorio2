/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo1;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author María Lourdes
 */
public class Labo1 {

    private String nombre;
    private int cantidad;
    private float precio;
    Scanner leer = new Scanner(System.in);

    public Labo1() {
    }

    public Labo1(String nombre, int cantidad, float precio, String proveedor, String numeroProv) {
        this.nombre = leer.nextLine();
        this.cantidad = leer.nextInt();
        this.precio = leer.nextFloat();
        this.proveedor= leer.nextLine();
        this.numeroProv= leer.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

}
