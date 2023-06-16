package com.asea.back.controllers;

import com.asea.back.dto.WebServiceResponse;
import com.asea.back.models.v2.ParticipantesEntity;
import com.asea.back.repository.ParticipantesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@PreAuthorize("hasRole('ADMIN')")
public class ParticipanteController {

    @Autowired
    ParticipantesRepository participantesRepository;


    @GetMapping(value = "/getAllParticipantes/{Idsolicitud}", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebServiceResponse getParticipantes(
            @RequestHeader("Authorization") String token,
            @PathVariable() String Idsolicitud
    ) {

            List<ParticipantesEntity> participantes = new ArrayList<ParticipantesEntity>();
            participantes = participantesRepository.findAll();
            return new WebServiceResponse(true,"particupiantes",participantes + Idsolicitud);



    }
    @GetMapping(value = "/getParticipante/{Idsolicitud}", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebServiceResponse getParticipante(
            @RequestHeader("Authorization") String token,
            @PathVariable() Integer Idsolicitud
    ) {

        ParticipantesEntity participante = new ParticipantesEntity();
        participante = participantesRepository.getById(Idsolicitud);
        return new WebServiceResponse(true,"Participante encontrado",participante);



    }

}
