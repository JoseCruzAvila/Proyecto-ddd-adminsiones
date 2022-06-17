package co.com.sofka.admisiones.prueba.values;

import co.com.sofka.admisiones.values.Descripcion;
import co.com.sofka.admisiones.values.Fecha;
import co.com.sofka.domain.generic.ValueObject;

public class Contenido implements ValueObject {

    private final Descripcion descripcion;
    private final Fecha fecha;

    public Contenido(Descripcion descripcion, Fecha fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    @Override
    public Object value() {
        return this;
    }
}
