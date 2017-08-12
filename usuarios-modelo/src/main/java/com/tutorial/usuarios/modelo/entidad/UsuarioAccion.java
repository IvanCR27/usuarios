package com.tutorial.usuarios.modelo.entidad;

import java.util.Calendar;

/**
 *
 * @author Sonne
 */
public class UsuarioAccion implements Entidad {

    private static final long serialVersionUID = -7114715142777999628L;

    private Integer id;

    private Usuario usuario;

    private Accion accion;

    private Calendar fechaRegistro;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Accion getAccion() {
        return accion;
    }

    public void setAccion(Accion accion) {
        this.accion = accion;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

}
