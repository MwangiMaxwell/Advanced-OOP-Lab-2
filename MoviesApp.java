import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MoviesApp extends Application {

    @Override
    public void start(Stage stage) {

        Text textGenres = new Text("Genres:");
        Text textName = new Text("Name:");
        Text textRegistered = new Text("Registered:");

        ComboBox<String> comboBoxGenre = new ComboBox<>();
        TextField textFieldName = new TextField();
        ComboBox<String> comboBoxRegistered = new ComboBox<>();

        Button buttonSave = new Button("Save Movie");
        Button buttonRemove = new Button("Remove Movie");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(600, 450);

        gridPane.setPadding(new Insets(30, 40, 30, 40));

        gridPane.setVgap(15);
        gridPane.setHgap(20);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(textGenres, 0, 0);
        gridPane.add(comboBoxGenre, 1, 0);

        gridPane.add(textName, 0, 1);
        gridPane.add(textFieldName, 1, 1);

        gridPane.add(buttonSave, 1, 2);

        gridPane.add(textRegistered, 0, 3);
        gridPane.add(comboBoxRegistered, 1, 3);

        gridPane.add(buttonRemove, 1, 4);

        String buttonStyle = "-fx-background-color: #1a6bbf; -fx-text-fill: white; -fx-font-size: 14pt; -fx-font-weight: bold; -fx-cursor: hand; -fx-background-radius: 6;";
        buttonSave.setStyle(buttonStyle);
        buttonRemove.setStyle(buttonStyle);

        String labelStyle = "-fx-font: normal bold 18px 'Serif';";
        textGenres.setStyle(labelStyle);
        textName.setStyle(labelStyle);
        textRegistered.setStyle(labelStyle);

        gridPane.setStyle("-fx-background-color: #f0f4f8; -fx-border-color: #1a6bbf; -fx-border-width: 2; -fx-border-radius: 8;");

        comboBoxGenre.setPrefWidth(200);
        textFieldName.setPrefWidth(200);
        comboBoxRegistered.setPrefWidth(200);
        buttonSave.setPrefWidth(200);
        buttonRemove.setPrefWidth(200);

        Scene scene = new Scene(gridPane);

        stage.setTitle("Movie Library System - Movies");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
