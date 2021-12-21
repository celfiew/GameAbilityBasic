package com.company;

import java.util.HashSet;
import java.util.Set;

public class Personaje {

    private Set<Habilidades> habilidades;

    public Personaje() {
        this.habilidades = new HashSet<>();
    }

    public void agregarHabilidaAlPersonaje(String codigo)  {
        try {
            this.habilidades.add(HabilidadesFactory.getInstance().generarHabilidad(codigo));
        }catch (HabildiadesFactoryException exception){
            exception.printStackTrace();
        }
    }

    public void mostrarHabilidades(){
        for (Habilidades habilidad: habilidades) {
            System.out.println(habilidad.toString());
        }
    }


}
