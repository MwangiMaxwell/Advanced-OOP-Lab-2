import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class RentalsApp extends Application {

    @Override
    public void start(Stage stage) {

        Text textCustomer = new Text("Customer:");
        Text textGenre = new Text("Genre:");
        Text textMovies = new Text("Movies:");
        Text textBorrowed = new Text("Borrowed:");
        Text textReturned = new Text("Returned:");

        ComboBox<String> comboBoxCustomer = new ComboBox<>();
        ComboBox<String> comboBoxGenre = new ComboBox<>();
        ComboBox<String> comboBoxMovies = new ComboBox<>();
        ComboBox<String> comboBoxBorrowed = new ComboBox<>();
        ComboBox<String> comboBoxReturned = new ComboBox<>();

        Button buttonSaveRental = new Button("Save Rental");
        Button buttonReturnMovie = new Button("Return Movie");

        GridPane gridPane = new GridPane();

        gridPane.setMinSize(600, 600);

        gridPane.setPadding(new Insets(30, 40, 30, 40));

        gridPane.setVgap(15);
        gridPane.setHgap(20);

        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(textCustomer, 0, 0);
        gridPane.add(comboBoxCustomer, 1, 0);

        gridPane.add(textGenre, 0, 1);
        gridPane.add(comboBoxGenre, 1, 1);

        gridPane.add(textMovies, 0, 2);
        gridPane.add(comboBoxMovies, 1, 2);

        gridPane.add(buttonSaveRental, 1, 3);

        gridPane.add(textBorrowed, 0, 4);
        gridPane.add(comboBoxBorrowed, 1, 4);

        gridPane.add(buttonReturnMovie, 1, 5);

        gridPane.add(textReturned, 0, 6);
        gridPane.add(comboBoxReturned, 1, 6);

        String buttonStyle = "-fx-background-color: #1a6bbf; -fx-text-fill: white; -fx-font-size: 14pt; -fx-font-weight: bold; -fx-cursor: hand; -fx-background-radius: 6;";
        buttonSaveRental.setStyle(buttonStyle);
        buttonReturnMovie.setStyle(buttonStyle);

        String labelStyle = "-fx-font: normal bold 18px 'Serif';";
        textCustomer.setStyle(labelStyle);
        textGenre.setStyle(labelStyle);
        textMovies.setStyle(labelStyle);
        textBorrowed.setStyle(labelStyle);
        textReturned.setStyle(labelStyle);

        gridPane.setStyle("-fx-background-color: #f0f4f8; -fx-border-color: #1a6bbf; -fx-border-width: 2; -fx-border-radius: 8;");

        comboBoxCustomer.setPrefWidth(200);
        comboBoxGenre.setPrefWidth(200);
        comboBoxMovies.setPrefWidth(200);
        comboBoxBorrowed.setPrefWidth(200);
        comboBoxReturned.setPrefWidth(200);
        buttonSaveRental.setPrefWidth(200);
        buttonReturnMovie.setPrefWidth(200);

        Scene scene = new Scene(gridPane);

        stage.setTitle("Movie Library System - Rentals");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
