import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.stage.FileChooser;
import java.io.*;

public class CE pr10-2 extends Application {
    public void start(Stage stage) {
        GridPane g = new GridPane();
        g.setPadding(new Insets(20));
        g.setHgap(10);
        g.setVgap(10);

        TextField roll = new TextField();
        TextField name = new TextField();
        TextField age = new TextField();
        TextField email = new TextField();

        Button btn = new Button("Submit");

        g.add(new Label("Roll No"), 0, 0);
        g.add(roll, 1, 0);

        g.add(new Label("Name"), 0, 1);
        g.add(name, 1, 1);

        g.add(new Label("Age"), 0, 2);
        g.add(age, 1, 2);

        g.add(new Label("Email"), 0, 3);
        g.add(email, 1, 3);

        g.add(btn, 1, 4);

        btn.setOnAction(e -> {
            try {
                int r = Integer.parseInt(roll.getText());
                int a = Integer.parseInt(age.getText());

                String n = name.getText();
                String em = email.getText();

                if (!em.contains("@") || !em.contains(".")) {
                    throw new Exception("Invalid Email");
                }

                FileChooser fc = new FileChooser();
                File f = fc.showSaveDialog(stage);

                if (f != null) {
                    BufferedWriter bw = new BufferedWriter(new FileWriter(f));
                    bw.write(r + " " + n + " " + a + " " + em);
                    bw.close();
                }

                Alert ok = new Alert(Alert.AlertType.INFORMATION);
                ok.setContentText("Success\n" + r + " " + n + " " + a + " " + em);
                ok.show();

            } catch (NumberFormatException ex) {
                Alert er = new Alert(Alert.AlertType.ERROR);
                er.setContentText("Roll No and Age must be integers");
                er.show();
            } catch (Exception ex) {
                Alert er = new Alert(Alert.AlertType.ERROR);
                er.setContentText(ex.getMessage());
                er.show();
            }
        });

        Scene s = new Scene(g, 350, 250);
        stage.setScene(s);
        stage.setTitle("Registration Form");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}