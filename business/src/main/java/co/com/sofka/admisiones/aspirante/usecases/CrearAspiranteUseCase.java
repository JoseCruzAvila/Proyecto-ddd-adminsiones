package co.com.sofka.admisiones.aspirante.usecases;

import co.com.sofka.admisiones.aspirante.Aspirante;
import co.com.sofka.admisiones.aspirante.command.CrearUsuarioCommand;
import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;

public class CrearAspiranteUseCase extends UseCase<RequestCommand<CrearUsuarioCommand>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CrearUsuarioCommand> input) {
       var command = input.getCommand();
       var aspirante = new Aspirante(new AspiranteId(), command.getNombre(), command.getEmail(), command.getUsuario());

       emit().onResponse(new ResponseEvents(aspirante.getUncommittedChanges()));
    }
    
}
