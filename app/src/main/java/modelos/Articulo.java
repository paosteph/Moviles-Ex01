package modelos;

import java.io.Serializable;

public class Articulo implements Serializable{
    private String nombreTecnico;
    private Double precio;
    private String descripcion;
    private int stock;

    public Articulo(String nombreTecnico, Double precio, String descripcion, int stock) {
        this.nombreTecnico = nombreTecnico;
        this.precio = precio;
        this.descripcion = descripcion;
        this.stock = stock;
    }

    public Articulo(){

    }

    public String getNombreTecnico() {
        return nombreTecnico;
    }

    public Double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "nombreTecnico='" + nombreTecnico + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", stock=" + stock +
                '}';
    }
}
