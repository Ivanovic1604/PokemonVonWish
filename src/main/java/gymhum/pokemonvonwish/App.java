package gymhum.pokemonvonwish;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

/**
 * JavaFX App
 */
public class App extends Application {
    private static ArrayList<MoveModel> TrainerMoves;
    private static ArrayList<PokemonModel> TrainerPokemon;
    private static ArrayList<PokemonModel> SpielerPokemon;
    private static ArrayList<TrainerModel> Trainer;
    private static ArrayList<SpielerModel> Spieler;
    private static ArrayList<MoveModel> SpielerMoves;

    public static ArrayList<PokemonModel> getSpielerPokemon() {
        return SpielerPokemon;
    }

    public static void setSpielerPokemon(ArrayList<PokemonModel> SpielerPokemon) {
        App.SpielerPokemon = SpielerPokemon;
    }

    public static ArrayList<MoveModel> getSpielerMoves() {
        return SpielerMoves;
    }

    public static void setSpielerMoves(ArrayList<MoveModel> SpielerMoves) {
        App.SpielerMoves = SpielerMoves;
    }

    public static ArrayList<TrainerModel> getTrainer() {
        return Trainer;
    }

    public static void setTrainer(ArrayList<TrainerModel> Trainer) {
        App.Trainer = Trainer;
    }
    private static Scene scene;

    public static ArrayList<PokemonModel> getTrainerPokemon() {
        return TrainerPokemon;
    }

    public static void setTrainerPokemon(ArrayList<PokemonModel> TrainerPokemon) {
        App.TrainerPokemon = TrainerPokemon;
    }
    
    public static ArrayList<MoveModel> getTrainerMoves() {
        return TrainerMoves;
    }

