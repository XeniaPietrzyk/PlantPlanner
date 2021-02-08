package DB;

import Abstract.FoodPlants;
import Abstract.MotherOfPlants;
import Enumerators.Family;
import Program.ConsoleHelper;

import java.util.ArrayList;
import java.util.List;


public class DataBase<T extends MotherOfPlants> {
    private List<T> myPlants = new ArrayList<>();

    public List<T> getMyPlants() {
        return myPlants;
    }

    public void setMyPlants(T myPlants) {
        this.myPlants.add(myPlants);
    }

    //metody:
    //wprowadzenie rośliny do bazy danych
    public void addToBase(T myPlant) {
        setMyPlants(myPlant);
    }

    //usuwanie rośliny o podanym identyfikatorze
    public void deletePlant(int id) {
        myPlants.removeIf(product1 -> product1.getId() == id);
    }

    //wyświetlanie wszystkich obiektów zapamiętanych ze wszystkimi ich polami
    public void printAllPlants() {
        for (T myPlant : myPlants) {
            System.out.print(myPlant.printString());
        }
    }

    //Wyświetlanie obiektów danego podtypu
    public void printPlantsOfType(String className) {
        for (T myPlant : myPlants) {
            try {
                if (myPlant.getClass().getSimpleName() == className) {
                    System.out.print(myPlant.printString());
                }
            } catch (Exception e) {
                System.out.print("Nie odnaleziono takiego typu!\n");
            }
        }
    }

    //Wyświetlanie obiektów, których nazwa zawiera podany ciąg znaków
    public void printPlantContaining(String sequence) {
        for (T myPlant : myPlants) {
            try {
                if (myPlant.getName().contains(sequence)) {
                    System.out.print(myPlant.printString());
                }
            } catch (Exception e) {
                System.out.print("Nie odnaleziono rośliny o podanej nazwie!\n");
            }
        }
    }

    //Wyświetlanie rodziny obiektu
    public String printFamily(String plantName) {
        String[] foodPlants = new String[7];
        for (T myPlant : myPlants) {
            try {
                if (myPlant.getName().contains(plantName)) {
                    foodPlants = myPlant.printString().split(",");
                }
            } catch (Exception e) {
                System.out.print("Nie odnaleziono rośliny o podanej nazwie!\n");
            }

        }
        return foodPlants[5];
    }

    //Wyświetlanie cechy obiektu
    public String printCharacteristic(String plantName) {
        String[] foodPlants = new String[7];
        for (T myPlant : myPlants) {
            try {
                if (myPlant.getName().contains(plantName)) {
                    foodPlants = myPlant.printString().split(",");
                }
            } catch (Exception e) {
                System.out.print("Nie odnaleziono rośliny o podanej nazwie!\n");
            }

        }
        return foodPlants[6];
    }
}
