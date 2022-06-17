package co.com.sofka.admisiones.prueba.events;

import co.com.sofka.admisiones.aspirante.Aspirante;
import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.prueba.values.MateriaId;
import co.com.sofka.admisiones.prueba.values.Puntaje;
import co.com.sofka.domain.generic.DomainEvent;

public class PruebaCreada extends DomainEvent {

    private final Puntaje puntaje;
    private final MateriaId materiaId;
    private final AspiranteId aspiranteId;
    public PruebaCreada(Puntaje puntaje, MateriaId materiaId, AspiranteId aspiranteId) {
        super("sofka.prueba.pruebacreada");
        this.puntaje = puntaje;
        this.materiaId = materiaId;
        this.aspiranteId = aspiranteId;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public MateriaId getMateriaId() {
        return materiaId;
    }

    public AspiranteId getAspiranteId() {
        return aspiranteId;
    }
}
