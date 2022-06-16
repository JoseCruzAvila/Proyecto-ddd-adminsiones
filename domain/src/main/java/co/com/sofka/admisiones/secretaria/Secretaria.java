package co.com.sofka.admisiones.secretaria;

import co.com.sofka.admisiones.secretaria.values.SecretariaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;

public class Secretaria extends Entity<SecretariaId> {

    protected SecretariaId secretaryId;

    public Secretaria(SecretariaId entityId) {
        super(entityId);
    }
}
