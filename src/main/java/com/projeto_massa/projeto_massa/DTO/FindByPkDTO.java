package com.projeto_massa.projeto_massa.DTO;

import com.projeto_massa.projeto_massa.entites.Game;


public class FindByPkDTO{
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public FindByPkDTO() {
		
	}
	public FindByPkDTO(Game game) {
		this.id = game.getId();
		this.title = game.getTitle();
		this.year = game.getYear();
		this.genre = game.getGenre();
		this.platforms = game.getPlatforms();
		this.score = game.getScore();
		this.imgUrl = game.getImgUrl();
		this.shortDescription = game.getShortDescription();
		this.longDescription = game.getLongDescription();
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
	public Double getScore() {
		return score;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	
	
}
