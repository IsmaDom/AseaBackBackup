package com.asea.back.repository;

import com.asea.back.models.v2.SolicitudesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SolicitudesRepository extends JpaRepository<SolicitudesEntity, Integer> {

          List<SolicitudesEntity> findAll();


}
