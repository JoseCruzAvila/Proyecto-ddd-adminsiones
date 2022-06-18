package co.com.sofka.admisiones.aspirante;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import co.com.sofka.admisiones.aspirante.values.DocumentoId;
import co.com.sofka.admisiones.general.values.Contenido;
import co.com.sofka.admisiones.general.values.Nombre;

public class DocumentoFactory {
    private final Set<Documento> documentos;
    private static DocumentoFactory instance;

    private DocumentoFactory(){
        documentos = new HashSet<>();
    }

    public static DocumentoFactory getInstance(){
        if(Objects.isNull(instance)){
            instance = new DocumentoFactory();
            return instance;
        }
        return instance;
    }

    public DocumentoFactory add(DocumentoId documentoId, Nombre nombre, Contenido contenido){
        documentos.add(new Documento(documentoId, nombre, contenido));
        return this;
    }

    protected Set<Documento> documentos() {
        return documentos;
    }
}
