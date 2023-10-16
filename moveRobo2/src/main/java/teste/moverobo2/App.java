package teste.moverobo2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    private final int DIM_X = 300;
    private final int DIM_Y = 220;
    private final int altura = 60;
    private final int largura = 64;
    private int posX = DIM_X/2 - largura/2;
    private int posY = DIM_Y/2 - altura/2;
    private int velocidade = 1;
    
    
    private final Image imgFrente = new Image(getClass()
            .getResourceAsStream(""));
    
    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        
        

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}