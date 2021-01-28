package com.br.projetomarvel.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.br.projetomarvel.domain.exception.MensagenEntidadeNaoEncontradaException;
import com.br.projetomarvel.domain.model.Character;

import com.br.projetomarvel.domain.repository.CharacterRepository;

@Service
public class CharacterService {

	@Autowired
	private CharacterRepository characterRepository;

	@Transactional
	public List<Character> buscarTodos(Pageable pageable) {

		Page<Character> charactersPage = characterRepository.findAll(pageable);

		return charactersPage.getContent();
	}

	@Transactional
	public Character buscarPorId(Long characterId) throws Exception {

		Optional<Character> character = characterRepository.findById(characterId);

		if (character.isPresent()) {

			return character.get();

		} else {

			throw new MensagenEntidadeNaoEncontradaException(characterId);
		}

	}

}
