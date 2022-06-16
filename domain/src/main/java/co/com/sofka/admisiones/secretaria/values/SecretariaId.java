package co.com.sofka.admisiones.secretaria.values;

import co.com.sofka.domain.generic.Identity;

public class SecretariaId extends Identity {

    public SecretariaId(String id){
        super(id);
    }

    public SecretariaId of(String id){
        return new SecretariaId(id);
    }
}
