package com.example.flags;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class FlagsApplication extends Application {

    @Override
    public void start(Stage stage) {
        ImageView canadaFlag = new ImageView(new Image("file:/src/main/resources/images/canada.jpg"));
        canadaFlag.setFitWidth(150);
        canadaFlag.setFitHeight(100);

        ImageView chinaFlag = new ImageView(new Image("file:/src/main/resources/images/china.png"));
        chinaFlag.setFitWidth(150);
        chinaFlag.setFitHeight(100);

        ImageView unitedKingdomFlag = new ImageView(new Image("file:/src/main/resources/images/uk.jpg"));
        unitedKingdomFlag.setFitWidth(150);
        unitedKingdomFlag.setFitHeight(100);

        ImageView unitedStatesOfAmericaFlag = new ImageView(new Image("file:/src/main/resources/images/usa.png"));
        unitedStatesOfAmericaFlag.setFitWidth(150);
        unitedStatesOfAmericaFlag.setFitHeight(100);

        GridPane flagBox = new GridPane();
        flagBox.add(canadaFlag, 0, 0);
        flagBox.add(chinaFlag, 1, 0);
        flagBox.add(unitedKingdomFlag, 0, 1);
        flagBox.add(unitedStatesOfAmericaFlag, 1, 1);
        flagBox.setAlignment(Pos.CENTER);
        flagBox.setHgap(5);
        flagBox.setVgap(5);


        Scene scene = new Scene(flagBox, 300, 200);
        stage.setTitle("Flags");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
