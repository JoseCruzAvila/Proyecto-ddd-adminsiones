package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreCambiado extends DomainEvent {

    private final Nombre nombre;
    public NombreCambiado(Nombre nombre) {
        super("sofka.comite.nombrecambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
