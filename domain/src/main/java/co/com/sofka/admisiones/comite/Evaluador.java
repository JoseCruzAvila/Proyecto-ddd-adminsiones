package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.comite.values.EvaluadorId;
import co.com.sofka.admisiones.general.Cuenta;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Evaluador extends Entity<EvaluadorId> {
    protected Nombre nombre;
    protected Cuenta cuenta;

    public Evaluador(EvaluadorId entityId, Nombre nombre, Cuenta cuenta) {
        super(entityId);
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Cuenta cuenta() {
        return cuenta;
    }
}
