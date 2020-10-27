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
public class TrainerModel {
    
    private String name;
    private int verbleibenePokemon;
    private ArrayList<PokemonModel> gegnerpokemon;

    public TrainerModel(String name, int verbleibenePokemon, ArrayList<PokemonModel> gegnerpokemon) {
        setName(name);
        setVerbleibenePokemon(verbleibenePokemon);
        this.gegnerpokemon = new ArrayList<PokemonModel>();
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

    public ArrayList<PokemonModel> getGegnerpokemon() {
        return gegnerpokemon;
    }

    public void setGegnerpokemon(ArrayList<PokemonModel> gegnerpokemon) {
        this.gegnerpokemon = gegnerpokemon;
    }
    
    
    
    
}
