package Abstract;

import Enumerators.Family;
import Enumerators.InsolationType;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;

public abstract class FoodPlants extends MotherOfPlants {
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
    @Override
    public String printString(){return "nazwa: " + getName()+ ", nasłonecznienie: " + getInsolationType() + ", gleba: " + getSoilType() + ", wilgotność gleby: " + getSoilMoisture() + ", ph gleby: " + getSoilPH() + ", rodzina: " + getFamily();}
}
