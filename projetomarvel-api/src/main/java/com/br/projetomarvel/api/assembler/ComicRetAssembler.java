package com.br.projetomarvel.api.assembler;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.projetomarvel.api.dto.ret.ComicRet;
import com.br.projetomarvel.domain.model.Comic;

@Component
public class ComicRetAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public ComicRet toModel(Comic comic) {
		return modelMapper.map(comic, ComicRet.class);
	}
	
	public List<ComicRet> toCollectionModel(Collection<Comic> comics) {
		return comics.stream()
				.map(comic -> toModel(comic))
				.collect(Collectors.toList());
	}

}
