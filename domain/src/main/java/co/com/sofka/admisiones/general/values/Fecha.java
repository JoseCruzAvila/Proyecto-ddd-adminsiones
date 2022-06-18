package co.com.sofka.admisiones.general.values;

import java.time.LocalDate;

import co.com.sofka.domain.generic.ValueObject;

public class Fecha implements ValueObject<LocalDate> {
    private final LocalDate fecha;

    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public LocalDate value() {
        return fecha;
    }
}
