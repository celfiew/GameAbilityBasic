package com.company;

public class HabilidadesFactory {

    private static HabilidadesFactory instance;

    public static final String CODIGO_SALTAR = "Saltar";
    public static final String CODIGO_DISPARAR = "Disparar";
    public static final String CODIGO_DISPARO_AL_SALTAR = "Disparo-al-saltar";

    private HabilidadesFactory() {
    }

    public static HabilidadesFactory getInstance() {
        if (instance == null){
            instance = new HabilidadesFactory();
        }
        return instance;
    }


    public Habilidades generarHabilidad(String codigo) throws HabildiadesFactoryException {
        switch (codigo) {
            case CODIGO_SALTAR:
                return new HabilidadSimple("Saltar", "Descripción", 7.5);
            case CODIGO_DISPARAR:
                return new HabilidadSimple("Disparar", "Descripción", 10);
            case CODIGO_DISPARO_AL_SALTAR:
                HabilidadCombinada habilidadcombinada = new HabilidadCombinada("Disparo-al-saltar", "Descripción", 3);
                habilidadcombinada.agregarHabilidad(generarHabilidad(CODIGO_DISPARAR));
                habilidadcombinada.agregarHabilidad(generarHabilidad(CODIGO_SALTAR));
                return habilidadcombinada;
            default:
                throw new HabildiadesFactoryException("no es un codigo de habilidad correcto");
        }
    }
}
