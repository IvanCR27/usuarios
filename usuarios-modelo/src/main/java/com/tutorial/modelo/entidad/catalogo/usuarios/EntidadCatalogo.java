package com.tutorial.modelo.entidad.catalogo.usuarios;

import java.io.Serializable;

/**
 *
 * @author Sonne
 */
public interface EntidadCatalogo extends Serializable {
    
    Integer getId();
    
    void setId(Integer id);
    
    String getNombre();
    
    void setNombre(String nombre);
    
    String getClave();
    
    void setClave(String clave);
    
    String getCatalogo();
    
    void setCatalogo(String catalogo);
    
    String getDescripcion();
    
    void setDescripcion(String descripcion);
    
    boolean getActivo();
    
    void setActivo(boolean activo);
    
}
