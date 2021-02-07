package Abstract;

import Enumerators.InsolationType;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;

public abstract class MotherOfPlants {
    private int Id;
    private static int nextId = 0;
    private String name;
    private InsolationType insolation;  //naświetlenie
    private SoilType soilType;          //struktura gleby: torf, glina, ił, piasek
    private SoilMoisture soilMoisture;  //wilgotność gleby
    private int soilPH;                 //ph gleby


    public int getId() {return Id;}
    private void setId(int id){this.Id = id;}

    public int getNextId() {return nextId;}
    private void setNextId(int nextId){this.Id = nextId;}

    public String getName() {return name;}
    private void setName(String name){this.name = name;}

    public InsolationType getInsolationType(){return this.insolation;}
    private void setInsolationType(InsolationType insolation) {this.insolation = insolation;}

    public SoilType getSoilType() {return this.soilType;}
    private void setSoilType(SoilType soilType){this.soilType=soilType;}

    public SoilMoisture getSoilMoisture(){return this.soilMoisture;}
    private void setSoilMoisture(SoilMoisture soilMoisture){this.soilMoisture = soilMoisture;}

    public int getSoilPH(){return this.soilPH;}
    private void setSoilPH(int soilPH){this.soilPH=soilPH;}

    //konstruktor:
    public MotherOfPlants(String name, InsolationType insolation, SoilType soilType, SoilMoisture soilMoisture, int soilPH){
        setName(name);
        setInsolationType(insolation);
        setSoilType(soilType);
        setSoilMoisture(soilMoisture);
        setSoilPH(soilPH);
        this.Id = nextId;
        MotherOfPlants.nextId++;
    }

    //metody:
    //znajdź roślinę, którą można posadzić razem
    public abstract String findMatch();
    //wyświetlenie pól klasy
    public String toString(){return getName()+ " " + getInsolationType() + " " + getSoilType() + " " + getSoilMoisture() + " " + getSoilPH();}
}
