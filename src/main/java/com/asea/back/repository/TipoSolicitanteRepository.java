package com.asea.back.repository;


import com.asea.back.models.v2.TipoSolicitanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;
import java.util.Optional;

public interface TipoSolicitanteRepository extends JpaRepository<TipoSolicitanteEntity, Long> {

     @Override
     List<TipoSolicitanteEntity> findAll();

     @Override
     Optional<TipoSolicitanteEntity> findById(Long id);
}
