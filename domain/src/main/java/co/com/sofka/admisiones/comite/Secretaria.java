package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.Cuenta;
import co.com.sofka.admisiones.comite.values.SecretariaId;
import co.com.sofka.admisiones.values.CuentaId;
import co.com.sofka.admisiones.values.Nombre;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Secretaria extends Entity<SecretariaId> {

    protected SecretariaId secretaryId;
    protected Nombre nombre;
    protected CuentaId cuentaId;

    public Secretaria(SecretariaId entityId, Nombre nombre) {
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

    public SecretariaId secretaryId() {
        return secretaryId;
    }

    public Nombre nombre() {
        return nombre;
    }

    public CuentaId cuentaId() {
        return cuentaId;
    }
}
