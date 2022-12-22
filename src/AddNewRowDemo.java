import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

          public class AddNewRowDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
         TableView<Country> tableView = new TableView<>();
         ObservableList<Country> data =
                 FXCollections.observableArrayList(
                 new Country("USA", "Washington DC", 280, true),
                 new Country("Canada", "Ottawa", 32, true),
                 new Country("United Kingdom", "London", 60, true),
                 new Country("Germany", "Berlin", 83, true),
                 new Country("France", "Paris", 60, true));
         tableView.setItems(data);

         TableColumn countryColumn = new TableColumn("Country");
         countryColumn.setMinWidth(100);
         countryColumn.setCellValueFactory(
                 new PropertyValueFactory<Country, String>("country"));

         TableColumn capitalColumn = new TableColumn("Capital");
         capitalColumn.setMinWidth(100);
         capitalColumn.setCellValueFactory(
                 new PropertyValueFactory<Country, String>("capital"));

         TableColumn populationColumn =
                 new TableColumn("Population (million)");
         populationColumn.setMinWidth(100);
         populationColumn.setCellValueFactory(
                 new PropertyValueFactory<Country, Double>("population"));

         TableColumn democraticColumn =
                 new TableColumn("Is Democratic?");
         democraticColumn.setMinWidth(100);
         democraticColumn.setCellValueFactory(
                 new PropertyValueFactory<Country, Boolean>("democratic"));

        tableView.getColumns().addAll(countryColumn, capitalColumn
