package Models;

import Abstract.FoodPlants;
import Abstract.ICharacteristic;
import Enumerators.InsolationType;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;
import Enumerators.Family;

public class EatBulbPlant extends FoodPlants implements ICharacteristic {
    private int bulbDepth;

    public int getBulbDepth() {return bulbDepth;}
    private void setBulbDeepth(int bulbDepth){this.bulbDepth=bulbDepth;}

    public EatBulbPlant(String name, InsolationType insolation, SoilType soilType, SoilMoisture soilMoisture, int soilPH, Family family, int bulbDepth) {
        super(name, insolation, soilType, soilMoisture, soilPH, family);
        setBulbDeepth(bulbDepth);
    }

    //metody:
    @Override
    public String printString(){
        return super.printString() + ", głębokość położenia bulwy: " + getBulbDepth() + "\n";
    }

    @Override
    public void printCharacteristic() {
        getBulbDepth();
    }
}
