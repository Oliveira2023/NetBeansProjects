package portifolio.mavenproject2;

import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        var title = "Caixa Eletrônico";
        
        System.out.print("Digite o numero da seleção desejada:");
        var input = new Scanner(System.in);
        float selecao = input.nextFloat();
        
        TextArea opcoes = new TextArea();
        
        
        var label = new Label("Olá, Realize suas operações aqui!");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setTitle(title);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}