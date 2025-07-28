package com.projeto_massa.projeto_massa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projeto_massa.projeto_massa.DTO.GameLIstDTO;
import com.projeto_massa.projeto_massa.repository.GameListRepository;

@Service
public class ListServices {
	@Autowired
	private GameListRepository list;
	
	@Transactional(readOnly = true)
	public List<GameLIstDTO> findAll(){
		List<GameLIstDTO> result = list.findAll().stream().map(x -> new GameLIstDTO(x)).toList();
		return result;
	}
	
	
}
