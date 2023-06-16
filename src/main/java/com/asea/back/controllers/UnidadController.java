package com.asea.back.controllers;

import com.asea.back.dto.PaisDTO;
import com.asea.back.dto.WebServiceResponse;
import com.asea.back.models.v2.UnidadEntity;

import com.asea.back.repository.UnidadesRepository;
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
public class UnidadController {
    @Autowired
    UnidadesRepository unidadesRepository;

    @GetMapping(value = "/getUnidades", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<UnidadEntity>> getUnidades(
            @RequestHeader("Authorization") String token) {
        try {
            List<UnidadEntity> unidades = new ArrayList<UnidadEntity>();
            unidades = unidadesRepository.findAll();
//        userRepository.findAll().forEach(user -> users.add(user));
            return (ResponseEntity.ok(unidades));
        } catch (Exception e) {
            e.printStackTrace();
            return (null);
        }
    }

    @PostMapping(value = "/saveUnidad")
    public WebServiceResponse savePais(
            @RequestBody PaisDTO dto
    ) {
        ModelMapper modelMapper = new ModelMapper();

        UnidadEntity unidadEntity = modelMapper.map(dto, UnidadEntity.class);
        try {
            unidadesRepository.save(unidadEntity);
            return new WebServiceResponse(true, "Pais Guardado", unidadEntity);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new WebServiceResponse(false, "Pais no guardado error: " + e.getMessage());

        }
    }

    @GetMapping("/getUnidad/{id}")
    public ResponseEntity<UnidadEntity> getUnidadById(@PathVariable("id") int id) {
        try {


            UnidadEntity unidadEntity = unidadesRepository.findById(id).orElse(null);

            return (ResponseEntity<UnidadEntity>) ResponseEntity.ok(unidadEntity);

        } catch (Exception e) {
                   return (ResponseEntity<UnidadEntity>) ResponseEntity.notFound();
        }
    }

}
