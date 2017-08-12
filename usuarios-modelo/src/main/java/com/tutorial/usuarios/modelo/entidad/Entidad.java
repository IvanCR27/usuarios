package com.tutorial.usuarios.modelo.entidad;

import java.io.Serializable;

/**
 * Interfaz que define los metodos requeridos para las entidades. Con esto se
 * garantiza que todas las entidades contengan el campo id.
 *
 * @author IvanAlexCR
 */
public interface Entidad extends Serializable {

    /**
     * Obtiene el valor del identificador en base de datos de la entidad.
     *
     * @return {@link Integer} el valor del identificador.
     */
    Integer getId();

    /**
     * Modifica el valor del identificador en base de datos de la entidad.
     *
     * @param id {@link Integer} el nuevo valor de la entidad.
     */
    void setId(Integer id);

}
