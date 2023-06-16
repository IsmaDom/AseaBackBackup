package com.asea.back.models.v2;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "documentos", schema = "public", catalog = "sasar")
public class DocumentosEntity {
    private int id;
    private String nombreArchivo;
    private String descripcion;
    private Timestamp fechaCarga;
    private Timestamp fechaUpdate;
    private String usuarioAlta;
    private String usuarioUpdate;
    private byte[] data;
    private String fileType;

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NombreArchivo")
    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Basic
    @Column(name = "Descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Basic
    @Column(name = "FechaCarga")
    public Timestamp getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(Timestamp fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    @Basic
    @Column(name = "FechaUpdate")
    public Timestamp getFechaUpdate() {
        return fechaUpdate;
    }

    public void setFechaUpdate(Timestamp fechaUpdate) {
        this.fechaUpdate = fechaUpdate;
    }

    @Basic
    @Column(name = "UsuarioAlta")
    public String getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(String usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    @Basic
    @Column(name = "UsuarioUpdate")
    public String getUsuarioUpdate() {
        return usuarioUpdate;
    }

    public void setUsuarioUpdate(String usuarioUpdate) {
        this.usuarioUpdate = usuarioUpdate;
    }

    @Basic
    @Column(name = "Data")
    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    @Basic
    @Column(name = "FileType")
    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DocumentosEntity that = (DocumentosEntity) o;
        return id == that.id && Objects.equals(nombreArchivo, that.nombreArchivo) && Objects.equals(descripcion, that.descripcion) && Objects.equals(fechaCarga, that.fechaCarga) && Objects.equals(fechaUpdate, that.fechaUpdate) && Objects.equals(usuarioAlta, that.usuarioAlta) && Objects.equals(usuarioUpdate, that.usuarioUpdate) && Arrays.equals(data, that.data) && Objects.equals(fileType, that.fileType);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, nombreArchivo, descripcion, fechaCarga, fechaUpdate, usuarioAlta, usuarioUpdate, fileType);
        result = 31 * result + Arrays.hashCode(data);
        return result;
    }
}
