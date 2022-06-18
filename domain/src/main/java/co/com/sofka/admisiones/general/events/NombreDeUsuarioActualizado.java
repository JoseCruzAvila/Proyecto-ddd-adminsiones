package co.com.sofka.admisiones.general.events;

import co.com.sofka.admisiones.general.values.Email;
import co.com.sofka.admisiones.general.values.Usuario;
import co.com.sofka.domain.generic.DomainEvent;

public class NombreDeUsuarioActualizado extends DomainEvent {
    private final Email email;
    private final Usuario usuario;

    public NombreDeUsuarioActualizado(Email email, Usuario usuario) {
        super("NombreDeUsuarioActualizado");
        this.email = email;
        this.usuario = usuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Email getEmail() {
        return email;
    }
}
