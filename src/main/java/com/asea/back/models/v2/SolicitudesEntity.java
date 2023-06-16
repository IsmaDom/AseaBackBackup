package com.asea.back.models.v2;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "solicitudes")
public class SolicitudesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "\"Id\"", nullable = false)
    private Integer id;

    @Column(name = "\"Folio\"", length = 50)
    private String folio;

    @Column(name = "\"NombreContacto\"", nullable = false, length = 250)
    private String nombreContacto;

    @Column(name = "\"Email\"", nullable = false, length = 250)
    private String email;

    @Column(name = "\"Telefono\"", nullable = false, length = 15)
    private String telefono;

    @Lob
    @Column(name = "\"Participacion\"", nullable = false)
    private String participacion;

    @Column(name = "\"RegistroTramite\"", length = 50)
    private String registroTramite;

    @Lob
    @Column(name = "\"Asuntos\"", nullable = false)
    private String asuntos;

    @Column(name = "\"Comentarios\"", length = 1024)
    private String comentarios;

    @Column(name = "\"FechaSolicitud\"", nullable = false)
    private LocalDate fechaSolicitud;

    @Column(name = "\"Estatus\"", nullable = false, length = 20)
    private String estatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"IdPais\"")
    private PaisesEntity idPais;

    @Column(name = "\"FechaTurno\"")
    private LocalDate fechaTurno;

    @Column(name = "\"FechaVencimiento\"")
    private LocalDate fechaVencimiento;

    @Column(name = "\"FechaCierre\"")
    private LocalDate fechaCierre;

    @Column(name = "\"EstatusFolio\"", length = 20)
    private String estatusFolio;

    @Column(name = "\"NombreEmpresa\"", nullable = false, length = 250)
    private String nombreEmpresa;

    @Column(name = "\"ActividadPreponderante\"", nullable = false, length = 250)
    private String actividadPreponderante;

    @Column(name = "\"RfcEmpresa\"", length = 13)
    private String rfcEmpresa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"TipoSolicitante\"")
    private TipoSolicitanteEntity tipoSolicitante;

    @Column(name = "\"PermisoCRE\"", length = 30)
    private String permisoCRE;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"DocumentoIdentificacion\"")
    private DocumentoIdentificacionEntity documentoIdentificacion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "\"TipoTramite\"")
    private TipoTramiteEntity tipoTramite;

    public TipoTramiteEntity getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(TipoTramiteEntity tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public DocumentoIdentificacionEntity getDocumentoIdentificacion() {
        return documentoIdentificacion;
    }

    public void setDocumentoIdentificacion(DocumentoIdentificacionEntity documentoIdentificacion) {
        this.documentoIdentificacion = documentoIdentificacion;
    }

    public String getPermisoCRE() {
        return permisoCRE;
    }

    public void setPermisoCRE(String permisoCRE) {
        this.permisoCRE = permisoCRE;
    }

    public TipoSolicitanteEntity getTipoSolicitante() {
        return tipoSolicitante;
    }

    public void setTipoSolicitante(TipoSolicitanteEntity tipoSolicitante) {
        this.tipoSolicitante = tipoSolicitante;
    }

    public String getRfcEmpresa() {
        return rfcEmpresa;
    }

    public void setRfcEmpresa(String rfcEmpresa) {
        this.rfcEmpresa = rfcEmpresa;
    }

    public String getActividadPreponderante() {
        return actividadPreponderante;
    }

    public void setActividadPreponderante(String actividadPreponderante) {
        this.actividadPreponderante = actividadPreponderante;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getEstatusFolio() {
        return estatusFolio;
    }

    public void setEstatusFolio(String estatusFolio) {
        this.estatusFolio = estatusFolio;
    }

    public LocalDate getFechaCierre() {
        return fechaCierre;
    }

    public void setFechaCierre(LocalDate fechaCierre) {
        this.fechaCierre = fechaCierre;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaTurno() {
        return fechaTurno;
    }

    public void setFechaTurno(LocalDate fechaTurno) {
        this.fechaTurno = fechaTurno;
    }

    public PaisesEntity getIdPais() {
        return idPais;
    }

    public void setIdPais(PaisesEntity idPais) {
        this.idPais = idPais;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getAsuntos() {
        return asuntos;
    }

    public void setAsuntos(String asuntos) {
        this.asuntos = asuntos;
    }

    public String getRegistroTramite() {
        return registroTramite;
    }

    public void setRegistroTramite(String registroTramite) {
        this.registroTramite = registroTramite;
    }

    public String getParticipacion() {
        return participacion;
    }

    public void setParticipacion(String participacion) {
        this.participacion = participacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}