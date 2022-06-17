package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.comite.values.EvaluadorId;
import co.com.sofka.domain.generic.Entity;

public class Evaluador extends Entity<EvaluadorId> {

    protected EvaluadorId evaluadorId;

    public Evaluador(EvaluadorId entityId) {
        super(entityId);
    }

}
