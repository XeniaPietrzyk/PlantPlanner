package Program;

import DB.DataBase;
import Enumerators.Family;
import Enumerators.InsolationType;
import Enumerators.SoilMoisture;
import Enumerators.SoilType;
import Models.EatBulbPlant;
import Models.EatFruitPlant;
import Models.TaskPlants;

public class PlantProgram {

    public static void main(String[] args){

        ConsoleHelper.MultipleChoice();

//DANE TESTOWE:
//        TaskPlants skrzydlokwiat = new TaskPlants("skrzydłokwiat", InsolationType.halflight, SoilType.universal, SoilMoisture.moist, 5, "brak", "aceton");
//        skrzydlokwiat.addPurification("trójchloroetylen");
//        TaskPlants dracena = new TaskPlants("dracena", InsolationType.sunny, SoilType.clay, SoilMoisture.moist, 4, "brak", "toluen");
//        dracena.addPurification("benzen");
//        EatFruitPlant porzeczka = new EatFruitPlant("czarna porzeczka", InsolationType.sunny, SoilType.other, SoilMoisture.moist, 6, Family.others, 130);
//        EatBulbPlant cebula = new EatBulbPlant("cebula", InsolationType.sunny, SoilType.universal, SoilMoisture.moist, 5, Family.onion, 15);
//        EatBulbPlant czosnek = new EatBulbPlant("czosnek pospolity", InsolationType.sunny, SoilType.universal, SoilMoisture.moist, 5, Family.onion, 10 );
//        EatBulbPlant por = new EatBulbPlant("por pospolity", InsolationType.sunny, SoilType.clay, SoilMoisture.wet, 7, Family.onion, 5 );
//
//
//        DataBase dataBase = new DataBase();
//        dataBase.addToBase(skrzydlokwiat);
//        dataBase.addToBase(dracena);
//        dataBase.addToBase(porzeczka);
//        dataBase.addToBase(cebula);
//        dataBase.addToBase(czosnek);
//        dataBase.addToBase(por);
//
//        dataBase.printAllPlants();
//        dataBase.printPlantsOfType(EatBulbPlant.class.getSimpleName());
    }
}
