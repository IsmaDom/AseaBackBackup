package com.asea.back.repository;

import com.asea.back.models.v2.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {



    @Override
    List<UsuarioEntity> findAll();





}
