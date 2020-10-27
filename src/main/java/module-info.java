module gymhum.pokemonvonwish {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens gymhum.pokemonvonwish to javafx.fxml;
    exports gymhum.pokemonvonwish;
}
