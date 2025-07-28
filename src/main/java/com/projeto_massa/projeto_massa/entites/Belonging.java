package com.projeto_massa.projeto_massa.entites;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	@EmbeddedId
	private BelongingPk belonging = new BelongingPk();
	private Integer position;
	
	public Belonging() {
		
	}

	public Belonging(Game game, GameList list, Integer position) {
		this.belonging.setGame(game);
		this.belonging.setList(list);
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(belonging);
	}

	public BelongingPk getBelonging() {
		return belonging;
	}

	public void setBelonging(BelongingPk belonging) {
		this.belonging = belonging;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(belonging, other.belonging);
	}
	
	
}
