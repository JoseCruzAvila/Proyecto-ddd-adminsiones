package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.prueba.values.MateriaId;
import co.com.sofka.admisiones.prueba.values.PruebaId;
import co.com.sofka.domain.generic.DomainEvent;

public class PruebaAgregada extends DomainEvent {

    private final PruebaId pruebaId;
    private final  AspiranteId aspiranteId;
    private final MateriaId materiaId;
    public PruebaAgregada(PruebaId pruebaId, AspiranteId aspiranteId, MateriaId materiaId) {
        super("sofka.comite.pruebagregada");
        this.pruebaId = pruebaId;
        this.aspiranteId = aspiranteId;
        this.materiaId = materiaId;
    }

    public PruebaId getPruebaId() {
        return pruebaId;
    }

    public AspiranteId getAspiranteId() {
        return aspiranteId;
    }

    public MateriaId getMateriaId() {
        return materiaId;
    }
}
