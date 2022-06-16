package co.com.sofka.admisiones.comite;

import co.com.sofka.domain.generic.AggregateEvent;

public class Comite extends AggregateEvent<ComiteId> {

    protected ComiteId comiteId;

    public Comite(ComiteId entityId) {
        super(entityId);
    }
}
