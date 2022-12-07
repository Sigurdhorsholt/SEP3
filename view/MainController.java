package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import model.Country;
import model.Model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class MainController  {

    private ViewHandler viewHandler;
    private Model model;

    @FXML
    private ListView<Country> countriesList;



    public void init(ViewHandler viewHandler, Model model) {
        this.viewHandler = viewHandler;
        this.model = model;
        countriesList.setItems(model.getCountries());
    }


    public void SwitchAddCountry(ActionEvent event) {
        viewHandler.changeScene(ViewHandler.ADD_COUNTRY_SCENE);
    }
    public void SwitchMacsGraphics(ActionEvent event) {
        viewHandler.changeScene(ViewHandler.MACS_GRAPHICS_SCENE);
    }
    public void SwitchCountryOverview(ActionEvent event) {
        viewHandler.changeScene(ViewHandler.COUNTRIES_OVERVIEW_SCENE);
    }

    public void printModel(ActionEvent event) {
        model.printModel();
    }

    public void saveModel(ActionEvent event) {

        model.save();

    }

    public void loadModel(ActionEvent event) {
        model.load();
    }
}
