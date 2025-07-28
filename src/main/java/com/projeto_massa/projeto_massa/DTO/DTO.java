package com.projeto_massa.projeto_massa.DTO;

import org.springframework.beans.BeanUtils;

import com.projeto_massa.projeto_massa.entites.Game;
import com.projeto_massa.projeto_massa.projections.GameMinProjection;

// Esse é do Game
public class DTO {
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private String imgUrl;
	
	public DTO() {
		
	}

	public DTO(Game entity) {
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.genre = entity.getGenre();
		this.platforms = entity.getPlatforms();
		this.imgUrl = entity.getImgUrl();
		this.id = entity.getId();
	}
	
	public DTO(GameMinProjection game) {
		this.title = game.getTitle();
		this.year = game.getYear();
		this.imgUrl = game.getImgUrl();
		this.id = game.getId();
	}
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public String getImgUrl() {
		return imgUrl;
	}
	
	
	
}
