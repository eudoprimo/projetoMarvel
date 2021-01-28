package com.br.projetomarvel.controller;

import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.standaloneSetup;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

import com.br.projetomarvel.api.assembler.CharacterRetAssembler;
import com.br.projetomarvel.api.assembler.ComicRetAssembler;
import com.br.projetomarvel.api.assembler.EventRetAssembler;
import com.br.projetomarvel.api.assembler.SerieRetAssembler;
import com.br.projetomarvel.api.assembler.StoryRetAssembler;
import com.br.projetomarvel.api.controller.CharacterController;
import com.br.projetomarvel.domain.model.Character;
import com.br.projetomarvel.domain.repository.CharacterRepository;
import com.br.projetomarvel.domain.service.CharacterService;
import com.br.projetomarvel.domain.service.ComicService;
import com.br.projetomarvel.domain.service.EventService;
import com.br.projetomarvel.domain.service.SerieService;
import com.br.projetomarvel.domain.service.StoryService;

import io.restassured.http.ContentType;

@WebMvcTest
public class CharacterControllerTest {
	
	@Autowired
	private CharacterController characterController;
	
	@MockBean
	private CharacterRetAssembler characterRetAssembler;
	
	@MockBean
	private ComicRetAssembler comicRetAssembler;

	@MockBean
	private EventRetAssembler eventRetAssembler;

	@MockBean
	private SerieRetAssembler serieRetAssembler;

	@MockBean
	private StoryRetAssembler storyRetAssembler;

	@MockBean
	private CharacterService characterService;

	@MockBean
	private ComicService comicService;

	@MockBean
	private EventService eventService;

	@MockBean
	private SerieService serieService;

	@MockBean
	private StoryService storyService;
	
	@MockBean
	private CharacterRepository characterRepository;
	
	@BeforeEach
	public void setup() {
		standaloneSetup(this.characterController);
	}
	
	
	@Test
	public void deveRetornarSucesso_QuandoBuscarCharacter() throws Exception {

		when(this.characterService.buscarPorId(1L))
			.thenReturn(new Character(1l, "Hulk", "Famoso Bruce Benner"));
		
		given()
			.accept(ContentType.JSON)
		.when()
			.get("/v1/public/characters/{characterId}", 1L)
		.then()
			.statusCode(HttpStatus.OK.value());
	}
	
	

}
