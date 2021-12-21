package com.company;

public class Main {

    public static void main(String[] args) {
	    Personaje picachu = new Personaje();
        picachu.agregarHabilidaAlPersonaje(HabilidadesFactory.CODIGO_SALTAR);
        picachu.agregarHabilidaAlPersonaje(HabilidadesFactory.CODIGO_DISPARAR);
        picachu.agregarHabilidaAlPersonaje(HabilidadesFactory.CODIGO_DISPARO_AL_SALTAR);
        picachu.mostrarHabilidades();
    }
}
