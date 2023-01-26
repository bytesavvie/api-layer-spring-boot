package com.apilayer.data.pokeapi.pokemonshape;

import java.util.List;

import com.apilayer.data.pokeapi.Name;
import com.apilayer.data.pokeapi.NamedApiResource;
import com.apilayer.data.pokeapi.PokeApiResource;
import com.apilayer.data.pokeapi.pokemonspecies.PokemonSpecies;
import com.apilayer.data.pokeapi.locale.Localizable;

public class PokemonShape implements PokeApiResource, Localizable {

	private Integer id;
	private String name;
	private List<AwesomeName> awesomeNames;
	private List<Name> names;
	private List<NamedApiResource<PokemonSpecies>> pokemonSpecies;
	
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
	public List<AwesomeName> getAwesomeNames() {
		return awesomeNames;
	}
	public void setAwesomeNames(List<AwesomeName> awesomeNames) {
		this.awesomeNames = awesomeNames;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<NamedApiResource<PokemonSpecies>> getPokemonSpecies() {
		return pokemonSpecies;
	}
	public void setPokemonSpecies(List<NamedApiResource<PokemonSpecies>> pokemonSpecies) {
		this.pokemonSpecies = pokemonSpecies;
	}
	
}
