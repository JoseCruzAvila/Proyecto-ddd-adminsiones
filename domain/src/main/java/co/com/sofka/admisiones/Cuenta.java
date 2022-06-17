package co.com.sofka.admisiones;

import co.com.sofka.admisiones.values.CuentaId;
import co.com.sofka.admisiones.values.Email;
import co.com.sofka.admisiones.values.Usuario;
import co.com.sofka.domain.generic.Entity;

public class Cuenta extends Entity<CuentaId> {
    private Usuario usuario;
    private Email email;

    public Cuenta(CuentaId cuentaId, Usuario usuario, Email email) {
        super(cuentaId);
        this.usuario = usuario;
        this.email = email;
    }

    public Usuario usuario() {
        return usuario;
    }

    public Email email() {
        return email;
    }
}
