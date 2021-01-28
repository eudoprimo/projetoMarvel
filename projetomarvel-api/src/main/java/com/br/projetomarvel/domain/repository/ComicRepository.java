package com.br.projetomarvel.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.projetomarvel.domain.model.Comic;

@Repository
public interface ComicRepository extends JpaRepository<Comic, Long>{
	
	
	Page<Comic> findAllByCharacterId(Long characterId, Pageable pageable);
	

}
