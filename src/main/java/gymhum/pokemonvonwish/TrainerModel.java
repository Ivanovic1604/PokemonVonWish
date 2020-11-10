/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymhum.pokemonvonwish;

/**
 *
 * @author ivan
 */
public class TrainerModel {
    
    private String name;
    private int verbleibenePokemon;
    private PokemonModel Pokemon;

    public PokemonModel getPokemon() {
        return Pokemon;
    }

    public void setPokemon(PokemonModel Pokemon) {
        this.Pokemon = Pokemon;
    }

    public TrainerModel(String name, int verbleibenePokemon, PokemonModel Pokemon, PokemonModel Poke2, PokemonModel Poke3, PokemonModel Poke4, PokemonModel Poke5, PokemonModel Poke6) {
        setName(name);
        setVerbleibenePokemon(verbleibenePokemon);
        setPokemon(Pokemon);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVerbleibenePokemon() {
        return verbleibenePokemon;
    }

    public void setVerbleibenePokemon(int verbleibenePokemon) {
        this.verbleibenePokemon = verbleibenePokemon;
    }

   
    
    
    
    
}
