package co.com.sofka.admisiones.evaluador;

import co.com.sofka.admisiones.evaluador.values.EvaluadorId;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;

public class Evaluador extends Entity<EvaluadorId> {

    protected EvaluadorId evaluadorId;

    public Evaluador(EvaluadorId entityId) {
        super(entityId);
    }

}
