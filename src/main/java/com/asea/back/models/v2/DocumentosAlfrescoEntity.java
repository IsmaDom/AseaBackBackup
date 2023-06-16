package com.asea.back.models.v2;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "documentosAlfresco", schema = "public", catalog = "sasar")
public class DocumentosAlfrescoEntity {
    private int id;
    private String nombreOriginalDocumento;
    private String nombreDocumentoAlfresco;
    private String uuid;
    private String tipoArchivo;
    private Date fechaCreacion;

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
    public String getNombreOriginalDocumento() {
        return nombreOriginalDocumento;
    }

    public void setNombreOriginalDocumento(String nombreOriginalDocumento) {
        this.nombreOriginalDocumento = nombreOriginalDocumento;
    }

    @Basic
    @Column(name = "nombre_documento_alfresco")
    public String getNombreDocumentoAlfresco() {
        return nombreDocumentoAlfresco;
    }

    public void setNombreDocumentoAlfresco(String nombreDocumentoAlfresco) {
        this.nombreDocumentoAlfresco = nombreDocumentoAlfresco;
    }

    @Basic
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "tipo_archivo")
    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    @Basic
    @Column(name = "fecha_creacion")
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentosAlfrescoEntity that = (DocumentosAlfrescoEntity) o;
        return id == that.id && Objects.equals(nombreOriginalDocumento, that.nombreOriginalDocumento) && Objects.equals(nombreDocumentoAlfresco, that.nombreDocumentoAlfresco) && Objects.equals(uuid, that.uuid) && Objects.equals(tipoArchivo, that.tipoArchivo) && Objects.equals(fechaCreacion, that.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreOriginalDocumento, nombreDocumentoAlfresco, uuid, tipoArchivo, fechaCreacion);
    }
}
