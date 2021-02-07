package Models;

import Abstract.FoodPlants;
import Enumerators.InsolationType;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;
import Enumerators.Family;

public class EatLeafPlant extends FoodPlants {
    private int vitaminPerGram;

    public int getVitaminPerGram() { return vitaminPerGram;}
    private void setVitaminPerGram(int vitaminPerGram){this.vitaminPerGram=vitaminPerGram;}

    //konstruktor
    public EatLeafPlant(String name, InsolationType insolation, SoilType soilType, SoilMoisture soilMoisture, int soilPH, Family family, int vitaminPerGram) {
        super(name, insolation, soilType, soilMoisture, soilPH, family);
        setVitaminPerGram(vitaminPerGram);
    }

    //metody:
    public String toString(){return getName()+ " " + getInsolationType() + " " + getSoilType() + " " + getSoilMoisture() + " " + getSoilPH() + " " + getVitaminPerGram();}
}
