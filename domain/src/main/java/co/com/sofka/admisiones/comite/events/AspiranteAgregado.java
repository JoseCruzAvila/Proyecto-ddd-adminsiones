package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.aspirante.values.DocumentoId;
import co.com.sofka.admisiones.general.Cuenta;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class AspiranteAgregado extends DomainEvent {

    private final AspiranteId aspiranteId;
    private final Nombre nombre;
    private final Cuenta cuenta;
    private final Set<DocumentoId> documentos;

    public AspiranteAgregado(AspiranteId aspiranteId,Nombre nombre, Cuenta cuenta, Set<DocumentoId> documentos) {
        super("sofka.comite.aspiranteagregado");
        this.aspiranteId = aspiranteId;
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.documentos = documentos;
    }

    public AspiranteId getAspiranteId() {
        return aspiranteId;
    }
}
