package co.com.sofka.admisiones.aspirante;

import java.util.List;
import java.util.Set;

import co.com.sofka.admisiones.aspirante.event.AspiranteCreado;
import co.com.sofka.admisiones.aspirante.event.DocumentoAñadido;
import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.general.Cuenta;
import co.com.sofka.admisiones.general.events.NombreActualizado;
import co.com.sofka.admisiones.general.events.NombreDeUsuarioActualizado;
import co.com.sofka.admisiones.general.values.Email;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.admisiones.general.values.Usuario;
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
        appendChange(new AspiranteCreado(nombre, usuario, email)).apply();
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

    public void actualizarNombre(Nombre nombre) {
        appendChange(new NombreActualizado(nombre)).apply();
    }

    public void actualizarNombreDeUsuario(Email email, Usuario usuario) {
        appendChange(new NombreDeUsuarioActualizado(email, usuario)).apply();
    }

    public void añadirDocumentos(DocumentoFactory documentoFactory) {
        documentoFactory.documentos()
                        .forEach(documento -> {
                            appendChange(new DocumentoAñadido(documento.identity(), documento.nombre(), documento.contenido())).apply();
                        });
    }
}
