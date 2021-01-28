package com.br.projetomarvel.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.projetomarvel.domain.model.Character;


@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

}
