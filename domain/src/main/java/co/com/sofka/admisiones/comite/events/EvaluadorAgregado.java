package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.aspirante.values.Nombre;
import co.com.sofka.admisiones.comite.values.EvaluadorId;
import co.com.sofka.admisiones.cuenta.values.CuentaId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.UUID;

public class EvaluadorAgregado extends DomainEvent {

    private final EvaluadorId evaluadorId;
    private final Nombre nombre;
    private final CuentaId cuentaId;
    public EvaluadorAgregado(EvaluadorId evaluadorId, Nombre nombre, CuentaId cuentaId) {
        super("sofka.comite.evaluadoragregado");
        this.evaluadorId = evaluadorId;
        this.nombre = nombre;
        this.cuentaId = cuentaId;

    }

    public EvaluadorId getEvaluadorId() {
        return evaluadorId;
    }

    public Nombre getNombreombre(){
        return nombre;
    }

    public CuentaId getCuentaId() {
        return cuentaId;
    }
}
