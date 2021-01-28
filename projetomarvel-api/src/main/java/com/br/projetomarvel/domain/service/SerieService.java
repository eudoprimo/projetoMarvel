package com.br.projetomarvel.domain.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.projetomarvel.domain.model.Serie;
import com.br.projetomarvel.domain.repository.SerieRepository;

@Service
public class SerieService {
	
	@Autowired
	private SerieRepository serieRepository;
	
	
	@Transactional
	public List<Serie> buscarTodasSeriesPorCharacter(Long characterId,Pageable pageable) {

		Page<Serie> seriesPage = serieRepository.findAllByCharacterId(characterId, pageable);

		return seriesPage.getContent();
	}

}
