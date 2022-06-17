package co.com.sofka.admisiones.cuenta;

import co.com.sofka.admisiones.cuenta.values.CuentaId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;

public class Cuenta extends AggregateEvent<CuentaId> {

    public Cuenta(CuentaId entityId) {
        super(entityId);
    }
}
