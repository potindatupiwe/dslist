package com.projeto_massa.projeto_massa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto_massa.projeto_massa.DTO.DTO;
import com.projeto_massa.projeto_massa.services.GameServices;

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameServices gameServices;
	
	@GetMapping
	public List<DTO> findAll(){
		return gameServices.findAllDTO();
	}
}
