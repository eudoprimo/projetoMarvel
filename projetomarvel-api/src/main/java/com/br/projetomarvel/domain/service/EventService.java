package com.br.projetomarvel.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.projetomarvel.domain.model.Event;
import com.br.projetomarvel.domain.repository.EventRepository;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventRepository;
	
	@Transactional
	public List<Event> buscarTodosEventsPorCharacter(Long characterId,Pageable pageable) {

		Page<Event> eventsPage = eventRepository.findAllByCharacterId(characterId, pageable);

		return eventsPage.getContent();
	}

}
