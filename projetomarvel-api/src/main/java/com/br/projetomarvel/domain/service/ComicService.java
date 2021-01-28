package com.br.projetomarvel.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.projetomarvel.domain.model.Character;
import com.br.projetomarvel.domain.model.Comic;
import com.br.projetomarvel.domain.repository.ComicRepository;

@Service
public class ComicService {
	
	@Autowired
	private ComicRepository comicRepository;
	
	
	@Transactional
	public List<Comic> buscarTodosComicsPorCharacter(Long characterId,Pageable pageable) {

		Page<Comic> comicsPage = comicRepository.findAllByCharacterId(characterId, pageable);

		return comicsPage.getContent();
	}

}
