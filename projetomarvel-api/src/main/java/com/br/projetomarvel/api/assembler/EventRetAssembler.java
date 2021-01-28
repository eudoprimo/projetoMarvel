package com.br.projetomarvel.api.assembler;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.projetomarvel.api.dto.ret.EventRet;
import com.br.projetomarvel.domain.model.Event;

@Component
public class EventRetAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EventRet toModel(Event event) {
		return modelMapper.map(event, EventRet.class);
	}
	
	public List<EventRet> toCollectionModel(Collection<Event> events) {
		return events.stream()
				.map(event -> toModel(event))
				.collect(Collectors.toList());
	}

}
