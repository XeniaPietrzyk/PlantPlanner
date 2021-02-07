package Models;

import Enumerators.InsolationType;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;
import Abstract.MotherOfPlants;

import java.util.ArrayList;
import java.util.List;

public class TaskPlants extends MotherOfPlants {
    private List<String> antiInsects = new ArrayList<>(); //lista insektów
    private List<String> airPurification = new ArrayList<String>(); //lista związków

    public List<String> getAntiInsects(){return antiInsects;}
    private void setAntiInsects(List<String> antiInsects) {
        this.antiInsects = antiInsects;
    }

    public List<String> getAirPurification() {return airPurification;}
    private void setAirPurification(List<String> airPurification) {
        this.airPurification = airPurification;
    }

    //konstruktory:
    public TaskPlants(String name, InsolationType insolation, SoilType soilType, SoilMoisture soilMoisture, int soilPH, String insect, String airPurification){
        super(name, insolation, soilType, soilMoisture, soilPH);
        this.antiInsects.add(insect);               //można dodać jednego insekta, a potem dodać więcej funkcją addInsect
        this.airPurification.add(airPurification);  //można dodać jeden związek a potem dodać więcej funkcją addPurification
    }

    //metody:
    //dodanie nowego szkodnika zwalczanego/odstraszanego przez roślinę
    public void addInsect(String Insect){
        this.antiInsects.add(Insect);
    }
    //dodawanie nowego związku chemicznego neutralizowanego przez roślinę
    public void addPurification(String airPurification){
        this.airPurification.add(airPurification);
    }

    @Override
    public String findMatch() {
        return null;
    }

    //wyświetlenie pól klasy
    public String toString(){return getName()+ " " + getInsolationType() + " " + getSoilType() + " " + getSoilMoisture() + " " + getSoilPH() + " " + getAntiInsects() + " " + getAirPurification();}
}
