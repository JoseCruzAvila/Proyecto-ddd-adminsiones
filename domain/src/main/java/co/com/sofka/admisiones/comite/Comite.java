package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.aspirante.values.DocumentoId;
import co.com.sofka.admisiones.comite.events.*;
import co.com.sofka.admisiones.comite.values.ComiteId;
import co.com.sofka.admisiones.comite.values.EvaluadorId;
import co.com.sofka.admisiones.comite.values.SecretariaId;
import co.com.sofka.admisiones.general.Cuenta;
import co.com.sofka.admisiones.general.events.NombreActualizado;
import co.com.sofka.admisiones.general.values.Nombre;
import co.com.sofka.admisiones.prueba.Prueba;
import co.com.sofka.admisiones.prueba.values.MateriaId;
import co.com.sofka.admisiones.prueba.values.PruebaId;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Comite extends AggregateEvent<ComiteId> {

    protected ComiteId comiteId;
    protected Set<Evaluador> evaluadores;
    protected SecretariaId secretariaId;
    protected Set<Prueba> pruebas;
    protected Set<AspiranteId> aspirantes;

    protected Nombre nombre;

    public Comite(ComiteId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new ComiteCreado(nombre)).apply();

    }

    private Comite(ComiteId entityId){
        super(entityId);
        subscribe(new ComiteChange(this));
    }

    public void agregarEvaluador(EvaluadorId evaluadorId, Nombre nombre, Cuenta cuenta){
        Objects.requireNonNull(evaluadorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(evaluadorId);
        appendChange(new EvaluadorAgregado(evaluadorId,nombre)).apply();
    }

    public void agregarSecretaria(SecretariaId secretariaId){
        Objects.requireNonNull(secretariaId);
        appendChange(new SecretariaAgregada(secretariaId)).apply();
    }

    public void agregarPrueba(PruebaId pruebaId, AspiranteId aspiranteId, MateriaId materiaId){
        Objects.requireNonNull(pruebaId);
        Objects.requireNonNull(aspiranteId);
        Objects.requireNonNull(materiaId);
        appendChange(new PruebaAgregada(pruebaId,aspiranteId,materiaId)).apply();
    }

    public void agregarAspirante(AspiranteId aspiranteId, Nombre nombre, Cuenta cuenta, Set<DocumentoId> documentos){
        Objects.requireNonNull(aspiranteId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cuenta);
        Objects.requireNonNull(documentos);
        appendChange(new AspiranteAgregado(aspiranteId,nombre,cuenta,documentos)).apply();
    }

    public Optional<Evaluador> getEvaluadorPorId(EvaluadorId evaluadorId){
        Objects.requireNonNull(evaluadorId);
        return evaluadores
                .stream()
                .filter(evaluador -> evaluador.identity().equals(evaluadorId))
                .findFirst();
    }

    public Optional<Prueba> getPruebaPorId(PruebaId pruebaId){
        Objects.requireNonNull(pruebaId);
        return pruebas
                .stream()
                .filter(prueba -> prueba.identity().equals(pruebaId))
                .findFirst();
    }

    public void cambiarNombre(Nombre nombre){
        appendChange(new NombreActualizado(nombre)).apply();
    }

    public ComiteId comiteId() {
        return comiteId;
    }

    public Set<Evaluador> evaluadores() {
        return evaluadores;
    }

    public SecretariaId secretariaId() {
        return secretariaId;
    }

    public Set<Prueba> pruebas() {
        return pruebas;
    }

    public Set<AspiranteId> getAspirantes() {
        return aspirantes;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
