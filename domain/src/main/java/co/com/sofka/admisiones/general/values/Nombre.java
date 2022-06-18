package co.com.sofka.admisiones.general.values;

import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {
    private final String value;

    public Nombre(String value) {
        this.value = Objects.requireNonNull(value);
        if(value.isBlank()){
            throw new IllegalArgumentException("No puede estar en blanco");
        }
    }

    @Override
    public String value() {
        return value;
    }
}
