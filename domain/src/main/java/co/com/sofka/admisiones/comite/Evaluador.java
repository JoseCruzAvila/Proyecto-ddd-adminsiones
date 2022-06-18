package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.comite.values.EvaluadorId;
import co.com.sofka.admisiones.values.CuentaId;
import co.com.sofka.admisiones.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Evaluador extends Entity<EvaluadorId> {

    protected EvaluadorId evaluadorId;
    protected Nombre nombre;
    protected CuentaId cuentaId;

    public Evaluador(EvaluadorId entityId, Nombre nombre) {
        super(entityId);
        this.nombre = nombre;
    }

    public void actualizarNombre(Nombre nombre){
        Objects.requireNonNull(nombre);
        this.nombre = nombre;
    }

    public void asociarCuenta(CuentaId cuentaId){
        Objects.requireNonNull(cuentaId);
        this.cuentaId = cuentaId;
    }

    public EvaluadorId evaluadorId() {
        return evaluadorId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public CuentaId cuentaId() {
        return cuentaId;
    }
}
