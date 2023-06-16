package com.asea.back.repository;

import com.asea.back.models.v2.PaisesEntity;
import com.asea.back.models.v2.UnidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UnidadesRepository extends JpaRepository<UnidadEntity, Integer> {
    @Override
    List<UnidadEntity> findAll();

    @Override
    Optional<UnidadEntity> findById(Integer integer);

    @Override
    <S extends UnidadEntity> S save(S entity);
}
