package co.com.sofka.usecases.prueba;

import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.prueba.Materia;
import co.com.sofka.admisiones.prueba.Prueba;
import co.com.sofka.admisiones.prueba.commands.ActualizarPuntaje;
import co.com.sofka.admisiones.prueba.values.MateriaId;
import co.com.sofka.admisiones.prueba.values.PruebaId;
import co.com.sofka.admisiones.prueba.values.Puntaje;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class ActualizarPuntajeUseCase extends UseCase<RequestCommand<ActualizarPuntaje>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<ActualizarPuntaje> input) {
        var command = input.getCommand();
        var prueba = new Prueba(command.getPruebaId(),new Puntaje(12), new MateriaId("xxx"),new AspiranteId());

        prueba.actualizarPuntaje(command.getPuntaje());

        emit().onResponse(new ResponseEvents(prueba.getUncommittedChanges()));
    }
}
