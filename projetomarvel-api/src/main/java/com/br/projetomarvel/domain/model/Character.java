package com.br.projetomarvel.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
@Table(name = "CHARACTERS")
public class Character {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NOME")
	private String nome;

	@Column(name = "DESCRICAO")
	private String descricao;
	
	
	@OneToMany(mappedBy = "character")
	private List<Comic> comics = new ArrayList<>();

	@OneToMany(mappedBy = "character")
	private List<Event> events = new ArrayList<>();

	@OneToMany(mappedBy = "character")
	private List<Serie> series = new ArrayList<>();

	@OneToMany(mappedBy = "character")
	private List<Story> stories = new ArrayList<>();

	public Character(Long id, String nome, String descricao) {		
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
	}

	
	
	

}
