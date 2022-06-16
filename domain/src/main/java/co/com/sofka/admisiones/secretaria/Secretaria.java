package co.com.sofka.admisiones.secretaria;

import co.com.sofka.admisiones.secretaria.values.SecretariaId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Secretaria extends AggregateEvent<SecretariaId> {

    protected SecretariaId secretaryId;

    public Secretaria(SecretariaId entityId) {
        super(entityId);
    }
}
