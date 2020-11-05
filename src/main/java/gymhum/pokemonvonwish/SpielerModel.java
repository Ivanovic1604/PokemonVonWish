/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymhum.pokemonvonwish;

import java.util.ArrayList;
/**
 *
 * @author ivan
 */
public class SpielerModel {
    
    private String name;
    private int verbleibednePokemon;
    private PokemonModel Pokemon;

    public SpielerModel(String name, int verbleibednePokemon, PokemonModel Pokemon, PokemonModel Poke2, PokemonModel Poke3) {
        setName(name);
        setVerbleibednePokemon(verbleibednePokemon);
        setPokemon(Pokemon);
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVerbleibednePokemon() {
        return verbleibednePokemon;
    }

    public void setVerbleibednePokemon(int verbleibednePokemon) {
        this.verbleibednePokemon = verbleibednePokemon;
    }

    public PokemonModel getPokemon() {
        return Pokemon;
    }

    public void setPokemon(PokemonModel Pokemon) {
        this.Pokemon = Pokemon;
    }

   
    
}
