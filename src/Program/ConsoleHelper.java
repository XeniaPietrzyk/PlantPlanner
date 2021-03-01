package Program;

import Abstract.MotherOfPlants;
import DB.DataBase;

import java.util.Scanner;

public class ConsoleHelper {
    public static void MultipleChoice() {
        DataBase database = new DataBase();
        String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            showMenu();
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    database.printAllPlants();
                    break;
                case "2":
                    MotherOfPlants plant = AddPlantSwitch.MultipleChoiceAddPlant();
                    if(plant != null) {
                        database.addToBase(plant);
                        System.out.println("Gratulacje. Twoja roślina została dodana do bazy danych.");
                    }
                    break;
                case "3":
                    System.out.println("Podaj id rośliny, którą chcesz usunąć:");
                    int id = Integer.parseInt(scan.nextLine());
                    database.deletePlant(id);
                    break;
                case "4":
                    System.out.println("Podaj typ roślin, które chcesz wyświetlić:");
                    String plantType = PrintPlantsOfType.GetPlantType();
                    if(plantType != null) {
                        database.printPlantsOfType(plantType);
                    }
                    break;
                case "5":
                    System.out.println("Podaj nazwę lub jej fragment, aby wyszukać roślinę:");
                    String sequence = scan.nextLine();
                    database.printPlantContaining(sequence);
                    break;
                case "6":
                    System.out.println("Podaj nazwę rośliny, aby wyświetlić jej rodzinę:");
                    String name = scan.nextLine();
                    System.out.println(database.printFamily(name));
                    break;
                case "7":
                    System.out.println("Podaj nazwę rośliny, aby wyświetlić jej cechę:");
                    name = scan.nextLine();
                    System.out.println(database.printCharacteristic(name));
                    break;
                case "8":
                    break;
            }
        } while (!choice.equals("8"));

    }

    private static void showMenu() {
        System.out.println("\nWitaj w Balcony Plant Planer");
        System.out.println("Wybierz jedną z opcji:");
        System.out.println("1: Przejrzyj bazę roślin.");
        System.out.println("2: Dodaj roślinę.");
        System.out.println("3: Usuń roślinę.");
        System.out.println("4: Wyświetl roślinę danego typu.");
        System.out.println("5: Wyszukaj roślinę po nazwie (lub jej fragmencie).");
        System.out.println("6: Znajdź rodzinę rośliny jadalnej.");
        System.out.println("7: Wyświetl cechę charakterystyczną rośliny jadalnej.");
        System.out.println("8: Wyjdź z programu.");
    }
}
