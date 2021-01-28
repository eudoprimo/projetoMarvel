package com.br.projetomarvel.api.assembler;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.projetomarvel.domain.model.Character;

import com.br.projetomarvel.api.dto.ret.CharacterRet;

@Component
public class CharacterRetAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public CharacterRet toModel(Character character) {
		return modelMapper.map(character, CharacterRet.class);
	}
	
	public List<CharacterRet> toCollectionModel(Collection<Character> characters) {
		return characters.stream()
				.map(character -> toModel(character))
				.collect(Collectors.toList());
	}

}
