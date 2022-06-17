package co.com.sofka.admisiones.values;

import co.com.sofka.domain.generic.ValueObject;

public class Usuario implements ValueObject<String> {
    private final String usuario;

    public Usuario(String usuario) {
        this.usuario = usuario;
    }

    @Override
    public String value() {
        return usuario;
    }

    
}
