package Program;

import Abstract.MotherOfPlants;
import DB.DateBase;

import java.util.Scanner;

public class ConsoleHelper {
    public static void MultipleChoice() {
        DateBase datebase = new DateBase();
        String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            showMenu();
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    datebase.printAllPlants();
                    break;
                case "2":
                    MotherOfPlants plant = AddPlantSwitch.MultipleChoiceAddPlant();
                    if(plant != null) {
                        datebase.addToBase(plant);
                        System.out.println("Gratulacje. Twoja roślina została dodana do bazy danych.");
                    }
                    break;
                case "3":
                    System.out.println("Podaj id rośliny, którą chcesz usunąć:");
                    int id = Integer.parseInt(scan.nextLine());
                    datebase.deletePlant(id);
                    break;
                case "4":
                    System.out.println("Podaj typ roślin, które chcesz wyświetlić:");
                    String plantType = PrintPlantsOfType.GetPlantType();
                    if(plantType != null) {
                        datebase.printPlantsOfType(plantType);
                    }
                    break;
                case "5":
                    System.out.println("Podaj nazwę lub jej fragment, aby wyszukać roślinę:");
                    String sequence = scan.nextLine();
                    datebase.printPlantContaining(sequence);
                    break;
                case "6":
                    System.out.println("Podaj nazwę rośliny, aby wyświetlić jej rodzinę:");
                    String name = scan.nextLine();
                    // ...............
                    break;
            }
        } while (!choice.equals("7"));

    }

    private static void showMenu() {
        System.out.println("Witaj w ......");
        System.out.println("Wybierz jedną z opcji: \n");
        System.out.println("1: Przejrzyj bazę roślin.");
        System.out.println("2: Dodaj roślinę.");
        System.out.println("3: Usuń roślinę.");
        System.out.println("4: Wyświetl roślinę danego typu.");
        System.out.println("5: Wyszukaj roślinę po nazwie (lub jej fragmencie).");
        System.out.println("6: Znajdź rodzinę rośliny jadalnej.");
        System.out.println("7: Wyjdź z programu.");
    }
}
