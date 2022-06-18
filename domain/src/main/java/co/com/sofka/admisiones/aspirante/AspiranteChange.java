package co.com.sofka.admisiones.aspirante;

import co.com.sofka.admisiones.aspirante.event.AspiranteCreado;
import co.com.sofka.admisiones.aspirante.event.DocumentoAñadido;
import co.com.sofka.admisiones.general.Cuenta;
import co.com.sofka.admisiones.general.events.NombreActualizado;
import co.com.sofka.admisiones.general.events.NombreDeUsuarioActualizado;
import co.com.sofka.domain.generic.EventChange;

public class AspiranteChange extends EventChange {
    public AspiranteChange(Aspirante aspirante) {
        apply((AspiranteCreado event) -> {
            aspirante.nombre = event.getNombre();
            aspirante.cuenta = new Cuenta(event.getEmail(), event.getUsuario());
        });

        apply((NombreActualizado event) -> {
            aspirante.nombre = event.getNombre();
        });

        apply((NombreDeUsuarioActualizado event) -> {
            if (!aspirante.cuenta.identity().equals(event.getEmail())) {
                throw new IllegalArgumentException("El email ingresado es incorrecto o no existe");
            }

            aspirante.cuenta.actualizarUsuario(event.getUsuario());
        });

        apply((DocumentoAñadido event) -> {
            aspirante.documentos.add(new Documento(event.getDocumentoId(), event.getNombre(), event.getContenido()));
        });
    }
}

