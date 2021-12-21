package com.company;

public abstract class Habilidades {

    private String nombre;
    private String descripcion;

    public Habilidades(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularPuntaje();
}
