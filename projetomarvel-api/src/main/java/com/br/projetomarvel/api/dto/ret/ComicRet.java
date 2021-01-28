package com.br.projetomarvel.api.dto.ret;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ComicRet {

	private Long comicId;

	private String titulo;

	private String descricao;

}
