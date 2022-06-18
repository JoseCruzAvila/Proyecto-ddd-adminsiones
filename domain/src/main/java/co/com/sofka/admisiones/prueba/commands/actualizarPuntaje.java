package co.com.sofka.admisiones.prueba.commands;

import co.com.sofka.admisiones.prueba.values.PruebaId;
import co.com.sofka.admisiones.prueba.values.Puntaje;
import co.com.sofka.domain.generic.Command;

public class ActualizarPuntaje extends Command {

    private final Puntaje puntaje;
    private final PruebaId pruebaId;

    public ActualizarPuntaje(PruebaId pruebaId, Puntaje puntaje) {
        this.puntaje = puntaje;
        this.pruebaId = pruebaId;
    }

    public Puntaje getPuntaje() {
        return puntaje;
    }

    public PruebaId getPruebaId() {
        return pruebaId;
    }
}
