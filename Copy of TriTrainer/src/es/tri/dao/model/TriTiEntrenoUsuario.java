package es.tri.dao.model;

import java.util.Date;

public class TriTiEntrenoUsuario {
    private Integer id_entreno;

    private Integer id_usuario;

    private Integer id_tipo_entreno;

    private Date fecha_baja;

    private Integer valoracion;

    private Integer tiempoRun;

    private Integer tiempoSwim;

    private Integer tiempoCycle;

    public Integer getId_entreno() {
        return id_entreno;
    }

    public void setId_entreno(Integer id_entreno) {
        this.id_entreno = id_entreno;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_tipo_entreno() {
        return id_tipo_entreno;
    }

    public void setId_tipo_entreno(Integer id_tipo_entreno) {
        this.id_tipo_entreno = id_tipo_entreno;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }

    public Integer getValoracion() {
        return valoracion;
    }

    public void setValoracion(Integer valoracion) {
        this.valoracion = valoracion;
    }

    public Integer getTiempoRun() {
        return tiempoRun;
    }

    public void setTiempoRun(Integer tiempoRun) {
        this.tiempoRun = tiempoRun;
    }

    public Integer getTiempoSwim() {
        return tiempoSwim;
    }

    public void setTiempoSwim(Integer tiempoSwim) {
        this.tiempoSwim = tiempoSwim;
    }

    public Integer getTiempoCycle() {
        return tiempoCycle;
    }

    public void setTiempoCycle(Integer tiempoCycle) {
        this.tiempoCycle = tiempoCycle;
    }
}