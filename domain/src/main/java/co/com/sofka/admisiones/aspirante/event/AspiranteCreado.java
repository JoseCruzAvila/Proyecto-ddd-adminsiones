package co.com.sofka.admisiones.aspirante.event;

import co.com.sofka.admisiones.general.values.Email;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.admisiones.general.values.Usuario;
import co.com.sofka.domain.generic.DomainEvent;

public class AspiranteCreado extends DomainEvent {
    private final Nombre nombre;
    private final Usuario usuario;
    private final Email email;

    public AspiranteCreado(Nombre nombre, Usuario usuario, Email email) {
        super("aspirante.AspiranteCreado");
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
