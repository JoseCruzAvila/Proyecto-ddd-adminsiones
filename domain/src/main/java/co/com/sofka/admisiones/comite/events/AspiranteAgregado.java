package co.com.sofka.admisiones.comite.events;

import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.aspirante.values.DocumentoId;
import co.com.sofka.admisiones.values.Nombre;
import co.com.sofka.admisiones.values.CuentaId;
import co.com.sofka.domain.generic.DomainEvent;

import java.util.Set;

public class AspiranteAgregado extends DomainEvent {

    private final AspiranteId aspiranteId;
    private final Nombre nombre;
    private final CuentaId cuentaId;
    private final Set<DocumentoId> documentos;

    public AspiranteAgregado(AspiranteId aspiranteId,Nombre nombre, CuentaId cuentaId, Set<DocumentoId> documentos) {
        super("sofka.comite.aspiranteagregado");
        this.aspiranteId = aspiranteId;
        this.nombre = nombre;
        this.cuentaId = cuentaId;
        this.documentos = documentos;
    }

    public AspiranteId getAspiranteId() {
        return aspiranteId;
    }
}
