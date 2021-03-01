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
    public String printString(){return "nazwa: " + getName()+ ", nasłonecznienie: " + getInsolationType() + ", gleba: " + getSoilType() + ", wilgotność gleby: " + getSoilMoisture() + ", ph gleby: " + getSoilPH() + ", element dekoracyjny: " + getDecorativeElement() + "\n";}

}
