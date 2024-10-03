/**
 * 2º DAM Desarrollo de Interfaces
 * @author: Shihan Wei
 * Tema 1 Actividad 1
 * 4.3.5. Expresiones Lambda. KeyEvent
 * Fecha: 02/10/2024
 */

package es.ieslosmontecillos.lambdakeyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class KeyEvent extends Application {
    @Override
    public void start(Stage primaryStage) {

        Pane root = new Pane();

        /* creamos el objeto clase texto y lo añadimos al contenedor*/
        Text texto = new Text(20, 20, "A");
        root.getChildren().add(texto);

        texto.setFocusTraversable(true);

        /* se mueve el texto en función del teclado que presionemos */
        texto.setOnKeyPressed(event -> {

            switch (event.getCode()) {
                case DOWN:
                    texto.setY(texto.getY() + 10);
                    break;
                case UP:
                    texto.setY(texto.getY() - 10);
                    break;
                case RIGHT:
                    texto.setX(texto.getX() + 10);
                    break;
                case LEFT:
                    texto.setX(texto.getX() - 10);
                    break;
                default:
                    //si se pulsa sobre cualquier otra tecla, se cambia al teclado pulsado
                    texto.setText(event.getText());
                    break;
            }

        });

        Scene scene = new Scene(root, 200, 120);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}