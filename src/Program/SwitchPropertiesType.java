package Program;

import Enumerators.*;

import java.util.Scanner;

public class SwitchPropertiesType {
    public InsolationType insolationSwitch(){
        System.out.println("1: Słoneczne.");
        System.out.println("2: Półsłoneczne/półcieniste.");
        System.out.println("3: Zacienione");
        System.out.println("4: Wróć.");

        InsolationType option = InsolationType.other;
        String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    option = InsolationType.sunny;
                    break;
                case "2":
                    option = InsolationType.halflight;
                    break;
                case "3":
                    option = InsolationType.shadow;
                    break;
                case "4":
                    break;}
    }while(choice ==null);
        return option;
    }
    public SoilType soilTypeSwitch(){
        System.out.println("1: Uniwersalna.");
        System.out.println("2: Piaszczysta. ");
        System.out.println("3: Torf. ");
        System.out.println("4: Gliniasta, ilasta. ");
        System.out.println("5: Wróć.");

        SoilType option = SoilType.other;
        String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    option = SoilType.universal;
                break;
                case "2":
                    option = SoilType.sandy;
                break;
                case "3":
                    option = SoilType.peaty;
                break;
                case "4":
                    option = SoilType.clay;
                break;
                case "5":
                    break;
            }
        }while(choice == null);
        return option;
    }
    public SoilMoisture soilMoistureSwitch(){
        System.out.println("1: Mokra.");
        System.out.println("2: Wilgotna.");
        System.out.println("3: Sucha");
        System.out.println("4: Wróć.");

        SoilMoisture option = SoilMoisture.other;
        String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    option = SoilMoisture.wet;
                    break;
                case "2":
                    option = SoilMoisture.moist;
                    break;
                case "3":
                    option = SoilMoisture.dry;
                    break;
                case "4":
                    break;
            }
        }while(choice == null);
        return option;
    }
    public DecorativeElement decorativeElementSwitch(){
        System.out.println("1: Kwiaty.");
        System.out.println("2: Liście.");
        System.out.println("3: Liście i kwiaty");
        System.out.println("4: Wróć.");

        DecorativeElement option = DecorativeElement.others;
        String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    option = DecorativeElement.flowers;
                    break;
                case "2":
                    option = DecorativeElement.flowersAndLeafs;
                    break;
                case "3":
                    option = DecorativeElement.leafs;
                    break;
                case "4":
                    break;
            }
        }while(choice == null);
        return option;
    }
    public Family familySwitch(){
        System.out.println("1: Amarylkowate.");
        System.out.println("2: Psiankowate.");
        System.out.println("3: Kapustowate");
        System.out.println("4: Astrowate.");
        System.out.println("5: Selerowate.");
        System.out.println("6: Wróć.");

        Family option = Family.others;
        String choice = null;
        Scanner scan = new Scanner(System.in);
        do {
            choice = scan.nextLine();
            switch (choice) {
                case "1":
                    option = Family.onion;
                    break;
                case "2":
                    option = Family.potato;
                    break;
                case "3":
                    option = Family.cabbage;
                    break;
                case "4":
                    option = Family.daisy;
                    break;
                case "5":
                    break;
            }
        }while(choice == null);
        return option;
    }

}
