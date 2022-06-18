package co.com.sofka.admisiones.prueba;

import co.com.sofka.admisiones.general.values.Contenido;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.admisiones.prueba.values.MateriaId;
import co.com.sofka.domain.generic.Entity;

import java.util.Objects;

public class Materia extends Entity<MateriaId> {

    protected Contenido contenido;
    protected Nombre nombre;

    public Materia(MateriaId entityId, Nombre nombre, Contenido contenido) {
        super(entityId);
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public void actualizarContenido(Contenido contenido){
        Objects.requireNonNull(contenido);
        this.contenido = contenido;
    }

    public void cambiarNombre(Nombre nombre){
        Objects.requireNonNull(nombre);
        this.nombre = nombre;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
