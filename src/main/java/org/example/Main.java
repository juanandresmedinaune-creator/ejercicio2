package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {


        List<Producto> lista1 = new ArrayList<>();


        Producto pr1 = new Producto("111", "leche", "5000");
        Producto pr2 = new Producto("222", "huevo", "6000");
        Producto pr3 = new Producto("333", "pan", "7000");

        Pedido p1 = new Pedido("1", "exito");

        p1.agregarProducto(pr1);
        p1.agregarProducto(pr2);
        p1.agregarProducto(pr3);

        System.out.println("Codigo pedido: " + p1.getCodigo());
        System.out.println("Lugar: " + p1.getLugar());
        System.out.println("Productos:");

        for(Producto p : p1.getProductos()) {
            System.out.println(p.toString());
        }


    }


}
