
package com.tutorial.usuarios.modelo.entidad;

/**
 *
 * @author Sonne
 */
public class Accion implements Entidad{

    private static final long serialVersionUID = -6550517228249793844L;
    
    private Integer id;
    
    private String nombre;
    
    private String clave;
    
    private String descripcion;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
