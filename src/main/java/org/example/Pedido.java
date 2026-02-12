package org.example;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String codigo;
    private String lugar;

    List<Producto> productos = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String codigo, String lugar) {
        this.codigo = codigo;
        this.lugar = lugar;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", lugar='" + lugar + '\'' +
                ", productos=" + productos +
                '}';
    }
}
