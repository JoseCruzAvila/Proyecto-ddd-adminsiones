package co.com.sofka.admisiones.comite;

import co.com.sofka.domain.generic.Identity;

public class ComiteId extends Identity {

    public ComiteId(String id) {
        super(id);
    }

    public ComiteId of(String id) {
        return new ComiteId(id);
    }
}
