package co.com.sofka.admisiones.comite.values;

import co.com.sofka.domain.generic.Identity;

public class EvaluadorId extends Identity {

    public EvaluadorId(String id){
        super(id);
    }

    public EvaluadorId of(String id){
        return new EvaluadorId(id);
    }
}
