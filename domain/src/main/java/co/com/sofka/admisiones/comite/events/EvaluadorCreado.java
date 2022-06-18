package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.general.values.Email;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.admisiones.general.values.Usuario;
import co.com.sofka.domain.generic.DomainEvent;

public class EvaluadorCreado extends DomainEvent {
    private final Nombre nombre;
    private final Usuario usuario;
    private final Email email;

    public EvaluadorCreado(Nombre nombre, Usuario usuario, Email email) {
        super("comite.EvaluadorCreado");
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
