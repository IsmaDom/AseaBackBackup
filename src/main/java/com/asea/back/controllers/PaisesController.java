package com.asea.back.controllers;

import com.asea.back.config.JwtService;
import com.asea.back.controllers.auth.AuthenticationService;
import com.asea.back.dto.PaisDTO;
import com.asea.back.dto.WebServiceResponse;

import com.asea.back.models.v2.PaisesEntity;
import com.asea.back.repository.PaisesRepository;
import com.asea.back.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@PreAuthorize("hasRole('ADMIN')")
public class PaisesController {
    @Autowired
    PaisesRepository paisesRepository;

    private final AuthenticationService service;
    private final JwtService jwtService;
    private final UserRepository userrepository;

    public PaisesController(AuthenticationService service, JwtService jwtService, UserRepository userrepository) {
        this.service = service;
        this.jwtService = jwtService;
        this.userrepository = userrepository;
    }

    @GetMapping(value = "/getPaises", produces = MediaType.APPLICATION_JSON_VALUE)
    public WebServiceResponse getCountries(
            @RequestHeader("Authorization") String token) {

        token = token.substring(7);
        String userEmail = jwtService.extractUsername(token);
       String newToken="";
        try {
          newToken= service.refreshTokenByMail(userEmail,token);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            List<PaisesEntity> paises = new ArrayList<PaisesEntity>();
            paises = paisesRepository.findAll();
            return new WebServiceResponse(true,"Paises Encontrados:",paises,newToken);
//            return (ResponseEntity.ok(paises));
        } catch (Exception e) {
            e.printStackTrace();
            return (null);
        }

    }

    @PostMapping(value = "/savePais")
    public WebServiceResponse savePais(
            @RequestBody PaisDTO dto

    ) {


        ModelMapper modelMapper = new ModelMapper();

        PaisesEntity pais = modelMapper.map(dto, PaisesEntity.class);
        try {
            paisesRepository.save(pais);
            return new WebServiceResponse(true, "Pais Guardado", pais);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return new WebServiceResponse(false, "Pais no guardado error: " + e.getMessage());

        }
    }

    @GetMapping("/getPais/{id}")
    public ResponseEntity<PaisesEntity> getPaisById(@PathVariable("id") int id) {
        try {


            PaisesEntity paise = paisesRepository.findById(id).orElse(null);

            return (ResponseEntity<PaisesEntity>) ResponseEntity.ok(paise);

        } catch (Exception e) {
            return (ResponseEntity<PaisesEntity>) ResponseEntity.notFound();
        }
    }

}
