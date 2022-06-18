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
        if (this.descripcion.length()>6){
            throw new IllegalArgumentException("La descripcion debe contener mas de 6 caracteres para ser valida");
        }
        if (this.descripcion.length()<100){
            throw new IllegalArgumentException("La descripcion no debe contener mas de 100 caracteres para ser valida");
        }
    }

    @Override
    public String value() {
        return descripcion;
    }
    
}
