package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.comite.events.AspiranteAgregado;
import co.com.sofka.admisiones.comite.events.ComiteCreado;
import co.com.sofka.admisiones.comite.events.EvaluadorAgregado;
import co.com.sofka.admisiones.comite.events.SecretariaAgregada;
import co.com.sofka.domain.generic.EventChange;

import java.util.HashSet;

public class ComiteChange extends EventChange {
    public ComiteChange(Comite comite) {

        apply((ComiteCreado event)->{
            comite.nombre = event.getNombre();
            comite.pruebas = new HashSet<>();
            comite.evaluadores = new HashSet<>();
        });

        apply((AspiranteAgregado event)->{
            comite.aspiranteId = event.getAspiranteId();
        });

        apply((SecretariaAgregada event) -> {
            comite.secretariaId = event.getSecretariaId();
        });
    }
}
