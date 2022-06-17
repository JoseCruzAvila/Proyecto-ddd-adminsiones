package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.aspirante.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class ComiteCreado extends DomainEvent {

    private final Nombre nombre;
    public ComiteCreado(Nombre nombre) {
        super("sofka.comite.comitecreado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
