package co.com.sofka.admisiones.aspirante.usecases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import co.com.sofka.admisiones.aspirante.command.CrearUsuarioCommand;
import co.com.sofka.admisiones.aspirante.event.AspiranteCreado;
import co.com.sofka.admisiones.general.values.Email;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.admisiones.general.values.Usuario;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;

public class CrearAspiranteUseCaseTest {
    
    @Test
    void crearUsuario() {
        Nombre nombre = new Nombre("José Daniel Cruz");
        Usuario usuario = new Usuario("josecruz");
        Email email = Email.of("jose.cruz@sofka.com.co");

        var command = new CrearUsuarioCommand(nombre, usuario, email);
        var usecase = new CrearAspiranteUseCase();

        var events = UseCaseHandler.getInstance()
                        .syncExecutor(usecase, new RequestCommand<>(command))
                        .orElseThrow()
                        .getDomainEvents();

        var event = (AspiranteCreado) events.get(0);
        Assertions.assertEquals("José Daniel Cruz", event.getNombre().value());
        Assertions.assertEquals("josecruz", event.getUsuario().value());
        Assertions.assertEquals("jose.cruz@sofka.com.co", event.getEmail().value());
    }

}
