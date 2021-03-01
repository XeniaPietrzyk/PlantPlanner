package Models;

import Abstract.FoodPlants;
import Abstract.ICharacteristic;
import Enumerators.InsolationType;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;
import Enumerators.Family;

public class EatLeafPlant extends FoodPlants implements ICharacteristic {
    private int vitaminPerGram;

    public int getVitaminPerGram() { return vitaminPerGram;}
    private void setVitaminPerGram(int vitaminPerGram){this.vitaminPerGram=vitaminPerGram;}

    //konstruktor
    public EatLeafPlant(String name, InsolationType insolation, SoilType soilType, SoilMoisture soilMoisture, int soilPH, Family family, int vitaminPerGram) {
        super(name, insolation, soilType, soilMoisture, soilPH, family);
        setVitaminPerGram(vitaminPerGram);
    }

    //metody:
    @Override
    public String printString(){
        return super.printString() + ", zawartość witamin: " + getVitaminPerGram() + "\n";
    }

    @Override
    public void printCharacteristic(){
    getVitaminPerGram();}

}