package segundo_ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private String codigo;
    private String lugar;
    private String  productos;

    List<Pedido> pe = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(String codigo, String lugar, String productos) {
        this.codigo = codigo;
        this.lugar = lugar;
        this.productos = productos;
        this.pe.add(this);
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

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "codigo='" + codigo + '\'' +
                ", lugar='" + lugar + '\'' +
                ", productos='" + productos + '\'' +
                '}';
    }

    public void  Det(Pedido pedido) {
        this.pe.add(pedido);
    }
}

