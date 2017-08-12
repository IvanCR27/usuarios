package com.tutorial.usuarios.modelo.entidad;

import java.util.Calendar;

/**
 * Clase que representa la entidad usuario en bd.
 *
 * @author IvanAlexCR
 */
public class Usuario implements Entidad {

    /**
     * El serial version de la entidad.
     */
    private static final long serialVersionUID = 7027929712597900670L;

    /**
     * El identificador de la clase en bd.
     */
    private Integer id;

    /**
     * El nombre del usuario.
     */
    private String usuario;

    /**
     * El password del usuario.
     */
    private String password;

    /**
     * Indica si el usuario se encuentra activo o inahabilitado.
     */
    private boolean activo = true;

    /**
     * La fecha en que se registro el usuario.
     */
    private Calendar fechaRegistro;

    /**
     * Los datos personales del usuarios.
     */
    private DatosPersonales datosPersonales;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

}
