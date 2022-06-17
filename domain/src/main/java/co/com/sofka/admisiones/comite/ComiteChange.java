package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.comite.events.*;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class ComiteChange extends EventChange {
    public ComiteChange(Comite comite) {

        apply((ComiteCreado event)->{
            comite.nombre = event.getNombre();
            comite.pruebas = new HashSet<>();
            comite.evaluadores = new HashSet<>();
            comite.aspirantes = new HashSet<>();
        });

        apply((SecretariaAgregada event) -> {
            comite.secretariaId = event.getSecretariaId();
        });

        /*apply((PuntajeDePruebaActualizado event) -> {
            var prueba = comite.getPruebaPorId(event.getPruebaId())
                    .orElseThrow(() -> new IllegalArgumentException("No se encuentra la prueba que desea actualizar"));

            prueba.actualizarPuntaje(event.getPuntaje());
        });*/
    }
}
