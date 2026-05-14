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

        // step 1: create labels to describe each field
        Text textCustomer = new Text("Customer:");
        Text textGenre = new Text("Genre:");
        Text textMovies = new Text("Movies:");
        Text textBorrowed = new Text("Borrowed:");
        Text textReturned = new Text("Returned:");

        // step 2: create combo boxes (dropdown lists) for selecting options
        ComboBox<String> comboBoxCustomer = new ComboBox<>();
        ComboBox<String> comboBoxGenre = new ComboBox<>();
        ComboBox<String> comboBoxMovies = new ComboBox<>();
        ComboBox<String> comboBoxBorrowed = new ComboBox<>();
        ComboBox<String> comboBoxReturned = new ComboBox<>();

        // step 3: create buttons to trigger actions like saving or returning a movie
        Button buttonSaveRental = new Button("Save Rental");
        Button buttonReturnMovie = new Button("Return Movie");

        // step 4: create a GridPane to arrange elements neatly in rows and columns
        GridPane gridPane = new GridPane();

        // step 5: set the overall size of the layout
        gridPane.setMinSize(600, 600);

        // step 6: add spacing around the grid's edges
        gridPane.setPadding(new Insets(30, 40, 30, 40));

        // step 7: add spacing between rows (Vgap) and columns (Hgap)
        gridPane.setVgap(15);
        gridPane.setHgap(20);

        // step 8: center the layout within the window
        gridPane.setAlignment(Pos.CENTER);

        // step 9: place each label and dropdown/button in a specific column and row
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

        // step 10: apply colors and fonts to buttons and labels
        buttonSaveRental.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        buttonReturnMovie.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");

        textCustomer.setStyle("-fx-font: normal bold 20px 'serif' ");
        textGenre.setStyle("-fx-font: normal bold 20px 'serif' ");
        textMovies.setStyle("-fx-font: normal bold 20px 'serif' ");
        textBorrowed.setStyle("-fx-font: normal bold 20px 'serif' ");
        textReturned.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: BEIGE;");

        // step 11: make all interactive elements the same width for a clean look
        comboBoxCustomer.setPrefWidth(200);
        comboBoxGenre.setPrefWidth(200);
        comboBoxMovies.setPrefWidth(200);
        comboBoxBorrowed.setPrefWidth(200);
        comboBoxReturned.setPrefWidth(200);
        buttonSaveRental.setPrefWidth(200);
        buttonReturnMovie.setPrefWidth(200);

        // step 12: create the main scene containing the layout
        Scene scene = new Scene(gridPane);

        // step 13: configure the application window (stage) and make it visible
        stage.setTitle("Movie Library System - Rentals");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
