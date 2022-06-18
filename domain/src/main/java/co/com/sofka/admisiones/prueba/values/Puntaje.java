package co.com.sofka.admisiones.prueba.values;

import co.com.sofka.domain.generic.ValueObject;

public class Puntaje implements ValueObject<Integer> {
    private final int puntaje;

    public Puntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public Integer value() {
        return puntaje;
    }
}
