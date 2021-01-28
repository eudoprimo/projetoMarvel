package com.br.projetomarvel.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.projetomarvel.domain.model.Serie;


@Repository
public interface SerieRepository extends JpaRepository<Serie, Long> {

	Page<Serie> findAllByCharacterId(Long characterId, Pageable pageable);
}
