package com.br.projetomarvel.domain.exception;

public class MensagenEntidadeNaoEncontradaException extends EntidadeNaoEncontradaException {

	private static final long serialVersionUID = 8474244737622168972L;
	
	public MensagenEntidadeNaoEncontradaException(String mensagem ) {
		super(mensagem);
	}
	
	public MensagenEntidadeNaoEncontradaException( Long id) {
		this(String.format("Não existe um cadastro com código %d",id));
	}

}
