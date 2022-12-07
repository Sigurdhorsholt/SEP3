package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Model  {
    //private ArrayList<Country> countries;
private ObservableList<Country> countries;


    public ObservableList<Country> getCountries() {
        return countries;
    }


    public Model() {
        System.out.println("Model is live");
//        this.countries = FXCollections.observableArrayList();
      //  this.countries = new ArrayList<>();
        this.countries = FXCollections.observableArrayList();

        countries.add(new Country());
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void printModel() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Model: " +
                "Countries: " + countries +
                ",      ";
    }


    public void save(){
        ArrayList<Model> woi = new ArrayList<>();

        try {
            FileOutputStream fos = new FileOutputStream("Saved_Model.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            woi.add(this);

            oos.writeObject(this);

            oos.close();
            fos.close();


        }catch (IOException ioe){
            ioe.printStackTrace();

        }

    }

    public void load(){

    }



}
