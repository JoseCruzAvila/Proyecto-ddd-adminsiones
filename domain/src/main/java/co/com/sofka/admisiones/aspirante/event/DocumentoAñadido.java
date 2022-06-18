package co.com.sofka.admisiones.aspirante.event;

import co.com.sofka.admisiones.aspirante.values.DocumentoId;
import co.com.sofka.admisiones.general.values.Contenido;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

public class DocumentoAñadido extends DomainEvent {
    private final DocumentoId documentoId;
    private final Nombre nombre;
    private final Contenido contenido;
    
    public DocumentoAñadido(DocumentoId documentoId, Nombre nombre, Contenido contenido) {
        super("aspirante.DocumentoAñadido");
        this.documentoId = documentoId;
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public DocumentoId getDocumentoId() {
        return documentoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Contenido getContenido() {
        return contenido;
    }
}
