/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymhum.pokemonvonwish;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

/**
 * FXML Controller class
 *
 * @author Api
 */
public class KampfViewController implements Initializable {

    @FXML
    private ProgressBar Leben;
    @FXML
    private Label PokemonL;
    private int nHP;

    public int getnHP() {
        return nHP;
    }

    public void setnHP(int nHP) {
        this.nHP = nHP;
    }

    int i = 0;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO#
       this.PokemonL.setText(App.getTrainerPokemon().get(0).getName());
    }    

    private void switchPokemon(){
       
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        
      
        
    }
    
    @FXML
    private void btnFlammenWurf(ActionEvent event) throws IOException { 
        
        int nHP = App.getTrainerPokemon().get(0).getHealthPoints() - App.getTrainerMoves().get(5).getDamage();
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        System.out.println(nHP);
        if(nHP < 0){
            this.PokemonL.setText(App.getTrainerPokemon().get(0).getName());
            System.out.println(App.getTrainerPokemon().size());
            App.getTrainerPokemon().remove(i);
            switchPokemon();
        }   else{
            //System.out.println("lebt");
           
       
        }
        
    }
}