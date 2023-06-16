package com.asea.back.controllers;

import com.asea.back.dto.SolicitudDTO;
import com.asea.back.dto.WebServiceResponse;
import com.asea.back.models.v2.SolicitudesEntity;
import com.asea.back.models.v2.TipoSolicitanteEntity;
import com.asea.back.repository.SolicitudesRepository;
import com.asea.back.repository.TipoSolicitanteRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@PreAuthorize("hasRole('ADMIN')")
public class SolicitudesController {
    @Autowired
    SolicitudesRepository solicitudesRepository;
    @Autowired
    TipoSolicitanteRepository tipoSolicitanteRepository;

    @GetMapping(value = "/getSolicitudes", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<SolicitudesEntity>> getSolicitudess(
            @RequestHeader("Authorization") String token) {
        try {
            List<SolicitudesEntity> solicitudes = new ArrayList<SolicitudesEntity>();
        solicitudes= solicitudesRepository.findAll();
            return (ResponseEntity.ok(solicitudes));
        } catch (Exception e) {
            e.printStackTrace();
            return (null);
        }
    }

    @PostMapping(value = "/saveSolicitud")
    public WebServiceResponse savePais(
            @RequestBody SolicitudDTO dto
    ) {
        ModelMapper modelMapper = new ModelMapper();

        SolicitudesEntity solicitude = modelMapper.map(dto, SolicitudesEntity.class);
        try {
            solicitudesRepository.save(solicitude);
            return new WebServiceResponse(true, "Solicitud Guardada", solicitude);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new WebServiceResponse(false, "Solicitud no guardado ::error:: " + e.getMessage());

        }
    }

    @GetMapping("/getSolicitud/{id}")
    public ResponseEntity<SolicitudesEntity> getPaisById(@PathVariable("id") int id) {
        try {


            SolicitudesEntity solicitudes = solicitudesRepository.findById(id).orElse(null);

            return (ResponseEntity<SolicitudesEntity>) ResponseEntity.ok(solicitudes);

        } catch (Exception e) {
            return (ResponseEntity<SolicitudesEntity>) ResponseEntity.notFound();
        }
    }

    @GetMapping("/tipoSolicitante/{id}")
    public ResponseEntity<TipoSolicitanteEntity> getTipoSolicitante(@PathVariable("id") Integer id) {
        try {


            TipoSolicitanteEntity tipoSolicitante = tipoSolicitanteRepository.findById(Long.valueOf(id)).orElse(null);

            return (ResponseEntity<TipoSolicitanteEntity>) ResponseEntity.ok(tipoSolicitante);

        } catch (Exception e) {
            return (ResponseEntity<TipoSolicitanteEntity>) ResponseEntity.notFound();
        }
    }

    @GetMapping("/getTipoSolicitantes")
    public ResponseEntity<List<TipoSolicitanteEntity>> getTipoSolicitantes() {

        try {
            List<TipoSolicitanteEntity> tipoSolicitanteEntities = new ArrayList<TipoSolicitanteEntity>();
            tipoSolicitanteRepository.findAll().forEach(tipoSolicitanteEntities::add);

            return (ResponseEntity.ok(tipoSolicitanteEntities));
        } catch (Exception e) {
            e.printStackTrace();
            return (null);
        }


    }

    @GetMapping("/saveSolicitud")
    public ResponseEntity<List<TipoSolicitanteEntity>> crearSolicitud() {


        SolicitudesEntity solicitudes = new SolicitudesEntity();


        try {
            List<TipoSolicitanteEntity> tipoSolicitanteEntities = new ArrayList<TipoSolicitanteEntity>();
            tipoSolicitanteRepository.findAll().forEach(tipoSolicitanteEntities::add);

            return (ResponseEntity.ok(tipoSolicitanteEntities));
        } catch (Exception e) {
            e.printStackTrace();
            return (null);
        }


    }



}
