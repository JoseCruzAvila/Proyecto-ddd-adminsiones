package co.com.sofka.admisiones.comite;

import co.com.sofka.admisiones.aspirante.values.AspiranteId;
import co.com.sofka.admisiones.aspirante.values.Nombre;
import co.com.sofka.admisiones.comite.events.*;
import co.com.sofka.admisiones.comite.values.ComiteId;
import co.com.sofka.admisiones.comite.values.EvaluadorId;
import co.com.sofka.admisiones.comite.values.SecretariaId;
import co.com.sofka.admisiones.cuenta.values.CuentaId;
import co.com.sofka.admisiones.prueba.Prueba;
import co.com.sofka.domain.generic.AggregateEvent;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Comite extends AggregateEvent<ComiteId> {

    protected ComiteId comiteId;
    protected Set<Evaluador> evaluadores;
    protected SecretariaId secretariaId;
    protected Set<Prueba> pruebas;
    protected AspiranteId aspiranteId;

    protected Nombre nombre;

    public Comite(ComiteId entityId, Nombre nombre) {
        super(entityId);
        appendChange(new ComiteCreado(nombre)).apply();

    }

    private Comite(ComiteId entityId){
        super(entityId);
        subscribe(new ComiteChange(this));
    }

    public void agregarEvaluador(EvaluadorId evaluadorId, Nombre nombre, CuentaId cuentaId){
        Objects.requireNonNull(evaluadorId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(evaluadorId);
        appendChange(new EvaluadorAgregado(evaluadorId,nombre,cuentaId)).apply();
    }

    public void agregarSecretaria(SecretariaId secretariaId){
        appendChange(new SecretariaAgregada(secretariaId)).apply();
    }

    public void agregarPrueba(PruebaId pruebaId, AspiranteId aspiranteId, MateriaId materiaId){
        Objects.requireNonNull(pruebaId);
        Objects.requireNonNull(aspiranteId);
        Objects.requireNonNull(materiaId);
        appendChange(new PruebaAgregada(pruebaId,aspiranteId,materiaId)).apply();
    }

    public void agregarAspirante(AspiranteId aspiranteId){
        appendChange(new AspiranteAgregado(aspiranteId)).apply();
    }

    public void actualizarPuntajeDePrueba(PruebaId pruebaId, Puntaje puntaje){
        appendChange(new PuntajeDePruebaActualizado(pruebaId,puntaje));
    }

    public Optional<Evaluador> getEvaluadorPorId(EvaluadorId evaluadorId){
        return evaluadores
                .stream()
                .filter(evaluador -> evaluador.identity().equals(evaluadorId))
                .findFirst();
    }

    public Optional<Prueba> getPruebaPorId(PruebaId pruebaId){
        return pruebas
                .stream()
                .filter(prueba -> prueba.identity().equals(pruebaId))
                .findFirst();
    }

    public void cambiarNombre(Nombre nombre){
        appendChange(new NombreCambiado(nombre)).apply();
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

    public AspiranteId aspiranteId() {
        return aspiranteId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
