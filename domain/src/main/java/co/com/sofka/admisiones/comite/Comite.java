package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.comite.values.ComiteId;
import co.com.sofka.domain.generic.Entity;

public class Comite extends Entity<ComiteId> {

    protected ComiteId comiteId;

    public Comite(ComiteId entityId) {
        super(entityId);
    }
}
