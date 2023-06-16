package com.asea.back.models.v2;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Alfresco", schema = "public", catalog = "sasar")
public class AlfrescoEntity {
    private int id;
    private Integer nombreOriginalDocumento;
    private Integer nombreDocumentoAlfresco;
    private Integer uuid;
    private Integer tipoArchivo;
    private Integer fechaCreacion;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nombre_original_documento")
    public Integer getNombreOriginalDocumento() {
        return nombreOriginalDocumento;
    }

    public void setNombreOriginalDocumento(Integer nombreOriginalDocumento) {
        this.nombreOriginalDocumento = nombreOriginalDocumento;
    }

    @Basic
    @Column(name = "nombre_documento_alfresco")
    public Integer getNombreDocumentoAlfresco() {
        return nombreDocumentoAlfresco;
    }

    public void setNombreDocumentoAlfresco(Integer nombreDocumentoAlfresco) {
        this.nombreDocumentoAlfresco = nombreDocumentoAlfresco;
    }

    @Basic
    @Column(name = "uuid")
    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "tipo_archivo")
    public Integer getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(Integer tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    @Basic
    @Column(name = "fecha_creacion")
    public Integer getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Integer fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlfrescoEntity that = (AlfrescoEntity) o;
        return id == that.id && Objects.equals(nombreOriginalDocumento, that.nombreOriginalDocumento) && Objects.equals(nombreDocumentoAlfresco, that.nombreDocumentoAlfresco) && Objects.equals(uuid, that.uuid) && Objects.equals(tipoArchivo, that.tipoArchivo) && Objects.equals(fechaCreacion, that.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreOriginalDocumento, nombreDocumentoAlfresco, uuid, tipoArchivo, fechaCreacion);
    }
}
