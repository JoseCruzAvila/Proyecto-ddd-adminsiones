package co.com.sofka.admisiones.prueba;

import co.com.sofka.admisiones.prueba.values.Contenido;
import co.com.sofka.admisiones.prueba.values.MateriaId;
import co.com.sofka.admisiones.prueba.values.Puntaje;
import co.com.sofka.domain.generic.Entity;

public class Materia extends Entity<MateriaId> {

    protected Contenido contenido;
    protected Puntaje puntaje;

    public Materia(MateriaId entityId) {
        super(entityId);
    }
}
