package co.com.sofka.admisiones;

import co.com.sofka.admisiones.values.CuentaId;
import co.com.sofka.admisiones.values.Email;
import co.com.sofka.admisiones.values.Usuario;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Cuenta extends Entity<CuentaId> {
    private Usuario usuario;
    private Email email;

    public Cuenta(CuentaId cuentaId, Usuario usuario, Email email) {
        super(cuentaId);
        this.usuario = usuario;
        this.email = email;
    }

    public void actualizarEmail(Email email){
        Objects.requireNonNull(email);
        this.email = email;
    }

    public void actualizarUsuario(Usuario usuario){
        Objects.requireNonNull(usuario);
        this.usuario = usuario;
    }

    public Usuario usuario() {
        return usuario;
    }

    public Email email() {
        return email;
    }
}
