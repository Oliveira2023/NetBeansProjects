package teste.formas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();
        
        Rectangle retangulo = new Rectangle(100,100);
        retangulo.setTranslateX(10);
        retangulo.setTranslateY(10);
        retangulo.setFill(Color.RED);
        
        Circle circulo = new Circle(50);
        circulo.setTranslateX(170);
        circulo.setTranslateY(60);
        circulo.setFill(Color.GREEN);
        
        Circle circunferencia = new Circle(50);
        circunferencia.setTranslateX(280);
        circunferencia.setTranslateY(60);
        circunferencia.setStroke(Color.BLUE);
        circunferencia.setStrokeWidth(3.0);
        circunferencia.setFill(Color.WHITE);
        
        Ellipse elipse = new Ellipse(50, 25);
        elipse.setTranslateX(390);
        elipse.setTranslateY(60);
        elipse.setFill(Color.YELLOW);
        
        Line linha = new Line(10.0f, 10.0f, 100.0f,100.0f);
        linha.setTranslateX(450);
        linha.setTranslateY(10);
        linha.setStroke(Color.GREENYELLOW);
        linha.setStrokeWidth(3.0);
        
        Polygon poligono = new Polygon();
        poligono.getPoints().addAll(new Double[]{
            0.0, 00.0,
            100.0, 0.0,
            50.0, 100.0
        });
        poligono.setTranslateX(550);
        poligono.setTranslateY(10);
        poligono.setFill(Color.SKYBLUE);
        
        Polyline polilinha = new Polyline();
        polilinha.getPoints().addAll(new Double[]{
            0.0, 0.0,
            100.0, 0.0,
            0.0, 100.0,
            100.0, 100.0
        });
        polilinha.setTranslateX(670);
        polilinha.setTranslateY(10);
        polilinha.setStroke(Color.BLACK);
        polilinha.setStrokeWidth(3.0);
        
        Group grupo = new Group();
        grupo.getChildren().addAll(retangulo, circulo,
                circunferencia, elipse, linha, poligono, polilinha);
        
        Scene cena = new Scene(grupo, 800, 120);
        

        var label = new Label("Hello, JavaFX " + javafxVersion + ", running on Java " + javaVersion + ".");
        var scene = new Scene(new StackPane(label), 640, 480);
        stage.setTitle("Aplicação figuras Geométricas");
        stage.setScene(cena);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}