package DB;

import Abstract.MotherOfPlants;
import Program.ConsoleHelper;

import java.util.ArrayList;
import java.util.List;


public class DateBase <T extends MotherOfPlants>{
    private List<T> myPlants = new ArrayList<>();

    public List<T> getMyPlants() { return myPlants;}
    public void setMyPlants(T myPlants) {
        this.myPlants.add(myPlants);
    }

    //metody:
    //wprowadzenie rośliny do bazy danych
    public void addToBase(T myPlant) {
        setMyPlants(myPlant);}

    //usuwanie rośliny o podanym identyfikatorze
    public void deletePlant(int id) {
        for (T myPlant:myPlants) {
            if (myPlant.getId() == id) {
                myPlants.remove(myPlant);
            } else { System.out.print("Nie odnaleziono rośliny o podanym identyfikatorze!\n");}
        }
    }
    //wyświetlanie wszystkich obiektów zapamiętanych ze wszystkimi ich polami
    public void printAllPlants(){
        for (T myPlant:myPlants) {
            System.out.print(myPlant.toString()+"\n");
        }
    }
    //Wyświetlanie obiektów danego podtypu
    public void printPlantsOfType(String className){
        //instance - takie coś zastosować należy
        for (T myPlant:myPlants) {
            if(myPlant.getClass().getSimpleName() == className) {
                System.out.print(myPlant.toString()+"\n");
            }
        }
    }
    //Wyświetlanie obiektów, których nazwa zawiera podany ciąg znaków
    public void printPlantContaining(String sequence){
        for (T myPlant:myPlants) {
            if (myPlant.getName().contains(sequence)) {
                System.out.print(myPlant.toString()+"\n");
            } else { System.out.print("Nie odnaleziono rośliny zawierającej podany ciąg znaków!"); }
        }
    }
}
