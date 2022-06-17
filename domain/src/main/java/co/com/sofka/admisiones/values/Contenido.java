package co.com.sofka.admisiones.values;

import java.util.Map;

import co.com.sofka.domain.generic.ValueObject;

public class Contenido implements ValueObject<Map<Fecha, Descripcion>> {
    private Descripcion descripcion;
    private Fecha fecha;
   
    @Override
    public Map<Fecha, Descripcion> value() {
        return Map.of(fecha, descripcion);
    }

}
