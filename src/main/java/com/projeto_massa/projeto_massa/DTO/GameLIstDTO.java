package com.projeto_massa.projeto_massa.DTO;

import com.projeto_massa.projeto_massa.entites.GameList;

public class GameLIstDTO {
	private Long id;
	private String name;
	
	public GameLIstDTO() {
		
	}

	public GameLIstDTO(GameList list) {
		this.id = list.getId();
		this.name = list.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
