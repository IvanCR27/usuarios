package com.tutorial.usuarios.modelo.entidad;

/**
 * Clase que representa la entidad datos_personales en bd.
 *
 * @author IvanAlexCR
 */
public class DatosPersonales {

    private Integer id;

    private String nombres;

    private String apellidos;

    private short edad;

    private String curp;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

}
