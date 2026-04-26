import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class CE pr10-3 extends Application {
    public void start(Stage stage) {
        int scale = 5;

        VBox v1 = new VBox(5);
        Rectangle r1 = new Rectangle(50, 20 * scale);
        r1.setFill(Color.RED);
        Label l1 = new Label("Projects - 20%");
        v1.getChildren().addAll(r1, l1);
        v1.setAlignment(Pos.BOTTOM_CENTER);

        VBox v2 = new VBox(5);
        Rectangle r2 = new Rectangle(50, 10 * scale);
        r2.setFill(Color.BLUE);
        Label l2 = new Label("Quizzes - 10%");
        v2.getChildren().addAll(r2, l2);
        v2.setAlignment(Pos.BOTTOM_CENTER);

        VBox v3 = new VBox(5);
        Rectangle r3 = new Rectangle(50, 30 * scale);
        r3.setFill(Color.GREEN);
        Label l3 = new Label("Midterm - 30%");
        v3.getChildren().addAll(r3, l3);
        v3.setAlignment(Pos.BOTTOM_CENTER);

        VBox v4 = new VBox(5);
        Rectangle r4 = new Rectangle(50, 40 * scale);
        r4.setFill(Color.ORANGE);
        Label l4 = new Label("Final - 40%");
        v4.getChildren().addAll(r4, l4);
        v4.setAlignment(Pos.BOTTOM_CENTER);

        HBox h = new HBox(20);
        h.getChildren().addAll(v1, v2, v3, v4);
        h.setAlignment(Pos.BOTTOM_CENTER);

        Scene s = new Scene(h, 400, 300);
        stage.setScene(s);
        stage.setTitle("Bar Chart");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}