/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.datos;

/**
 *
 * @author admin
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String colegiogrado;
    private String añogrado;
    private String programaregistro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getColegiogrado() {
        return colegiogrado;
    }

    public void setColegiogrado(String colegiogrado) {
        this.colegiogrado = colegiogrado;
    }

    public String getAñogrado() {
        return añogrado;
    }

    public void setAñogrado(String añogrado) {
        this.añogrado = añogrado;
    }

    public String getProgramaregistro() {
        return programaregistro;
    }

    public void setProgramaregistro(String programaregistro) {
        this.programaregistro = programaregistro;
    }

    public Estudiante(String nombre, String apellido, String colegiogrado, String añogrado, String programaregistro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.colegiogrado = colegiogrado;
        this.añogrado = añogrado;
        this.programaregistro = programaregistro;
    }
}
