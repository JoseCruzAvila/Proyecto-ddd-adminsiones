package co.com.sofka.usecases.prueba;

import co.com.sofka.admisiones.prueba.commands.ActualizarPuntaje;
import co.com.sofka.admisiones.prueba.events.PuntajeActualizado;
import co.com.sofka.admisiones.prueba.values.PruebaId;
import co.com.sofka.admisiones.prueba.values.Puntaje;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ActualizarPuntajeUseCaseTest {

    @Test
    void actualizarPuntaje(){

        //Add
        var id = new PruebaId("prueba1");
        var puntaje = new Puntaje(12);

        var command = new ActualizarPuntaje(id,puntaje);

        var useCase = new ActualizarPuntajeUseCase();

        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow().getDomainEvents();

        var event = (PuntajeActualizado) events.get(1);

        //Assert
        Assertions.assertEquals(12, event.getPuntaje().value());
    }
}