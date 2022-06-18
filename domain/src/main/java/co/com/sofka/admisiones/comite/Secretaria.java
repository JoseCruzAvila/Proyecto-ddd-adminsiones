package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.comite.values.SecretariaId;
import co.com.sofka.admisiones.general.Cuenta;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Secretaria extends Entity<SecretariaId> {

    protected SecretariaId secretaryId;
    protected Nombre nombre;
    protected Cuenta cuenta;

    public Secretaria(SecretariaId entityId, Nombre nombre, Cuenta cuenta) {
        super(entityId);
        this.nombre = nombre;
        this.cuenta = cuenta;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }

    public SecretariaId secretaryId() {
        return secretaryId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Cuenta cuentaId() {
        return cuenta;
    }
}