    public static void setTrainerMoves(ArrayList<MoveModel> TrainerMoves) {
        App.TrainerMoves = TrainerMoves;
    }
    
    
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("HomeScreenView"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
       TrainerPokemon = new ArrayList<PokemonModel>();
       TrainerMoves = new ArrayList<MoveModel>();
       Trainer = new ArrayList<TrainerModel>();
       Spieler = new ArrayList<SpielerModel>();
       SpielerMoves = new ArrayList<MoveModel>();
       SpielerPokemon = new ArrayList<PokemonModel>();
       //GLURAK
       App.TrainerMoves.add(new MoveModel("Flammenwurf", 95, 0, 15)); // 0
       App.TrainerMoves.add(new MoveModel("Inferno", 100, 0 , 15)); // 1
       App.TrainerMoves.add(new MoveModel("Drachen Klaue", 80, 0, 15)); // 2
       App.TrainerMoves.add(new MoveModel("Schlitzer", 70, 0, 15)); // 3
       // Lugia
       App.TrainerMoves.add(new MoveModel("Himmelsfeger", 140, 0, 15)); // 4
       App.TrainerMoves.add(new MoveModel("Seher", 120, 0, 15)); // 5
       App.TrainerMoves.add(new MoveModel("Hydropumpe", 110, 0, 15)); // 6
       App.TrainerMoves.add(new MoveModel("Luftstoß", 100, 0, 15)); // 7 
       // Karpador
       App.TrainerMoves.add(new MoveModel("Platscher", 1, 0, 0)); // 8
       App.TrainerMoves.add(new MoveModel("PLACEHOLDER", 0 ,0 ,0)); // 8
       // Mewtwo
       App.TrainerMoves.add(new MoveModel("Psychostoß", 100, 0, 0)); // 10
       App.TrainerMoves.add(new MoveModel("Psychokinese", 90, 0, 0)); // 11
       App.TrainerMoves.add(new MoveModel("Antik-Kraft", 60, 0, 0)); // 12
       App.TrainerMoves.add(new MoveModel("AuraSphäre", 80, 0, 0)); // 13
       // TAUBSI
       App.TrainerMoves.add(new MoveModel("Tackle", 40, 0, 0)); // 14
       
       App.TrainerPokemon.add(new PokemonModel(300, "Glurak", "100", App.getTrainerMoves().get(0), App.getTrainerMoves().get(1), App.getTrainerMoves().get(2), App.getTrainerMoves().get(3)));
       App.TrainerPokemon.add(new PokemonModel(450, "Lugia", "100", App.getTrainerMoves().get(4), App.getTrainerMoves().get(5), App.getTrainerMoves().get(6), App.getTrainerMoves().get(7)));
       App.TrainerPokemon.add(new PokemonModel(100, "Karpador", "1", App.getTrainerMoves().get(8), App.getTrainerMoves().get(9), App.getTrainerMoves().get(9), App.getTrainerMoves().get(9)));
       App.TrainerPokemon.add(new PokemonModel(550, "Mewtwo", "100", App.getTrainerMoves().get(10), App.getTrainerMoves().get(11), App.getTrainerMoves().get(12), App.getTrainerMoves().get(13)));
       App.TrainerPokemon.add(new PokemonModel(100, "Taubsi", "1", App.getTrainerMoves().get(14), App.getTrainerMoves().get(9),  App.getTrainerMoves().get(9),  App.getTrainerMoves().get(9)));
       App.TrainerPokemon.add(new PokemonModel(100, "Raupy", "1",  App.getTrainerMoves().get(14), App.getTrainerMoves().get(9),  App.getTrainerMoves().get(9),  App.getTrainerMoves().get(9)));
       //TRAINER 1
       App.Trainer.add(new TrainerModel("Billy", 3, App.getTrainerPokemon().get(2), App.getTrainerPokemon().get(4), App.getTrainerPokemon().get((5))));
       App.Trainer.add(new TrainerModel("Günther", 3, App.getTrainerPokemon().get(0), App.getTrainerPokemon().get(1), App.getTrainerPokemon().get(3) ));
       
       //Despotar
        App.SpielerMoves.add(new MoveModel("Hyperstrahl", 120, 0, 35)); //0
        App.SpielerMoves.add(new MoveModel("Knirscher", 70, 0, 10)); //1
        App.SpielerMoves.add(new MoveModel("Erdbeben", 100, 0, 20)); //2
        App.SpielerMoves.add(new MoveModel("Wutanfall", 90, 0, 15)); //3
        App.SpielerPokemon.add(new PokemonModel(500, "Despotar", "100", App.getTrainerMoves().get(0), App.getTrainerMoves().get(1), App.getTrainerMoves().get(2),App.getTrainerMoves().get(3)));
        // Simsala
        App.SpielerMoves.add(new MoveModel("Psychokinese", 90, 0, 10)); //4
        App.SpielerMoves.add(new MoveModel("Traumfresser", 100, 0, 15)); //5
        App.SpielerMoves.add(new MoveModel("Eishieb", 75, 0, 15)); //6
        App.SpielerMoves.add(new MoveModel("Genesungl", 0, 100, 35)); //7
        App.SpielerPokemon.add(new PokemonModel(300, "Simsala", "100", App.getTrainerMoves().get(4), App.getTrainerMoves().get(5), App.getTrainerMoves().get(6), App.getTrainerMoves().get(7)));
        // Gengar
        App.SpielerMoves.add(new MoveModel("Schlecker", 120, -50, 15)); //8
        App.SpielerMoves.add(new MoveModel("Explosion", 170, -170, 5)); //9
        App.SpielerMoves.add(new MoveModel("Megasauger", 40, 60, 10)); //10
        App.SpielerMoves.add(new MoveModel("Spukball", 80, 70, 10));//11
        App.SpielerPokemon.add(new PokemonModel(300, "Gengar", "100", App.getSpielerMoves().get(8), App.getTrainerMoves().get(9), App.getTrainerMoves().get(10), App.getTrainerMoves().get(11)));
        //Trainer
       
       
       
       
       
       launch();
    }

}