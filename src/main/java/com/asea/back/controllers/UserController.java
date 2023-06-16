package com.asea.back.controllers;

//import com.asea.back.repository.PaisesRepository;
//import com.asea.back.repository.SolicitudesRepository;
import com.asea.back.models.User;
import com.asea.back.repository.UserRepository;
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
public class UserController {

    @Autowired
    UserRepository userRepository;

//    @Autowired
////    SolicitudesRepository solicitudesRepository;


//    @Autowired
//    PaisesRepository paisesRepository;

    //
////    @GetMapping(value = "/getUsers/{application_type}", produces = MediaType.APPLICATION_JSON_VALUE)
    @GetMapping(value = "/getUsers", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<User>> getUsers(
            @RequestHeader("Authorization") String token
////        @PathVariable() String application_type
//             @RequestBody ApplicantSignature_CreateDTO dto, @RequestHeader("x-app-key") String appKey
    ) {
        try {
            List<User> users = new ArrayList<User>();
            userRepository.findAll().forEach(users::add);

//        userRepository.findAll().forEach(user -> users.add(user));
            return (ResponseEntity.ok(users));
        } catch (Exception e) {
            e.printStackTrace();
            return (null);
        }



    }



}
