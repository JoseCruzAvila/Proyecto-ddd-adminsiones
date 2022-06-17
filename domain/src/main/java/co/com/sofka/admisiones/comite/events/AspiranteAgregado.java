package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.domain.generic.DomainEvent;

public class AspiranteAgregado extends DomainEvent {

    private final AspiranteId aspiranteId;

    public AspiranteAgregado(AspiranteId aspiranteId) {
        super("sofka.comite.aspiranteagregado");
        this.aspiranteId = aspiranteId;
    }

    public AspiranteId getAspiranteId() {
        return aspiranteId;
    }
}
