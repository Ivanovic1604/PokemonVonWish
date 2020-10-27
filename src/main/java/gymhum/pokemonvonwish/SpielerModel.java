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
    private ArrayList<PokemonModel> spielerpokemon;

    public SpielerModel(String name, int verbleibednePokemon, ArrayList<PokemonModel> spielerpokemon) {
        setName(name);
        setVerbleibednePokemon(verbleibednePokemon);
        this.spielerpokemon = new ArrayList<PokemonModel>();
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

    public ArrayList<PokemonModel> getSpielerpokemon() {
        return spielerpokemon;
    }

    public void setSpielerpokemon(ArrayList<PokemonModel> spielerpokemon) {
        this.spielerpokemon = spielerpokemon;
    }
    
}
