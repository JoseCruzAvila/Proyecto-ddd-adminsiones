package co.com.sofka.admisiones.aspirante;

import co.com.sofka.admisiones.aspirante.values.DocumentoId;
import co.com.sofka.admisiones.values.Contenido;
import co.com.sofka.admisiones.values.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Documento extends Entity<DocumentoId> {
    private Nombre nombre;
    private Contenido contenido;

    public Documento(DocumentoId entityId, Nombre nombre, Contenido contenido) {
        super(entityId);
    }
}
