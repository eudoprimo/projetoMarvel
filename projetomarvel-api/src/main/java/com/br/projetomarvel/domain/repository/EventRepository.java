package com.br.projetomarvel.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.projetomarvel.domain.model.Comic;
import com.br.projetomarvel.domain.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{
	
	Page<Event> findAllByCharacterId(Long characterId, Pageable pageable);

}
