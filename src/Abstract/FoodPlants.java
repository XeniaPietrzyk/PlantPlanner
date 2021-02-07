package Abstract;

import Enumerators.Family;
import Enumerators.InsolationType;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;

public abstract class FoodPlants extends MotherOfPlants implements FindingFamily {
    private Family family;

    public Family getFamily() {return family;}
    private void setFamily(Family family) {
        this.family = family;
    }

    //konstruktory:
    public FoodPlants(String name, InsolationType insolation, SoilType soilType, SoilMoisture soilMoisture, int soilPH, Family family){
        super(name, insolation, soilType, soilMoisture, soilPH);
        setFamily(family);
    }

    //metody:
    public String findMatch(){
        return null;}
    //wyświetlenie pól klasy
    public String toString(){return getName()+ " " + getInsolationType() + " " + getSoilType() + " " + getSoilMoisture() + " " + getSoilPH() + " " + getFamily();}
}
