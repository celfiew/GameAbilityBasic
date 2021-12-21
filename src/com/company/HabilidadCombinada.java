package com.company;

import java.util.HashSet;
import java.util.Set;

public class HabilidadCombinada extends Habilidades{

    private int factorMultiplicador;
    private Set<Habilidades> habilidades;

    public HabilidadCombinada(String nombre, String descripcion, int factorMultiplicador) {
        super(nombre, descripcion);
        this.factorMultiplicador = factorMultiplicador;
        this.habilidades = new HashSet<>();
    }

    public void agregarHabilidad(Habilidades habilidad){
        habilidades.add(habilidad);
    }


    @Override
    public double calcularPuntaje() {
        double puntajeTotal = 0;
        for (Habilidades habilidad: habilidades) {
            puntajeTotal += habilidad.calcularPuntaje();
        }
        return puntajeTotal * factorMultiplicador;
    }

    @Override
    public String toString() {
        return getNombre() + " " + calcularPuntaje();
    }
}
