import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.FontPosture;
import javafx.scene.paint.Color;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import java.util.*;

public class CE pr101 extends Application {
    public void start(Stage stage) {
        VBox v = new VBox(10);
        v.setAlignment(Pos.CENTER);

        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            Text t = new Text("Text " + i);

            t.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));

            double red = r.nextDouble();
            double green = r.nextDouble();
            double blue = r.nextDouble();
            double opacity = 0.3 + (0.7 * r.nextDouble());

            t.setFill(new Color(red, green, blue, opacity));

            v.getChildren().add(t);
        }

        Scene s = new Scene(v, 300, 300);
        stage.setScene(s);
        stage.setTitle("Text Display");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}