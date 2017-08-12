package com.tutorial.usuarios.modelo.entidad;

import com.tutorial.modelo.entidad.catalogo.usuarios.Pais;
import com.tutorial.modelo.entidad.catalogo.usuarios.Sexo;

/**
 *
 * @author Sonne
 */
public class DatosPersonales implements Entidad{

    private static final long serialVersionUID = 3303477546380518433L;

    private Integer id;

    private String nombres;

    private String apellidos;

    private Integer edad;

    private Sexo sexo;

    private Pais pais;

    private String curp;

    @Override
    public Integer getId() {
        return id;
    }

    @Override
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

}
