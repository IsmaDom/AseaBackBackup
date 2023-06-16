package com.asea.back.models.v2;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "TipoSolicitante", schema = "public", catalog = "sasar")
public class TipoSolicitanteEntity {
    private int id;
    private String descripcion;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TipoSolicitanteEntity that = (TipoSolicitanteEntity) o;
        return id == that.id && Objects.equals(descripcion, that.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion);
    }
}
