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
    private MoveModel moves;
   
    public PokemonModel(int healthPoints, String name, String level, MoveModel moves, MoveModel moves2, MoveModel moves3, MoveModel moves4){
        setHealthPoints(healthPoints);
        setName(name);
        setLevel(level);
        setMoves(moves);
        
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

    public void setMoves(MoveModel moves){
        this.moves = moves;
    }
    public MoveModel getMoves(){
        return this.moves;
    }
}
