package com.asea.back.models.v2;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "reuniones", schema = "public", catalog = "sasar")
public class ReunionesEntity {
    private int id;
    private Date fechaEvento;
    private String tipo;
    private Integer horaInicio;
    private Integer horaFin;

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FechaEvento")
    public Date getFechaEvento() {
        return fechaEvento;
    }

    public void setFechaEvento(Date fechaEvento) {
        this.fechaEvento = fechaEvento;
    }

    @Basic
    @Column(name = "Tipo")
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Basic
    @Column(name = "HoraInicio")
    public Integer getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Integer horaInicio) {
        this.horaInicio = horaInicio;
    }

    @Basic
    @Column(name = "HoraFin")
    public Integer getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Integer horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReunionesEntity that = (ReunionesEntity) o;
        return id == that.id && Objects.equals(fechaEvento, that.fechaEvento) && Objects.equals(tipo, that.tipo) && Objects.equals(horaInicio, that.horaInicio) && Objects.equals(horaFin, that.horaFin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fechaEvento, tipo, horaInicio, horaFin);
    }
}
