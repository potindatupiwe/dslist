package com.projeto_massa.projeto_massa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto_massa.projeto_massa.DTO.DTO;
import com.projeto_massa.projeto_massa.DTO.FindByPkDTO;
import com.projeto_massa.projeto_massa.entites.Game;
import com.projeto_massa.projeto_massa.repository.GameRepository;



@Service
public class GameServices {
	
	@Autowired
	private GameRepository game;
	
	@Transactional(readOnly = true)
	public List<DTO> findAllDTO(){
		List<DTO> result = new ArrayList<>();
		for (Game game_element : game.findAll()) {
			result.add(new DTO(game_element));
		}
		return result;
	}
	@Transactional(readOnly = true)
	public FindByPkDTO findByPk(Long pk) {
		Game result = game.findById(pk).get(); 
		return new FindByPkDTO(result);
	}
}
