package com.asea.back.models.v2;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "usuarioRolSistema", schema = "public", catalog = "sasar")
public class UsuarioRolSistemaEntity {
    private long id;
    private Long fechaCreacion;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fecha_creacion")
    public Long getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Long fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsuarioRolSistemaEntity that = (UsuarioRolSistemaEntity) o;
        return id == that.id && Objects.equals(fechaCreacion, that.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fechaCreacion);
    }
}
