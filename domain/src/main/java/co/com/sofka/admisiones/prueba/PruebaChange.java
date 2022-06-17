package co.com.sofka.admisiones.prueba;

import co.com.sofka.admisiones.prueba.events.PruebaCreada;
import co.com.sofka.admisiones.prueba.events.PuntajeActualizado;
import co.com.sofka.domain.generic.EventChange;

public class PruebaChange extends EventChange {
    public PruebaChange(Prueba prueba) {
        apply((PruebaCreada event) -> {
            prueba.aspiranteId = event.getAspiranteId();;
            prueba.materiaId = event.getMateriaId();
        });

        apply((PuntajeActualizado event) -> {
            prueba.puntaje = event.getPuntaje();
        });
    }
}
