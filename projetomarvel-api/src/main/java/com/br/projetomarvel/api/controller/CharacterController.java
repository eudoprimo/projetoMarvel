package com.br.projetomarvel.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.projetomarvel.api.assembler.CharacterRetAssembler;
import com.br.projetomarvel.api.assembler.ComicRetAssembler;
import com.br.projetomarvel.api.assembler.EventRetAssembler;
import com.br.projetomarvel.api.assembler.SerieRetAssembler;
import com.br.projetomarvel.api.assembler.StoryRetAssembler;
import com.br.projetomarvel.api.dto.ret.CharacterRet;
import com.br.projetomarvel.api.dto.ret.ComicRet;
import com.br.projetomarvel.api.dto.ret.EventRet;
import com.br.projetomarvel.api.dto.ret.SerieRet;
import com.br.projetomarvel.api.dto.ret.StoryRet;
import com.br.projetomarvel.domain.service.CharacterService;
import com.br.projetomarvel.domain.service.ComicService;
import com.br.projetomarvel.domain.service.EventService;
import com.br.projetomarvel.domain.service.SerieService;
import com.br.projetomarvel.domain.service.StoryService;

import io.swagger.annotations.ApiOperation;

import com.br.projetomarvel.domain.model.Character;

@RestController
@RequestMapping(value = "/v1/public/characters")
public class CharacterController {

	@Autowired
	private CharacterRetAssembler characterRetAssembler;

	@Autowired
	private ComicRetAssembler comicRetAssembler;

	@Autowired
	private EventRetAssembler eventRetAssembler;

	@Autowired
	private SerieRetAssembler serieRetAssembler;

	@Autowired
	private StoryRetAssembler storyRetAssembler;

	@Autowired
	private CharacterService characterService;

	@Autowired
	private ComicService comicService;

	@Autowired
	private EventService eventService;

	@Autowired
	private SerieService serieService;

	@Autowired
	private StoryService storyService;

	@ApiOperation(value="Retorna uma lista de characters")
	@GetMapping
	public List<CharacterRet> pesquisar(@PageableDefault(size = 10) Pageable pageable) {

		return characterRetAssembler.toCollectionModel(characterService.buscarTodos(pageable));

	}

    @ApiOperation(value="Retorna um character por identificador")
	@GetMapping("/{characterId}")
	public CharacterRet buscarPorId(@PathVariable Long characterId) throws Exception {

		Character character = characterService.buscarPorId(characterId);

		return characterRetAssembler.toModel(character);
	}

    @ApiOperation(value="Retorna lista comics por character")
	@GetMapping("/{characterId}/comics")
	public List<ComicRet> buscarComicsPorCharacter(@PathVariable Long characterId,
			@PageableDefault(size = 10) Pageable pageable) {

		return comicRetAssembler.toCollectionModel(comicService.buscarTodosComicsPorCharacter(characterId, pageable));

	}

    @ApiOperation(value="Retorna lista events por character")
	@GetMapping("/{characterId}/events")
	public List<EventRet> buscarEventsPorCharacter(@PathVariable Long characterId,
			@PageableDefault(size = 10) Pageable pageable) {

		return eventRetAssembler.toCollectionModel(eventService.buscarTodosEventsPorCharacter(characterId, pageable));

	}

    @ApiOperation(value="Retorna lista series por character")
	@GetMapping("/{characterId}/series")
	public List<SerieRet> buscarSeriesPorCharacter(@PathVariable Long characterId,
			@PageableDefault(size = 10) Pageable pageable) {

		return serieRetAssembler.toCollectionModel(serieService.buscarTodasSeriesPorCharacter(characterId, pageable));

	}

    @ApiOperation(value="Retorna lista stories por character")
	@GetMapping("/{characterId}/stories")
	public List<StoryRet> buscarStoriesPorCharacter(@PathVariable Long characterId,
			@PageableDefault(size = 10) Pageable pageable) {

		return storyRetAssembler.toCollectionModel(storyService.buscarTodosStoriesPorCharacter(characterId, pageable));

	}

}
