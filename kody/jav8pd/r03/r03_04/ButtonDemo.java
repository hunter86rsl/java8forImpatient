package r03.r03_04;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.stage.*;

//Z wiersza poleceñ mo¿esz uruchomiæ ten program pisz¹c
//java r03.r03_04.ButtonDemo
//mimo, ¿e nie ma metody main

public class ButtonDemo extends Application {
    public void start(Stage stage) {

        Button button = new Button("Ok");
        button.setOnAction(event -> 
            System.out.println("Dziêki za klikniêcie!"));

        Label message = new Label("Witaj, JavaFX!");
        message.setFont(new Font(100));
        VBox root = new VBox();
        root.getChildren().addAll(button, message);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}