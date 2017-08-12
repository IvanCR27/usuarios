package com.tutorial.modelo.entidad.catalogo.usuarios;

/**
 *
 * @author Sonne
 */
public class Sexo extends CatalogoSimple {

    private static final long serialVersionUID = -974456039408941488L;

    private Integer id;

    private String nombre;

    private String clave;

    private String catalogo;

    private String descripcion;

    private boolean activo = true;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getClave() {
        return clave;
    }

    @Override
    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String getCatalogo() {
        return catalogo;
    }

    @Override
    public void setCatalogo(String catalogo) {
        this.catalogo = catalogo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public boolean getActivo() {
        return activo;
    }

    @Override
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
