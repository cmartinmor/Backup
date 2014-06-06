package es.tri.dao.model;

import java.util.Date;

public class TriTEjercicios {
    private Integer id_ejercicio;

    private String descripcion;

    private String url_video;

    private Date fecha_baha;

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

    public String getUrl_video() {
        return url_video;
    }

    public void setUrl_video(String url_video) {
        this.url_video = url_video;
    }

    public Date getFecha_baha() {
        return fecha_baha;
    }

    public void setFecha_baha(Date fecha_baha) {
        this.fecha_baha = fecha_baha;
    }
}