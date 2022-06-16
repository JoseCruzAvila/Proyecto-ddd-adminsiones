package co.com.sofka.admisiones.evaluador;

import co.com.sofka.admisiones.evaluador.values.EvaluadorId;
import co.com.sofka.domain.generic.AggregateEvent;

public class Evaluador extends AggregateEvent<EvaluadorId> {

    protected EvaluadorId evaluadorId;

    public Evaluador(EvaluadorId entityId) {
        super(entityId);
    }

}
