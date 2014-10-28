package es.tri.dao.model;

import java.util.Date;

public class TriTaTipoEntreno {
    private Integer id_tipo_entreno;

    private String descripcion;

    private Date fecha_baja;

    public Integer getId_tipo_entreno() {
        return id_tipo_entreno;
    }

    public void setId_tipo_entreno(Integer id_tipo_entreno) {
        this.id_tipo_entreno = id_tipo_entreno;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Date fecha_baja) {
        this.fecha_baja = fecha_baja;
    }
}