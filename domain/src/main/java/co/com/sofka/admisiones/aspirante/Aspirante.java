package co.com.sofka.admisiones.aspirante;

import java.util.List;
import java.util.Set;

import co.com.sofka.admisiones.Cuenta;
import co.com.sofka.admisiones.aspirante.event.CreatedAspirante;
import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.values.Nombre;
import co.com.sofka.admisiones.values.Email;
import co.com.sofka.admisiones.values.Usuario;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;

/**
 * clase que funciona como una abstracción de un estudiante
 * y es agregado raíz
 * 
 * @author Jose Cruz
 * @version 1.0
 */
public class Aspirante extends AggregateEvent<AspiranteId> {
    protected Nombre nombre;
    protected Cuenta cuenta;
    protected Set<Documento> documentos;

    public Aspirante(AspiranteId documentoIdentidad, Nombre nombre, Email email, Usuario usuario) {
        super(documentoIdentidad);
        subscribe(new AspiranteChange(this));
        appendChange(new CreatedAspirante(nombre, usuario, email)).apply();
    }

    private Aspirante(AspiranteId documentoIdentidad) {
        super(documentoIdentidad);
        subscribe(new AspiranteChange(this));
    }
    
    public static Aspirante from(AspiranteId documentoIdentidad, List<DomainEvent> eventsBy) {
        var aspirante = new Aspirante(documentoIdentidad);
        eventsBy.forEach(aspirante::applyEvent);

        return aspirante;
    }
}
