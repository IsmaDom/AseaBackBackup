package com.asea.back.repository;

import com.asea.back.models.v2.PaisesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PaisesRepository extends JpaRepository<PaisesEntity, Integer> {
    @Override
    List<PaisesEntity> findAll();

    @Override
    Optional<PaisesEntity> findById(Integer integer);

    @Override
    <S extends PaisesEntity> S save(S entity);
}
