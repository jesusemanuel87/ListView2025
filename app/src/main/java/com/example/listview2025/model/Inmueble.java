package com.example.listview2025.model;

public class Inmueble {
    private String direccion;
    private double superficie;
    private double precio;
    private int foto;

    public Inmueble(String direccion, double superficie, double precio, int foto) {
        this.direccion = direccion;
        this.superficie = superficie;
        this.precio = precio;
        this.foto = foto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
