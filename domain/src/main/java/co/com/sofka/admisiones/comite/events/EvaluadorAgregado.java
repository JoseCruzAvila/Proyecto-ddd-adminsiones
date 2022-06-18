package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.comite.values.EvaluadorId;
import co.com.sofka.admisiones.general.Cuenta;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class EvaluadorAgregado extends DomainEvent {

    private final EvaluadorId evaluadorId;
    private final Nombre nombre;
    private final Cuenta cuenta;
    
    public EvaluadorAgregado(EvaluadorId evaluadorId, Nombre nombre, Cuenta cuenta) {
        super("sofka.comite.evaluadoragregado");
        this.evaluadorId = evaluadorId;
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public EvaluadorId getEvaluadorId() {
        return evaluadorId;
    }

    public Nombre getNombre(){
        return nombre;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
