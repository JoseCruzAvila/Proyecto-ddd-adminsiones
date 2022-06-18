package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.comite.values.SecretariaId;
import co.com.sofka.domain.generic.DomainEvent;

public class SecretariaAgregada extends DomainEvent {

    private final SecretariaId secretariaId;
    public SecretariaAgregada(SecretariaId secretariaId) {
        super("sofka.comite.secretariaagregada");
        this.secretariaId = secretariaId;
    }

    public SecretariaId getSecretariaId() {
        return secretariaId;
    }
}
