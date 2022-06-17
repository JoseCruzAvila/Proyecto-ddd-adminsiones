package co.com.sofka.admisiones;

import co.com.sofka.admisiones.values.Email;
import co.com.sofka.admisiones.values.Usuario;
import co.com.sofka.domain.generic.Entity;

public class Cuenta extends Entity<Email> {
    private Usuario usuario;

    public Cuenta(Usuario usuario, Email email) {
        super(email);
    }

    public Usuario usuario() {
        return usuario;
    }
}
