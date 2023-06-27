package bat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Model.Acertou;
import Model.Barco;
import Model.Couracado;
import Model.PortaAviao;
import Model.Posiciona;
import Model.Submarino;
import Model.Tabuleiro;
import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

// import java.io.IOException;

//public class App {

// public static void main(String[] args) {
// Tabuleiro tabuleiro = new Tabuleiro();
// Posiciona posiciona = new Posiciona();
// Acertou acertou = new Acertou();

// Submarino submarino1 = new Submarino();
// Couracado couracado1 = new Couracado();
// PortaAviao portaAviao = new PortaAviao();

// Submarino submarino2 = new Submarino();
// Couracado couracado2 = new Couracado();

// Submarino submarino3 = new Submarino();

// /*ArrayList<Submarino> submarinos = new ArrayList<Submarino>();
// ArrayList<Couracado> couracados = new ArrayList<Couracado>();

// submarinos.add(submarino1);
// submarinos.add(submarino2);
// submarinos.add(submarino3);

// couracados.add(couracado1);
// couracados.add(couracado2);
// */
// ArrayList<Barco> barcos = new ArrayList<Barco>();

// barcos.add(submarino1);
// barcos.add(submarino2);
// barcos.add(submarino3);
// barcos.add(couracado1);
// barcos.add(couracado2);
// barcos.add(portaAviao);

// posiciona.setTabuleiro(tabuleiro);
// acertou.setTabuleiro(tabuleiro);
// acertou.setBarcos(barcos);

// posiciona.setPortaAviao(portaAviao);
// posiciona.getSubmarino();
// //posiciona.posicionaBarco(Couracado.getNome(), 5 ,6);
// //posiciona.posicionaBarco(portaAviao, 5 ,5);
// //posiciona.posicionaBarco(PortaAviao.getNome(), 5 ,4);
// posiciona.posicionaBarco(submarino1, 5 ,6);
// System.out.println(submarino1.getX() +""+ submarino1.getY());
// //posiciona.posicionaBarco(Submarino.getNome(), 1 ,2);
// //posiciona.posicionaBarcovertical(Submarino.getNome(), 7, 2);
// //posiciona.posicionaBarcovertical(couracado1, 3, 3);
// //posiciona.posicionaBarcovertical(PortaAviao.getNome(), 5,4);
// //posiciona.getTabuleiro().mostrarTabuleiro();
// acertou.acertou(5, 7);
// acertou.acertou(5, 6);

// tabuleiro.mostrarTabuleiro();

// }

// }

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("primary"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml +
                ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}