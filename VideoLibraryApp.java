import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VideoLibraryApp extends Application {

    private GridPane buildGenresPane() {
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

        String buttonStyle = "-fx-background-color: #1a6bbf; -fx-text-fill: white; -fx-font-size: 13pt; -fx-font-weight: bold; -fx-cursor: hand; -fx-background-radius: 6;";
        button1.setStyle(buttonStyle);
        button2.setStyle(buttonStyle);

        String labelStyle = "-fx-font: normal bold 18px 'Serif';";
        text1.setStyle(labelStyle);
        text2.setStyle(labelStyle);

        gridPane.setStyle("-fx-background-color: #f0f4f8; -fx-border-color: #1a6bbf; -fx-border-width: 2; -fx-border-radius: 8;");

        textField1.setPrefWidth(220);
        comboBox.setPrefWidth(220);
        button1.setPrefWidth(220);
        button2.setPrefWidth(220);

        return gridPane;
    }

    private GridPane buildMoviesPane() {
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

        String buttonStyle = "-fx-background-color: #1a6bbf; -fx-text-fill: white; -fx-font-size: 13pt; -fx-font-weight: bold; -fx-cursor: hand; -fx-background-radius: 6;";
        buttonSave.setStyle(buttonStyle);
        buttonRemove.setStyle(buttonStyle);

        String labelStyle = "-fx-font: normal bold 18px 'Serif';";
        textGenres.setStyle(labelStyle);
        textName.setStyle(labelStyle);
        textRegistered.setStyle(labelStyle);

        gridPane.setStyle("-fx-background-color: #f0f4f8; -fx-border-color: #1a6bbf; -fx-border-width: 2; -fx-border-radius: 8;");

        comboBoxGenre.setPrefWidth(220);
        textFieldName.setPrefWidth(220);
        comboBoxRegistered.setPrefWidth(220);
        buttonSave.setPrefWidth(220);
        buttonRemove.setPrefWidth(220);

        return gridPane;
    }

    private GridPane buildCustomersPane() {
        Text textName = new Text("Name:");
        Text textPhone = new Text("Phone:");
        Text textEmail = new Text("Email:");
        Text textRegistered = new Text("Registered:");

        TextField textFieldName = new TextField();
        TextField textFieldPhone = new TextField();
        TextField textFieldEmail = new TextField();
        ComboBox<String> comboBoxRegistered = new ComboBox<>();
        Button buttonSave = new Button("Save Customer");
        Button buttonRemove = new Button("Remove Customer");

        GridPane gridPane = new GridPane();
        gridPane.setMinSize(600, 500);
        gridPane.setPadding(new Insets(30, 40, 30, 40));
        gridPane.setVgap(15);
        gridPane.setHgap(20);
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(textName, 0, 0);
        gridPane.add(textFieldName, 1, 0);
        gridPane.add(textPhone, 0, 1);
        gridPane.add(textFieldPhone, 1, 1);
        gridPane.add(textEmail, 0, 2);
        gridPane.add(textFieldEmail, 1, 2);
        gridPane.add(buttonSave, 1, 3);
        gridPane.add(textRegistered, 0, 4);
        gridPane.add(comboBoxRegistered, 1, 4);
        gridPane.add(buttonRemove, 1, 5);

        String buttonStyle = "-fx-background-color: #1a6bbf; -fx-text-fill: white; -fx-font-size: 13pt; -fx-font-weight: bold; -fx-cursor: hand; -fx-background-radius: 6;";
        buttonSave.setStyle(buttonStyle);
        buttonRemove.setStyle(buttonStyle);

        String labelStyle = "-fx-font: normal bold 18px 'Serif';";
        textName.setStyle(labelStyle);
        textPhone.setStyle(labelStyle);
        textEmail.setStyle(labelStyle);
        textRegistered.setStyle(labelStyle);

        gridPane.setStyle("-fx-background-color: #f0f4f8; -fx-border-color: #1a6bbf; -fx-border-width: 2; -fx-border-radius: 8;");

        textFieldName.setPrefWidth(220);
        textFieldPhone.setPrefWidth(220);
        textFieldEmail.setPrefWidth(220);
        comboBoxRegistered.setPrefWidth(220);
        buttonSave.setPrefWidth(220);
        buttonRemove.setPrefWidth(220);

        return gridPane;
    }

    private GridPane buildRentalsPane() {
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

        String buttonStyle = "-fx-background-color: #1a6bbf; -fx-text-fill: white; -fx-font-size: 13pt; -fx-font-weight: bold; -fx-cursor: hand; -fx-background-radius: 6;";
        buttonSaveRental.setStyle(buttonStyle);
        buttonReturnMovie.setStyle(buttonStyle);

        String labelStyle = "-fx-font: normal bold 18px 'Serif';";
        textCustomer.setStyle(labelStyle);
        textGenre.setStyle(labelStyle);
        textMovies.setStyle(labelStyle);
        textBorrowed.setStyle(labelStyle);
        textReturned.setStyle(labelStyle);

        gridPane.setStyle("-fx-background-color: #f0f4f8; -fx-border-color: #1a6bbf; -fx-border-width: 2; -fx-border-radius: 8;");

        comboBoxCustomer.setPrefWidth(220);
        comboBoxGenre.setPrefWidth(220);
        comboBoxMovies.setPrefWidth(220);
        comboBoxBorrowed.setPrefWidth(220);
        comboBoxReturned.setPrefWidth(220);
        buttonSaveRental.setPrefWidth(220);
        buttonReturnMovie.setPrefWidth(220);

        return gridPane;
    }

    @Override
    public void start(Stage stage) {

        TabPane tabPane = new TabPane();

        Tab tabGenres = new Tab("Genres", buildGenresPane());
        tabGenres.setClosable(false);

        Tab tabMovies = new Tab("Movies", buildMoviesPane());
        tabMovies.setClosable(false);

        Tab tabCustomers = new Tab("Customers", buildCustomersPane());
        tabCustomers.setClosable(false);

        Tab tabRentals = new Tab("Rentals", buildRentalsPane());
        tabRentals.setClosable(false);

        tabPane.getTabs().addAll(tabGenres, tabMovies, tabCustomers, tabRentals);

        tabPane.setStyle("-fx-font-size: 13pt; -fx-font-family: 'Serif';");

        Scene scene = new Scene(tabPane);

        stage.setTitle("Movie Library System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
