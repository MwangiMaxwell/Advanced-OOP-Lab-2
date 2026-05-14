import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class VideoLibraryApp extends Application {

    // Method to create the Genres layout panel
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

        button1.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        button2.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");

        text1.setStyle("-fx-font: normal bold 20px 'serif' ");
        text2.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: BEIGE;");

        textField1.setPrefWidth(220);
        comboBox.setPrefWidth(220);
        button1.setPrefWidth(220);
        button2.setPrefWidth(220);

        return gridPane;
    }

    // Method to create the Movies layout panel
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

        buttonSave.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        buttonRemove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");

        textGenres.setStyle("-fx-font: normal bold 20px 'serif' ");
        textName.setStyle("-fx-font: normal bold 20px 'serif' ");
        textRegistered.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: BEIGE;");

        comboBoxGenre.setPrefWidth(220);
        textFieldName.setPrefWidth(220);
        comboBoxRegistered.setPrefWidth(220);
        buttonSave.setPrefWidth(220);
        buttonRemove.setPrefWidth(220);

        return gridPane;
    }

    // Method to create the Customers layout panel
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

        buttonSave.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        buttonRemove.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");

        textName.setStyle("-fx-font: normal bold 20px 'serif' ");
        textPhone.setStyle("-fx-font: normal bold 20px 'serif' ");
        textEmail.setStyle("-fx-font: normal bold 20px 'serif' ");
        textRegistered.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: BEIGE;");

        textFieldName.setPrefWidth(220);
        textFieldPhone.setPrefWidth(220);
        textFieldEmail.setPrefWidth(220);
        comboBoxRegistered.setPrefWidth(220);
        buttonSave.setPrefWidth(220);
        buttonRemove.setPrefWidth(220);

        return gridPane;
    }

    // Method to create the Rentals layout panel
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

        buttonSaveRental.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");
        buttonReturnMovie.setStyle("-fx-background-color: darkslateblue; -fx-text-fill: white; -fx-font-size:13pt;");

        textCustomer.setStyle("-fx-font: normal bold 20px 'serif' ");
        textGenre.setStyle("-fx-font: normal bold 20px 'serif' ");
        textMovies.setStyle("-fx-font: normal bold 20px 'serif' ");
        textBorrowed.setStyle("-fx-font: normal bold 20px 'serif' ");
        textReturned.setStyle("-fx-font: normal bold 20px 'serif' ");
        gridPane.setStyle("-fx-background-color: BEIGE;");

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

        // create a TabPane to hold multiple screens in one window
        TabPane tabPane = new TabPane();

        // create a Tab for Genres and assign the layout we built above
        Tab tabGenres = new Tab("Genres", buildGenresPane());
        tabGenres.setClosable(false); // prevent the user from closing the tab

        // create a Tab for Movies
        Tab tabMovies = new Tab("Movies", buildMoviesPane());
        tabMovies.setClosable(false);

        // create a Tab for Customers
        Tab tabCustomers = new Tab("Customers", buildCustomersPane());
        tabCustomers.setClosable(false);

        // create a Tab for Rentals
        Tab tabRentals = new Tab("Rentals", buildRentalsPane());
        tabRentals.setClosable(false);

        // add all tabs to the TabPane
        tabPane.getTabs().addAll(tabGenres, tabMovies, tabCustomers, tabRentals);

        // set the font for the tabs
        tabPane.setStyle("-fx-font-size: 13pt; -fx-font-family: 'Serif';");

        // create the main scene with the TabPane as the root
        Scene scene = new Scene(tabPane);

        // setup the main window
        stage.setTitle("Movie Library System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
