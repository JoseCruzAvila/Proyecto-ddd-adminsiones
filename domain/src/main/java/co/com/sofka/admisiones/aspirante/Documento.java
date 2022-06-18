package co.com.sofka.admisiones.aspirante;

import java.util.Objects;

import co.com.sofka.admisiones.aspirante.values.DocumentoId;
import co.com.sofka.admisiones.general.values.Contenido;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.domain.generic.Entity;

public class Documento extends Entity<DocumentoId> {
    private Nombre nombre;
    private Contenido contenido;

    public Documento(DocumentoId entityId, Nombre nombre, Contenido contenido) {
        super(entityId);
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public void cambiarNombre(Nombre nombre) {
        this.nombre = Objects.requireNonNull(nombre);
    }

    public void cambiarContenido(Contenido contenido) {
        this.contenido = Objects.requireNonNull(contenido);
    }

    public Nombre nombre() {
        return nombre;
    }

    public Contenido contenido() {
        return contenido;
    }
}
