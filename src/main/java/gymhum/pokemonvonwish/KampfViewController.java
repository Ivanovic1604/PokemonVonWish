/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gymhum.pokemonvonwish;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;
import javafx.scene.control.TextField;
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
    @FXML
    private Label LabelSpieler;
    @FXML
    private TextField tfMenue;
    @FXML
    private Label lblSpielerLeben;
    @FXML
    private Label lblTrainerLeben;
    
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
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       setsHP(App.getSpielerPokemon().get(0).getHealthPoints());
       this.PokemonL.setText(App.getTrainerPokemon().get(0).getName());
       this.Move1.setText(App.getSpielerMoves().get(0).getName());
       this.Move2.setText(App.getSpielerMoves().get(1).getName());
       this.Move3.setText(App.getSpielerMoves().get(2).getName());
       this.Move4.setText(App.getSpielerMoves().get(3).getName());
       System.out.println(sHP);
       System.out.println(App.getSpielerMoves().size());
    }    

    private void switchTrainerPokemon() throws IOException{
       if(App.getTrainerPokemon().get(0).getLevel() == 2000 && App.getTrainerMoves().get(0).getAP() == 100){
            App.setRoot("Poke");
       }
       else{
           this.PokemonL.setText(App.getTrainerPokemon().get(0).getName());
            App.getTrainerPokemon().remove(0);
            App.getTrainerMoves().remove(0);
            App.getTrainerMoves().remove(1);
            App.getTrainerMoves().remove(2);
            App.getTrainerMoves().remove(3);   
       }
    }
    private void TrainerAngriff() throws IOException{
        int g = new Random().nextInt(4);
       
                int sHP = App.getSpielerPokemon().get(0).getHealthPoints() - App.getTrainerMoves().get(g).getDamage();
        App.getSpielerPokemon().get(0).setHealthPoints(sHP);
        this.tfMenue.setText(App.getTrainerPokemon().get(0).getName() + " " + "hat" + " " + App.getTrainerMoves().get(g).getName() + " " + "eingesetzt und hat" + " " + App.getTrainerMoves().get(g).getDamage() + " " + "angerichtet");
    
        String pHP = String.valueOf(sHP);
        
        this.lblSpielerLeben.setText(pHP);
        System.out.println("Größe" + " " + App.getSpielerMoves().size());
        System.out.println("Anzahl" + " " + App.getSpielerPokemon().size());
        System.out.println("lvl" + App.getSpielerPokemon().get(0).getLevel());
        System.out.println("lvlelele" + App.getTrainerPokemon().get(0).getLevel());
        
        if(sHP < 0){
            switchSpielerPokemon();
        }
        if(App.getTrainerPokemon().get(0).getLevel() == 2000 ){
            App.setRoot("WinView");
       }
         if(App.getSpielerMoves().get(3).getAP() == 100){
           App.setRoot("LoseView");
       }
    }

    private void switchSpielerPokemon() throws IOException{
            App.getSpielerPokemon().remove(0);
            App.getSpielerMoves().remove(0);
            App.getSpielerMoves().remove(1);
            App.getSpielerMoves().remove(2);
            App.getSpielerMoves().remove(3);
            this.LabelSpieler.setText(App.getSpielerMoves().get(0).getName());
            this.Move1.setText(App.getSpielerMoves().get(0).getName());
            this.Move2.setText(App.getSpielerMoves().get(1).getName());
            this.Move3.setText(App.getSpielerMoves().get(2).getName());
            this.Move4.setText(App.getSpielerMoves().get(3).getName());                    
        
    } 
    @FXML
    
    
    private void btnMove1(ActionEvent event) throws IOException {
        int g = new Random().nextInt(4);
        int nHP = App.getTrainerPokemon().get(0).getHealthPoints() - App.getSpielerMoves().get(0).getDamage();
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        TrainerAngriff();
        String tHP = String.valueOf(nHP);
        this.lblTrainerLeben.setText(tHP);
        if(nHP < 0){
            switchTrainerPokemon();  
        }
       this.tfMenue.setText(App.getSpielerPokemon().get(0).getName() + " " + "hat" + " " + App.getSpielerMoves().get(0).getName() + " " + "eingesetzt und hat" + " " + App.getSpielerMoves().get(0).getDamage() + " " + "angerichtet");  
    }

    @FXML
    private void btnMove2(ActionEvent event) throws IOException {
        int g = new Random().nextInt(4);
        int nHP = App.getTrainerPokemon().get(0).getHealthPoints() - App.getSpielerMoves().get(1).getDamage();
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        String tHP = String.valueOf(nHP);
        this.lblTrainerLeben.setText(tHP);
        TrainerAngriff();
        if(nHP < 0){ 
            switchTrainerPokemon();  
        }
        if(sHP < 0){
            switchSpielerPokemon();
        }
        this.tfMenue.setText(App.getSpielerPokemon().get(0).getName() + " " + "hat" + " " + App.getSpielerMoves().get(1).getName() + " " + "eingesetzt und hat" + " " + App.getSpielerMoves().get(1).getDamage() + " " + "angerichtet");
    }

    @FXML
    private void btnMove3(ActionEvent event) throws IOException {
        int g = new Random().nextInt(4);
        int nHP = App.getTrainerPokemon().get(0).getHealthPoints() - App.getSpielerMoves().get(2).getDamage();
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        String tHP = String.valueOf(nHP);
        this.lblTrainerLeben.setText(tHP);
        TrainerAngriff();
        if(nHP < 0){
            switchTrainerPokemon();  
        }
        if(sHP < 0){
            switchSpielerPokemon();
        }
        this.tfMenue.setText(App.getSpielerPokemon().get(0).getName() + " " + "hat" + " " + App.getSpielerMoves().get(2).getName() + " " + "eingesetzt und hat" + " " + App.getSpielerMoves().get(2).getDamage() + " " + "angerichtet");
    }

    @FXML
    private void btnMove4(ActionEvent event) throws IOException {
        int g = new Random().nextInt(4);
        int nHP = App.getTrainerPokemon().get(0).getHealthPoints() - App.getSpielerMoves().get(3).getDamage();
        App.getTrainerPokemon().get(0).setHealthPoints(nHP);
        String tHP = String.valueOf(nHP);
        this.lblTrainerLeben.setText(tHP);
        TrainerAngriff();
        if(nHP < 0){ 
            switchTrainerPokemon();  
        }
        if(sHP < 0){
            switchSpielerPokemon();
        }
        this.tfMenue.setText(App.getSpielerPokemon().get(0).getName() + " " + "hat" + " " + App.getSpielerMoves().get(3).getName() + " " + "eingesetzt und hat" + " " + App.getSpielerMoves().get(3).getDamage() + " " + "angerichtet");
    }
  }

