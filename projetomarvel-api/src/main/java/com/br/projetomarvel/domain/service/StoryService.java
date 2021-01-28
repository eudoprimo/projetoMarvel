package com.br.projetomarvel.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.projetomarvel.domain.model.Story;
import com.br.projetomarvel.domain.repository.StoryRepository;

@Service
public class StoryService {

	@Autowired
	private StoryRepository storyRepository;
	
	@Transactional
	public List<Story> buscarTodosStoriesPorCharacter(Long characterId,Pageable pageable) {

		Page<Story> storiesPage = storyRepository.findAllByCharacterId(characterId, pageable);

		return storiesPage.getContent();
	}
}
