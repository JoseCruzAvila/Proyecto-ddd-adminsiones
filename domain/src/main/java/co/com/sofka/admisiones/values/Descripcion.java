package co.com.sofka.admisiones.values;

import co.com.sofka.domain.generic.ValueObject;

public class Descripcion implements ValueObject<String> {
    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String value() {
        return descripcion;
    }
    
}