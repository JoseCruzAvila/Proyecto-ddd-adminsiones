package co.com.sofka.admisiones.aspirante;

import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.domain.generic.Entity;

/**
 * clase que funciona como una abstracción de un estudiante
 * y es agregado raíz
 * 
 * @author Jose Cruz
 * @version 1.0
 */
public class Aspirante extends Entity<AspiranteId> {

    public Aspirante(AspiranteId aspiranteId) {
        super(aspiranteId);
    }
    
}
