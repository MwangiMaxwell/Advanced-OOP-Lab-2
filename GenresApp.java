import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GenresApp extends Application {

    @Override
    public void start(Stage stage) {

        Text text1 = new Text("Name:");
        Text text2 = new Text("Registered:");

        TextField textField1 = new TextField();

        ComboBox<String> comboBox = new ComboBox<>();

        Button button1 = new Button("Save");
        Button button2 = new Button("Remove");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(600, 400);

        gridPane.setPadding(new Insets(30, 40, 30, 40));

        gridPane.setVgap(15);
        gridPane.setHgap(20);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(button1, 1, 1);

        gridPane.add(text2, 0, 2);
        gridPane.add(comboBox, 1, 2);

        gridPane.add(button2, 1, 3);

        button1.setStyle("-fx-background-color: #1a6bbf; -fx-text-fill: white; -fx-font-size: 14pt; -fx-font-weight: bold; -fx-cursor: hand; -fx-background-radius: 6;");
        button2.setStyle("-fx-background-color: #1a6bbf; -fx-text-fill: white; -fx-font-size: 14pt; -fx-font-weight: bold; -fx-cursor: hand; -fx-background-radius: 6;");

        text1.setStyle("-fx-font: normal bold 18px 'Serif';");
        text2.setStyle("-fx-font: normal bold 18px 'Serif';");

        gridPane.setStyle("-fx-background-color: #f0f4f8; -fx-border-color: #1a6bbf; -fx-border-width: 2; -fx-border-radius: 8;");

        textField1.setPrefWidth(200);
        comboBox.setPrefWidth(200);
        button1.setPrefWidth(200);
        button2.setPrefWidth(200);

        GridPane.setColumnSpan(button1, 1);

        Scene scene = new Scene(gridPane);

        stage.setTitle("Movie Library System - Genres");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
