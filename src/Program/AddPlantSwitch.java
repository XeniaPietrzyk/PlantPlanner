package Program;

import Enumerators.*;
import Models.*;

import java.util.Scanner;

public class AddPlantSwitch {

    public static void MultipleChoiceAddPlant() {
        System.out.println("Jakiego typu roślinę chcesz dodać? Masz do wyboru:");
        System.out.println("1: Dekoracyjna.");
        System.out.println("2: Zadaniowa (ochrona przed szkodnikami, oczyszczanie powietrza.");
        System.out.println("3: Jadalna - bulwa.");
        System.out.println("4: Jadalna - owoc.");
        System.out.println("5: Jadalna - liść.");
        System.out.println("6: Wróć.");

        String name;
        InsolationType insolation;
        SoilType soilType;
        SoilMoisture soilMoisture;
        int soilPH;
        Family family;


        SwitchPropertiesType switchPropertiesType = new SwitchPropertiesType();

        String choice = null;
        Scanner scan = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    System.out.println("Podaj nazwę rośliny:");
                    name = scanner.nextLine();
                    System.out.println("Podaj nasłonecznienie, które lubi roślina:");
                    insolation = switchPropertiesType.insolationSwitch();
                    System.out.println("Podaj typ gleby, którą lubi roślina:");
                    soilType = switchPropertiesType.soilTypeSwitch();
                    System.out.println("Podaj wilgotność gleby, który lubi roślina:");
                    soilMoisture = switchPropertiesType.soilMoistureSwitch();
                    System.out.println("Podaj pH gleby, które lubi roślina:");
                    soilPH = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj element dekoracyjny rośliny.");
                    DecorativeElement decorativeElement = switchPropertiesType.decorativeElementSwitch();
                    DecorativePlants decorativePlant = new DecorativePlants(name, insolation, soilType, soilMoisture, soilPH, decorativeElement){};
                    //dateBase.addToBase(decorativePlant);
                    System.out.println("Gratulacje. Twoja roślina została dodana do bazy danych.");
                    ConsoleHelper.MultipleChoice();
                    break;
                case "2":
                    System.out.println("Podaj nazwę rośliny:");
                    name = scanner.nextLine();
                    System.out.println("Podaj nasłonecznienie, które lubi roślina:");
                    insolation = switchPropertiesType.insolationSwitch();
                    System.out.println("Podaj typ gleby, którą lubi roślina:");
                    soilType = switchPropertiesType.soilTypeSwitch();
                    System.out.println("Podaj wilgotność gleby, który lubi roślina:");
                    soilMoisture = switchPropertiesType.soilMoistureSwitch();
                    System.out.println("Podaj pH gleby, które lubi roślina:");
                    soilPH = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj insekty, które odstrasza roślina:");
                    String insect = scanner.nextLine();
                    System.out.println("Podaj związki, które neutralizuje roślina:");
                    String airPurification = scanner.nextLine();
                    TaskPlants taskPlant = new TaskPlants(name, insolation, soilType, soilMoisture, soilPH, insect, airPurification);
                    System.out.println("Gratulacje. Twoja roślina została dodana do bazy danych.");
                    ConsoleHelper.MultipleChoice();
                    break;
                case "3":
                    System.out.println("Podaj nazwę rośliny:");
                    name = scanner.nextLine();
                    System.out.println("Podaj nasłonecznienie, które lubi roślina:");
                    insolation = switchPropertiesType.insolationSwitch();
                    System.out.println("Podaj typ gleby, którą lubi roślina:");
                    soilType = switchPropertiesType.soilTypeSwitch();
                    System.out.println("Podaj wilgotność gleby, który lubi roślina:");
                    soilMoisture = switchPropertiesType.soilMoistureSwitch();
                    System.out.println("Podaj pH gleby, które lubi roślina:");
                    soilPH = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj wielkość korzenia jadalnego:");
                    int bulbDepth = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj kategorię (rodzinę) rośliny:");
                    family = switchPropertiesType.familySwitch();
                    EatBulbPlant bulbPlant = new EatBulbPlant(name, insolation, soilType, soilMoisture, soilPH, family, bulbDepth);
                    System.out.println("Gratulacje. Twoja roślina została dodana do bazy danych.");
                    ConsoleHelper.MultipleChoice();
                    break;
                case "4":
                    System.out.println("Podaj nazwę rośliny:");
                    name = scanner.nextLine();
                    System.out.println("Podaj nasłonecznienie, które lubi roślina:");
                    insolation = switchPropertiesType.insolationSwitch();
                    System.out.println("Podaj typ gleby, którą lubi roślina:");
                    soilType = switchPropertiesType.soilTypeSwitch();
                    System.out.println("Podaj wilgotność gleby, który lubi roślina:");
                    soilMoisture = switchPropertiesType.soilMoistureSwitch();
                    System.out.println("Podaj pH gleby, które lubi roślina:");
                    soilPH = Integer.parseInt(scanner.nextLine());
                    int flavanoidsContaining = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj kategorię (rodzinę) rośliny:");
                    family = switchPropertiesType.familySwitch();
                    EatFruitPlant fruitPlant = new EatFruitPlant(name, insolation, soilType, soilMoisture, soilPH, family, flavanoidsContaining);
                    System.out.println("Gratulacje. Twoja roślina została dodana do bazy danych.");
                    ConsoleHelper.MultipleChoice();
                    break;
                case "5":
                    System.out.println("Podaj nazwę rośliny:");
                    name = scanner.nextLine();
                    System.out.println("Podaj nasłonecznienie, które lubi roślina:");
                    insolation = switchPropertiesType.insolationSwitch();
                    System.out.println("Podaj typ gleby, którą lubi roślina:");
                    soilType = switchPropertiesType.soilTypeSwitch();
                    System.out.println("Podaj wilgotność gleby, który lubi roślina:");
                    soilMoisture = switchPropertiesType.soilMoistureSwitch();
                    System.out.println("Podaj pH gleby, które lubi roślina:");
                    soilPH = Integer.parseInt(scanner.nextLine());
                    int vitaminPerGram = Integer.parseInt(scanner.nextLine());
                    System.out.println("Podaj kategorię (rodzinę) rośliny:");
                    family = switchPropertiesType.familySwitch();
                    EatLeafPlant leafPlant = new EatLeafPlant(name, insolation, soilType, soilMoisture, soilPH, family, vitaminPerGram);
                    System.out.println("Gratulacje. Twoja roślina została dodana do bazy danych.");
                    ConsoleHelper.MultipleChoice();
                    break;
                case "6":
                    ConsoleHelper consoleHelper = new ConsoleHelper();
                    consoleHelper.MultipleChoice();
                    break;

            }
        } while (!choice.equals("6"));
    }
}
