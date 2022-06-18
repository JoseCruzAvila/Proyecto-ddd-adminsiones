package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.comite.values.EvaluadorId;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class EvaluadorAgregado extends DomainEvent {

    private final EvaluadorId evaluadorId;
    private final Nombre nombre;
    
    public EvaluadorAgregado(EvaluadorId evaluadorId, Nombre nombre) {
        super("sofka.comite.evaluadoragregado");
        this.evaluadorId = evaluadorId;
        this.nombre = nombre;
    }

    public EvaluadorId getEvaluadorId() {
        return evaluadorId;
    }

    public Nombre getNombre(){
        return nombre;
    }
}
