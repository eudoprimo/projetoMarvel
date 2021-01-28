package com.br.projetomarvel.core.modelMaper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMaperConfig {
	
	@Bean
	public ModelMapper modelMaper() {
		
		return new ModelMapper();
	}

}
