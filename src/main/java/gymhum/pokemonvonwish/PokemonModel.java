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
public class PokemonModel {
    
    private int healthPoints;
    private String name;
    private String level;
    private ArrayList<MoveModel> moves;
   
    public PokemonModel(int healthPoints, String name, String level, ArrayList<MoveModel> moves){
        setHealthPoints(healthPoints);
        setName(name);
        setLevel(level);
        this.moves = new ArrayList <MoveModel>();
        
}
    

    

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public ArrayList<MoveModel> getMoves() {
        return this.moves;
    }

    public void setMoves(ArrayList<MoveModel> moves) {
        this.moves = moves;
    }
    
    
}
