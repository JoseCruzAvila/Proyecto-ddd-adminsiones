package co.com.sofka.admisiones.aspirante;

import co.com.sofka.admisiones.Cuenta;
import co.com.sofka.admisiones.aspirante.event.CreatedAspirante;
import co.com.sofka.domain.generic.EventChange;

public class AspiranteChange extends EventChange {
    public AspiranteChange(Aspirante aspirante) {
        apply((CreatedAspirante event) -> {
            aspirante.nombre = event.getNombre();
            aspirante.cuenta = new Cuenta(event.getUsuario(), event.getEmail());
        });
    }
}

