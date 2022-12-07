package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Country;
import model.MaParameter;
import model.Model;

import java.net.URL;
import java.util.ResourceBundle;

public class CountriesOverviewController{

    private Model model;
    private ViewHandler viewHandler;

    @FXML
    ListView<Country> overViewList;



    public void init(ViewHandler viewHandler, Model model) {
        this.viewHandler = viewHandler;
        this.model = model;
//
//        overViewList.getItems().add((Country) model.getCountries());
    }

    public void SwitchMain(ActionEvent event) {
        viewHandler.changeScene(ViewHandler.MAIN_SCENE);
    }


    public void updateTable(ActionEvent event) {
    }
}
