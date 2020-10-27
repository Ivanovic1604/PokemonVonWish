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
    private static Scene scene;

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
       // TrainerMoves.add(new MoveModel("Flammenwurf", 95, 0, 15));
        //TrainerPokemon.add(new PokemonModel(300, "Glurak", "100"));
        
        
        
        launch();
    }

}