package Models;

import Abstract.FoodPlants;
import Abstract.ICharacteristic;
import Enumerators.InsolationType;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;
import Enumerators.Family;

public class EatFruitPlant extends FoodPlants implements ICharacteristic {
    private int flavanoidsContaining;

    public int getFlavanoidsContaining() { return flavanoidsContaining;}
    private void setFlavanoidsContaining(int flavanoidsContaining){this.flavanoidsContaining=flavanoidsContaining;}
    //konstruktor:
    public EatFruitPlant(String name, InsolationType insolation, SoilType soilType, SoilMoisture soilMoisture, int soilPH, Family family, int flavanoidsContaining) {
        super(name, insolation, soilType, soilMoisture, soilPH, family);
        setFlavanoidsContaining(flavanoidsContaining);}

    //metody:

    @Override
    public void printCharacteristic() {
        getFlavanoidsContaining();
    }

    @Override
    public String printString(){
        return super.printString() + ", zawartość flawonoidów: " + getFlavanoidsContaining() + "\n";
    }
}

