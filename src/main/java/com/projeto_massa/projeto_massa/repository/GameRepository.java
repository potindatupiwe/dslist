package com.projeto_massa.projeto_massa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto_massa.projeto_massa.entites.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
