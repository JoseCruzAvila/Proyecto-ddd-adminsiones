package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.comite.events.EvaluadorCreado;
import co.com.sofka.admisiones.general.Cuenta;
import co.com.sofka.admisiones.general.events.NombreActualizado;
import co.com.sofka.admisiones.general.events.NombreDeUsuarioActualizado;
import co.com.sofka.domain.generic.EventChange;

public class EvaluadorChange extends EventChange {
    public EvaluadorChange(Evaluador evaluador) {
        apply((EvaluadorCreado event) -> {
            evaluador.nombre = event.getNombre();
            evaluador.cuenta = new Cuenta(event.getEmail(), event.getUsuario());
        });

        apply((NombreActualizado event) -> {
            evaluador.nombre = event.getNombre();
        });

        apply((NombreDeUsuarioActualizado event) -> {
            if (!evaluador.cuenta.identity().equals(event.getEmail())) {
                throw new IllegalArgumentException("El email ingresado es incorrecto o no existe");
            }

            evaluador.cuenta.actualizarUsuario(event.getUsuario());
        });
    }
}

