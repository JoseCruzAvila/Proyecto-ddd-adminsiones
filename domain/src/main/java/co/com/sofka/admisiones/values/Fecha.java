package co.com.sofka.admisiones.values;

import java.time.LocalDate;
import java.util.Objects;

import co.com.sofka.domain.generic.ValueObject;

public class Fecha implements ValueObject<LocalDate> {
    private final LocalDate fecha;

    public Fecha(LocalDate fecha) {
        this.fecha = Objects.requireNonNull(fecha);
    }

    @Override
    public LocalDate value() {
        return fecha;
    }
}
