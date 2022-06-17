package co.com.sofka.admisiones.prueba;

import co.com.sofka.admisiones.prueba.events.PuntajeActualizado;
import co.com.sofka.admisiones.prueba.values.PruebaId;
import co.com.sofka.admisiones.prueba.values.Puntaje;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;

import java.util.Objects;

public class Prueba extends AggregateEvent<PruebaId> {

    protected Puntaje puntaje;

    public Prueba(PruebaId entityId) {
        super(entityId);
    }

    public void actualizarPuntaje(Puntaje puntaje){
        Objects.requireNonNull(puntaje);
        appendChange(new PuntajeActualizado(puntaje)).apply();
    }
}
