package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.aspirante.Aspirante;
import co.com.sofka.domain.generic.DomainEvent;

public class AspiranteAgregado extends DomainEvent {

    private final Aspirante aspirante;

    public AspiranteAgregado(Aspirante aspirante) {
        super("sofka.comite.aspiranteagregado");
        this.aspirante = aspirante;
    }

    public Aspirante getAspiranteId() {
        return aspirante;
    }
}
