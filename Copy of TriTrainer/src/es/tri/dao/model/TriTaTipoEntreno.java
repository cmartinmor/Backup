package es.tri.dao.model;

public class TriTaTipoEntreno {
    private Integer id_tipo_entreno;

    private Integer descripción;

    private Integer fecha_baja;

    public Integer getId_tipo_entreno() {
        return id_tipo_entreno;
    }

    public void setId_tipo_entreno(Integer id_tipo_entreno) {
        this.id_tipo_entreno = id_tipo_entreno;
    }

    public Integer getDescripción() {
        return descripción;
    }

    public void setDescripción(Integer descripción) {
        this.descripción = descripción;
    }

    public Integer getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(Integer fecha_baja) {
        this.fecha_baja = fecha_baja;
    }
}