package es.tri.dao.model;

public class TriTEjercicios {
    private Integer id_ejercicio;

    private String descripcion;

    private String URL_video;

    private Integer id_tipo;

    private Integer id_nivel;

    private Integer enSeries;

    public Integer getId_ejercicio() {
        return id_ejercicio;
    }

    public void setId_ejercicio(Integer id_ejercicio) {
        this.id_ejercicio = id_ejercicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getURL_video() {
        return URL_video;
    }

    public void setURL_video(String URL_video) {
        this.URL_video = URL_video;
    }

    public Integer getId_tipo() {
        return id_tipo;
    }

    public void setId_tipo(Integer id_tipo) {
        this.id_tipo = id_tipo;
    }

    public Integer getId_nivel() {
        return id_nivel;
    }

    public void setId_nivel(Integer id_nivel) {
        this.id_nivel = id_nivel;
    }

    public Integer getEnSeries() {
        return enSeries;
    }

    public void setEnSeries(Integer enSeries) {
        this.enSeries = enSeries;
    }
}