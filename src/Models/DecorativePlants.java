package Models;

import Enumerators.DecorativeElement;
import Enumerators.InsolationType;
import Abstract.MotherOfPlants;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;

public class DecorativePlants extends MotherOfPlants {
    private DecorativeElement decorativeElement;

    public DecorativeElement getDecorativeElement() {return decorativeElement;}
    private void setDecorativeElement(DecorativeElement decorativeElement) {
        this.decorativeElement = decorativeElement;
    }

    //konstruktory:
    public DecorativePlants(String name, InsolationType insolation, SoilType soilType, SoilMoisture soilMoisture, int soilPH, DecorativeElement decorativeElement){
       super(name, insolation, soilType, soilMoisture, soilPH);
       setDecorativeElement(decorativeElement);
    }

    //metody:

    @Override
    public String findMatch() {
        return null;
    }

    public String toString(){return getName()+ " " + getInsolationType() + " " + getSoilType() + " " + getSoilMoisture() + " " + getSoilPH() + " " + getDecorativeElement();}
}
