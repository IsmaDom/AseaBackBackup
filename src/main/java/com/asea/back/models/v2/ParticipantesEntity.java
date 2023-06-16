package com.asea.back.models.v2;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "participantes", schema = "public", catalog = "sasar")
public class ParticipantesEntity {
    private int id;
    private String nombre;
    private String cargo;
    private String empresa;
    private String correo;
    private Boolean confirmaAsistencia;
    private Boolean asisteEvento;
    private Boolean representanteLegal;


    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nombre")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "Cargo")
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Basic
    @Column(name = "Empresa")
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Basic
    @Column(name = "Correo")
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Basic
    @Column(name = "ConfirmaAsistencia")
    public Boolean getConfirmaAsistencia() {
        return confirmaAsistencia;
    }

    public void setConfirmaAsistencia(Boolean confirmaAsistencia) {
        this.confirmaAsistencia = confirmaAsistencia;
    }

    @Basic
    @Column(name = "AsisteEvento")
    public Boolean getAsisteEvento() {
        return asisteEvento;
    }

    public void setAsisteEvento(Boolean asisteEvento) {
        this.asisteEvento = asisteEvento;
    }

    @Basic
    @Column(name = "RepresentanteLegal")
    public Boolean getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(Boolean representanteLegal) {
        this.representanteLegal = representanteLegal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticipantesEntity that = (ParticipantesEntity) o;
        return id == that.id && Objects.equals(nombre, that.nombre) && Objects.equals(cargo, that.cargo) && Objects.equals(empresa, that.empresa) && Objects.equals(correo, that.correo) && Objects.equals(confirmaAsistencia, that.confirmaAsistencia) && Objects.equals(asisteEvento, that.asisteEvento) && Objects.equals(representanteLegal, that.representanteLegal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, cargo, empresa, correo, confirmaAsistencia, asisteEvento, representanteLegal);
    }
}
