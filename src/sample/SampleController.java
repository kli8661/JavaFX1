package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.awt.*;

public class SampleController {

    public Label helloWorld;
    public Label incrementS;
    public Label incrementS2;
    public Label incrementS3;
    private int score;
    private int score1;
    private int score2;

    public void sayHelloWorld(ActionEvent actionEvent) {
        helloWorld.setText("Hello World!");
    }

    public void incrementScore(ActionEvent actionEvent) {
        score++;
        incrementS.setText("" + score);
    }

    public void incrementScoreBy2(ActionEvent actionEvent) {
        score1 = score1 + 2;
        incrementS2.setText("" + score1);
    }

    public void incrementScoreBy3(ActionEvent actionEvent) {
        score2 = score2 + 3;
        incrementS3.setText("" + score2);
    }
}
