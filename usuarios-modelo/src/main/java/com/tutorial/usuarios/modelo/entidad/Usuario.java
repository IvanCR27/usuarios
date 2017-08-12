package com.tutorial.usuarios.modelo.entidad;

import java.util.Calendar;

/**
 *
 * @author Sonne
 */
public class Usuario implements Entidad {

    private static final long serialVersionUID = 6543863713976375868L;

    private Integer id;

    private String usuario;

    private String password;

    private boolean activo = true;

    private Calendar fechaRegistro;

    private DatosPersonales datosPersonales;

    /**
     * Obtiene el valor de la propiedad id
     *
     * @return{@link Integer id} el valor de la propiedad.
     */
    @Override
    public Integer getId() {
        return id;
    }

    /**
     * Modifica el valor de la propiedad id
     *
     * @param id{@link Integer id} el valor de la propiedad
     */
    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Obtine el valor de la propiedad usuario
     *
     * @return {@link String usuario} el valor de la propiedad
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Modifica el valor de la propiedad usuario
     *
     * @param usuario{@link String usuario} el valor de la propiedad
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * Obtiene el valor de la propiedad password
     *
     * @return{@link String password} el valor de la propiedad
     */
    public String getPassword() {
        return password;
    }

    /**
     * Modifica el valor de la propiedad password
     *
     * @param password{@link String password} el valor de la propiedad
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Obtiene el valor de la propiedad activo
     *
     * @return{@link boolean activo} el valor de la propiedad
     */
    public boolean isActivo() {
        return activo;
    }

    /**
     * Obtiene el valor de la propiedad activo
     *
     * @param activo{@link boolean activo} el valor de la propiedad
     */
    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    /**
     * Modifica el valor de la propiedad registro
     *
     * @return{@link Calendar} el valor de la propedad
     */
    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    /**
     * Modifica el valor de la propiedad fecharegistro
     *
     * @param fechaRegistro{@link Calendar} el valor de la propiedad
     */
    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    /**
     * Modifica el valor de la propiedad datosPersonales
     *
     * @return {@link DatosPersonales} el valor de la propiedad
     */
    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    /**
     *
     * @param datosPersonales
     */
    public void setDatosPersonales(DatosPersonales datosPersonales) {
        this.datosPersonales = datosPersonales;
    }

}
