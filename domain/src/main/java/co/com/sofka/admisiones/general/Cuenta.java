package co.com.sofka.admisiones.general;

import co.com.sofka.admisiones.general.values.Email;
import co.com.sofka.admisiones.general.values.Usuario;
import co.com.sofka.domain.generic.Entity;


public class Cuenta extends Entity<Email> {
    private Usuario usuario;

    public Cuenta( Email email, Usuario usuario) {
        super(email);
        this.usuario = usuario;
    }

    public Usuario usuario() {
        return usuario;
    }
    
    public void actualizarUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}
