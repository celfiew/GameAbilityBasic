package com.company;

public class HabilidadSimple extends Habilidades {

    private double puntaje;

    public HabilidadSimple(String nombre, String descripcion, double puntaje) {
        super(nombre, descripcion);
        this.puntaje = puntaje;
    }

    @Override
    public double calcularPuntaje() {
        double incrementoPuntaje = 0.10;
        if (getNombre().equals("Disparar")){
            return this.puntaje * ( 1+ incrementoPuntaje);
        }else {
            return this.puntaje;
        }
    }

    @Override
    public String toString() {
        return getNombre() + " " + calcularPuntaje();
    }
}
