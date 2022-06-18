package co.com.sofka.admisiones.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Descripcion implements ValueObject<String> {
    private final String descripcion;

    public Descripcion(String descripcion) {
        this.descripcion = Objects.requireNonNull(descripcion);
        if (this.descripcion.isBlank()){
            throw new IllegalArgumentException("El campo descripcion no puede ser vacia");
        }
    }

    @Override
    public String value() {
        return descripcion;
    }
    
}
