package co.com.sofka.admisiones.comite.events;


import co.com.sofka.admisiones.prueba.values.PruebaId;
import co.com.sofka.admisiones.prueba.values.Puntaje;
import co.com.sofka.domain.generic.DomainEvent;

public class PuntajeDePruebaActualizado extends DomainEvent {

    private final PruebaId pruebaId;
    private final Puntaje puntaje;
    public PuntajeDePruebaActualizado(PruebaId pruebaId, Puntaje puntaje) {
        super("sofka.comite.puntajedepruebaactualizada");
        this.pruebaId = pruebaId;
        this.puntaje = puntaje;
    }

    public PruebaId getPruebaId() {
        return pruebaId;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }
}
