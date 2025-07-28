package com.projeto_massa.projeto_massa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto_massa.projeto_massa.DTO.GameLIstDTO;
import com.projeto_massa.projeto_massa.services.ListServices;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
	@Autowired
	private ListServices list;
	
	@GetMapping
	public List<GameLIstDTO> findAll(){
		return list.findAll();
	}
}
