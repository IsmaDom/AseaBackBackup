//package com.asea.back.controllers;
//
//import com.asea.back.dto.WebServiceResponse;
//import com.asea.back.repository.UsuarioRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestHeader;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1")
//@PreAuthorize("hasRole('ADMIN')")
//public class UsuarioController {
//
//    @Autowired
//    UsuarioRepository usuarioRepository;
//
//
//    @GetMapping(value = "/getUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
//    public WebServiceResponse getUsuarios(
//            @RequestHeader("Authorization") String token
//    ) {
//
//            List<Usuario> usuarios = new ArrayList<Usuario>();
//            usuarios = usuarioRepository.findAll();
//            return new WebServiceResponse(true,"usuarios",usuarios);
//
//
//
//
//
//    }
//
//}
