package com.apilayer.data.pokeapi.moveailment;

import java.util.List;

import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.move.Move;
import com.apilayer.data.pokeapi.locale.Localizable;

public class MoveAilment implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<NamedApiResource<Move>> moves;
	private List<Name> names;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<NamedApiResource<Move>> getMoves() {
		return moves;
	}
	public void setMoves(List<NamedApiResource<Move>> moves) {
		this.moves = moves;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
}
