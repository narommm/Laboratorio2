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
public class Producto {

    String producto;
    private ArrayList<Labo1> productos;

    public Producto() {
        productos = new ArrayList<>();
    }

    public void add() {
        Labo1 producto = new Labo1();

        productos.add(producto);

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del producto:   ");
        System.out.print(": ");
        producto.setNombre(leer.nextLine());

        System.out.println("Ingrese la cantidad de ese producto:   ");
        System.out.print(": ");
        producto.setCantidad(leer.nextInt());

        System.out.println("Ingrese el precio del producto:  ");
        System.out.print(": ");
        producto.setPrecio(leer.nextFloat());

        System.out.println("Ingrese el nombre del proveedor del producto:  ");
        System.out.print(": ");
        producto.setProveedor(leer.nextLine());

        System.out.println("Ingrese el número del proveedor:  ");
        System.out.print(": ");
        producto.setNumeroProv(leer.nextLine());

    }

    public void Modificar(Labo1 productos) {
        int opcion, nuevoCantidad;
        float nuevoPrecio;
        boolean aux=false;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el producto que desea modificar:  ");
        producto = leer.nextLine();
        if (!producto.contains(productos.getNombre())) {
            System.out.println("El producto no existe");
        } else {
            if (producto == productos.indexOf(productos.getNombre())) {
                System.out.println("1. Para modificar la cantidad" + "\n" + "2.Para modificar el precio del producto");
                opcion = leer.nextInt();
                switch (opcion != aux) {
                    case 1:
                        System.out.println("Ingrese la nueva cantidad del producto:   ");
                        nuevoCantidad = leer.nextInt();
                        productos.replace(productos.getCantidad(), nuevoCantidad);
                        break;
                    case 2:
                        System.out.println("Ingrese el nuevo precio del producto:   ");
                        nuevoPrecio = leer.nextFloat();
                        productos.replace(productos.getCantidad(), nuevoPrecio);
                        break;

                }
            }
        }

    }

    public void Eliminar(Labo1 productos) {
        String aEliminar;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el producto que se va a eliminar:   ");
        producto = leer.nextLine();
        if (!producto.contains(productos.getNombre())) {
            System.out.println("El producto no existe");
        } else {
            for (int i = 0; i < productos.size(); i++) {
                if (producto.get(productos.getNombre()).equals(productos.get(i))) {
                    producto.clear();
                }
                }
            }
        }

    

    public void Cargar() {
    }

    public void Descargar() {
    }

    public void Descartar() {
    }

}
