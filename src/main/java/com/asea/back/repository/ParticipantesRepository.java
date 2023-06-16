package com.asea.back.repository;

import com.asea.back.models.v2.ParticipantesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ParticipantesRepository extends JpaRepository<ParticipantesEntity, Integer> {
    @Override
    List<ParticipantesEntity> findAll();
//    @Query(value = """
//insert   solicitudes ("Id","Folio","NombreContacto","Email","Telefono","Participacion","RegistroTramite","Asuntos","Comentarios","FechaSolicitud","Estatus","IdPais","FechaTurno","FechaVencimiento","FechaCierre","EstatusFolio","NombreEmpresa","ActividadPreponderante",
//                         "RfcEmpresa","TipoSolicitante","PermisoCRE","DocumentoIdentificacion",
//                         "TipoTramite") overriding system value
//values (2,1,1,1,1,1,1,1,1,'05-10-2023',1,1,'05-10-2023','05-10-2023','05-10-2023',1,1,1,1,1,1,1,1);""")

    @Override
    List<ParticipantesEntity> findAllById(Iterable<Integer> integers);
}
