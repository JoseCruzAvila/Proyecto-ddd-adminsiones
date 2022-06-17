package co.com.sofka.admisiones.prueba;

import co.com.sofka.admisiones.aspirante.Aspirante;
import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.comite.ComiteChange;
import co.com.sofka.admisiones.prueba.events.PruebaCreada;
import co.com.sofka.admisiones.prueba.events.PuntajeActualizado;
import co.com.sofka.admisiones.prueba.values.MateriaId;
import co.com.sofka.admisiones.prueba.values.PruebaId;
import co.com.sofka.admisiones.prueba.values.Puntaje;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.AggregateRoot;

import java.util.Objects;

public class Prueba extends AggregateEvent<PruebaId> {

    protected Puntaje puntaje;
    protected MateriaId materiaId;
    protected AspiranteId aspiranteId;

    public Prueba(PruebaId entityId, Puntaje puntaje, MateriaId materiaId, AspiranteId aspiranteId) {
        super(entityId);
        appendChange(new PruebaCreada(puntaje,materiaId,aspiranteId)).apply();
    }

    private Prueba(PruebaId pruebaId){
        super(pruebaId);
        subscribe(new PruebaChange(this));
    }

    public void actualizarPuntaje(Puntaje puntaje){
        Objects.requireNonNull(puntaje);
        appendChange(new PuntajeActualizado(puntaje)).apply();
    }

    public Puntaje puntaje() {
        return puntaje;
    }
}
