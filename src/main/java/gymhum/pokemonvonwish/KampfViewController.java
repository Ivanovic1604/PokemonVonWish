/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymhum.pokemonvonwish;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;
/**
 * FXML Controller class
 *
 * @author Api
 */
public class KampfViewController implements Initializable {

    @FXML
    private Label PokemonL;
    private int nHP;
    @FXML
    private Button Move1;
    @FXML
    private Button Move2;
    @FXML
    private Button Move3;
    @FXML
    private Button Move4;
    private int sHP;
    
    public int getsHP(){
        return sHP;
    }
    public void setsHP(int sHP){
        this.sHP = sHP;
    }
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
       setsHP(App.getSpielerPokemon().get(0).getHealthPoints());
       this.PokemonL.setText(App.getTrainerPokemon().get(0).getName());
       this.Move1.setText(App.getSpielerMoves().get(0).getName());
       this.Move2.setText(App.getSpielerMoves().get(1).getName());
       this.Move3.setText(App.getSpielerMoves().get(2).getName());
       this.Move4.setText(App.getSpielerMoves().get(3).getName());
       System.out.println(sHP);
    }    

    private void switchTrainerPokemon(){
            this.PokemonL.setText(App.getTrainerPokemon().get(0).getName());
            App.getTrainerPokemon().remove(0);
            App.getTrainerMoves().remove(0);
            App.getTrainerMoves().remove(1);
            App.getTrainerMoves().remove(2);
            App.getTrainerMoves().remove(3);
    }
    
    private void TrainerAngriff(){
        int g = new Random().nextInt(4);
        int sHP = App.getSpielerPokemon().get(0).getHealthPoints() - App.getTrainerMoves().get(g).getDamage();
        App.getSpielerPokemon().get(0).setHealthPoints(sHP);
        //System.out.println(g);
        System.out.println(sHP);
        if(sHP < 0){
            switchSpielerPokemon();
             System.out.println(App.getSpielerPokemon().size());
        }  
    }

    private void switchSpielerPokemon(){
        App.getSpielerPokemon().remove(0);
        App.getSpielerMoves().remove(0);
        App.getSpielerMoves().remove(1);
        App.getSpielerMoves().remove(2);
        App.getSpielerMoves().remove(3);
        
        this.Move1.setText(App.getSpielerMoves().get(0).getName());
        this.Move2.setText(App.getSpielerMoves().get(1).getName());
        this.Move3.setText(App.getSpielerMoves().get(2).getName());
        this.Move4.setText(App.getSpielerMoves().get(3).getName());
       
        
        
   }
    @FXML
    private void btnMove1(ActionEvent event) {
        int g = new Random().nextInt(4);
        int nHP = App.getTrainerPokemon().get(0).getHealthPoints() - App.getSpielerMoves().get(0).getDamage();
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        TrainerAngriff();
        if(nHP < 0){
            switchTrainerPokemon();  
        }
       
    }

    @FXML
    private void btnMove2(ActionEvent event) {
        int g = new Random().nextInt(4);
        int nHP = App.getTrainerPokemon().get(0).getHealthPoints() - App.getSpielerMoves().get(1).getDamage();
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        TrainerAngriff();
        if(nHP < 0){ 
            switchTrainerPokemon();  
        }
        if(sHP < 0){
            switchSpielerPokemon();
        }
    
    }

    @FXML
    private void btnMove3(ActionEvent event) {
        int g = new Random().nextInt(4);
        int nHP = App.getTrainerPokemon().get(0).getHealthPoints() - App.getSpielerMoves().get(2).getDamage();
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        TrainerAngriff();
        if(nHP < 0){
            switchTrainerPokemon();  
        }
        if(sHP < 0){
            switchSpielerPokemon();
        }
       
    }

    @FXML
    private void btnMove4(ActionEvent event) {
        int g = new Random().nextInt(4);
        int nHP = App.getTrainerPokemon().get(0).getHealthPoints() - App.getSpielerMoves().get(3).getDamage();
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        TrainerAngriff();
        if(nHP < 0){ 
            switchTrainerPokemon();  
        }
        if(sHP < 0){
            switchSpielerPokemon();
        }
    }
  }

