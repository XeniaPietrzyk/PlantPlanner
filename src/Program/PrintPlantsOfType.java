package Program;

import Abstract.MotherOfPlants;
import Enumerators.*;
import Models.*;

import java.util.Scanner;

public class PrintPlantsOfType {
    public static String GetPlantType() {
        System.out.println("Jakiego typu roślinę chcesz zobaczyć?");
        System.out.println("1: Dekoracyjna.");
        System.out.println("2: Zadaniowa (ochrona przed szkodnikami, oczyszczanie powietrza.");
        System.out.println("3: Jadalna - bulwa.");
        System.out.println("4: Jadalna - owoc.");
        System.out.println("5: Jadalna - liść.");
        System.out.println("6: Wróć.");

        Scanner scann = new Scanner(System.in);
        String className = null;
        while (className == null) {
            Integer action = scann.nextInt();
            if (action == 1) {
                className = DecorativePlants.class.getSimpleName();
            } else if (action == 2) {
                className = TaskPlants.class.getSimpleName();
            } else if (action == 3) {
                className = EatBulbPlant.class.getSimpleName();
            } else if (action == 4) {
                className = EatFruitPlant.class.getSimpleName();
            } else if (action == 5) {
                className = EatLeafPlant.class.getSimpleName();
            } else if (action == 0) {
                return null;
            } else {
                System.out.println("Spróbuj ponownie.");
            }
        }
        return className;
    }
}
