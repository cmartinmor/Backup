package es.tri.dao.model;

public class TriTBioUsuario {
    private Integer id_usuario;

    private Integer edad;

    private Integer peso;

    private Integer pulsaciones_reposo;

    private Integer pulsaciones_maximas;

    private Integer id_nivel;

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getPulsaciones_reposo() {
        return pulsaciones_reposo;
    }

    public void setPulsaciones_reposo(Integer pulsaciones_reposo) {
        this.pulsaciones_reposo = pulsaciones_reposo;
    }

    public Integer getPulsaciones_maximas() {
        return pulsaciones_maximas;
    }

    public void setPulsaciones_maximas(Integer pulsaciones_maximas) {
        this.pulsaciones_maximas = pulsaciones_maximas;
    }

    public Integer getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(Integer id_nivel) {
        this.id_nivel = id_nivel;
    }
}