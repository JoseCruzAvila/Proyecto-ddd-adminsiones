package co.com.sofka.admisiones.entregables;

import co.com.sofka.admisiones.entregables.values.DocumentoId;
import co.com.sofka.domain.generic.Entity;

public class Documento extends Entity<DocumentoId> {

    public Documento(DocumentoId entityId) {
        super(entityId);
    }
    
}
