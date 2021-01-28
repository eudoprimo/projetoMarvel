package com.br.projetomarvel.api.dto.ret;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CharacterRet {
	
	private Long characterId;
	
	private String nome;
	
	private String descricao;

}
