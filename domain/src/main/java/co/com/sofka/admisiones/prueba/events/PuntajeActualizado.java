package co.com.sofka.admisiones.prueba.events;

import co.com.sofka.admisiones.prueba.values.Puntaje;
import co.com.sofka.domain.generic.DomainEvent;

public class PuntajeActualizado extends DomainEvent {

    private final Puntaje puntaje;
    public PuntajeActualizado(Puntaje puntaje) {
        super("sofka.prueba.puntajeactualizado");
        this.puntaje = puntaje;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
