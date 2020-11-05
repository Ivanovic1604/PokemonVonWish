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
       //GLURAK
       App.TrainerMoves.add(new MoveModel("Flammenwurf", 95, 0, 15)); // 0
       App.TrainerMoves.add(new MoveModel("Inferno", 100, 0 , 15)); // 1
       App.TrainerMoves.add(new MoveModel("Drachen Klaue", 80, 0, 15)); // 2
       App.TrainerMoves.add(new MoveModel("Schlitzer", 70, 0, 15)); // 3
       App.TrainerPokemon.add(new PokemonModel(300, "Glurak", "100", App.getTrainerMoves().get(0), App.getTrainerMoves().get(1), App.getTrainerMoves().get(2), App.getTrainerMoves().get(3)));
       // Lugia
       App.TrainerMoves.add(new MoveModel("Himmelsfeger", 140, 0, 15)); // 4
       App.TrainerMoves.add(new MoveModel("Seher", 120, 0, 15)); // 5
       App.TrainerMoves.add(new MoveModel("Hydropumpe", 110, 0, 15)); // 6
       App.TrainerMoves.add(new MoveModel("Luftstoß", 100, 0, 15)); // 7
       App.TrainerPokemon.add(new PokemonModel(450, "Lugia", "100", App.getTrainerMoves().get(4), App.getTrainerMoves().get(5), App.getTrainerMoves().get(6), App.getTrainerMoves().get(7)));
       // Karpador
       App.TrainerMoves.add(new MoveModel("Platscher", 1, 0, 0)); // 8
       App.TrainerMoves.add(new MoveModel("PLACEHOLDER", 0 ,0 ,0)); // 8
       App.TrainerPokemon.add(new PokemonModel(100, "Karpador", "1", App.getTrainerMoves().get(8), App.getTrainerMoves().get(9), App.getTrainerMoves().get(9), App.getTrainerMoves().get(9)));
       // Mewtwo
       App.TrainerMoves.add(new MoveModel("Psychostoß", 100, 0, 0)); // 10
       App.TrainerMoves.add(new MoveModel("Psychokinese", 90, 0, 0)); // 11
       App.TrainerMoves.add(new MoveModel("Antik-Kraft", 60, 0, 0)); // 12
       App.TrainerMoves.add(new MoveModel("AuraSphäre", 80, 0, 0)); // 13
       App.TrainerPokemon.add(new PokemonModel(550, "Mewtwo", "100", App.getTrainerMoves().get(10), App.getTrainerMoves().get(11), App.getTrainerMoves().get(12), App.getTrainerMoves().get(13)));
       // TAUBSI
      
       
       
       
       
       
       launch();
    }

}