package com.br.projetomarvel.api.assembler;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.br.projetomarvel.api.dto.ret.StoryRet;
import com.br.projetomarvel.domain.model.Story;

@Component
public class StoryRetAssembler {
	
	@Autowired
	private ModelMapper modelMapper;
	
	public StoryRet toModel(Story story) {
		return modelMapper.map(story, StoryRet.class);
	}
	
	public List<StoryRet> toCollectionModel(Collection<Story> stories) {
		return stories.stream()
				.map(story -> toModel(story))
				.collect(Collectors.toList());
	}

}
