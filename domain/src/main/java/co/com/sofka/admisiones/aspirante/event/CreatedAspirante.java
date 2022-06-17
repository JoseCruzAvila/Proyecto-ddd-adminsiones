package co.com.sofka.admisiones.aspirante.event;

import co.com.sofka.admisiones.values.Nombre;
import co.com.sofka.admisiones.values.Email;
import co.com.sofka.admisiones.values.Usuario;
import co.com.sofka.domain.generic.DomainEvent;

public class CreatedAspirante extends DomainEvent {
    private final Nombre nombre;
    private final Usuario usuario;
    private final Email email;

    public CreatedAspirante(Nombre nombre, Usuario usuario, Email email) {
        super("aspirante.CreatedAspirante");
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Email getEmail() {
        return email;
    }
}
