package com.br.projetomarvel.api.assembler;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.projetomarvel.api.dto.ret.SerieRet;
import com.br.projetomarvel.domain.model.Serie;

@Component
public class SerieRetAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public SerieRet toModel(Serie serie) {
		return modelMapper.map(serie, SerieRet.class);
	}
	
	public List<SerieRet> toCollectionModel(Collection<Serie> series) {
		return series.stream()
				.map(serie -> toModel(serie))
				.collect(Collectors.toList());
	}

}
