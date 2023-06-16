package com.asea.back.models.v2;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "rol", schema = "public", catalog = "sasar")
public class RolEntity {
    private int id;
    private String descripcion;
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
    @Column(name = "descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        RolEntity rolEntity = (RolEntity) o;
        return id == rolEntity.id && Objects.equals(descripcion, rolEntity.descripcion) && Objects.equals(fechaCreacion, rolEntity.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion, fechaCreacion);
    }
}
