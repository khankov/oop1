import oop1.Car;
import oop1.Car2;
import oop1.Car3;

public class Main {
    public static void main(String[] args) {
        printCar1();
        printCar2();
        printCar3();

    }


    public static void printCar1(){
        System.out.println("Задание 1");
        Car ladaGranta = new Car();
        ladaGranta.brand = "lada";
        ladaGranta.model = "Granta";
        ladaGranta.engineVolume = 1.7;
        ladaGranta.color = "жёлтый";
        ladaGranta.productionYear = 2015;
        ladaGranta.productionCountry = "Россия";
        Car audiA8 = new Car();
        audiA8.brand = "Audi";
        audiA8.model = "A8 50 L TDI quattro";
        audiA8.engineVolume = 3.0;
        audiA8.color = "чёрный";
        audiA8.productionYear = 2020;
        audiA8.productionCountry = "Германия";
        Car bmwZ8 = new Car();
        bmwZ8.brand = "BMV";
        bmwZ8.model = "Z8";
        bmwZ8.engineVolume = 3.0;
        bmwZ8.color = "чёрный";
        bmwZ8.productionYear = 2021;
        bmwZ8.productionCountry = "Германия";
        Car kiaSportage = new Car();
        kiaSportage.brand = "KIA";
        kiaSportage.model = "Sportage 4-го поколения";
        kiaSportage.engineVolume = 2.4;
        kiaSportage.color = "красный";
        kiaSportage.productionYear = 2018;
        kiaSportage.productionCountry = "Южная Корея";
        Car hyundaiAvante = new Car();
        hyundaiAvante.brand = "Hyundai";
        hyundaiAvante.model = "Avante";
        hyundaiAvante.engineVolume = 1.6;
        hyundaiAvante.color = "оранжевый";
        hyundaiAvante.productionYear = 2016;
        hyundaiAvante.productionCountry = "Южная Корея";
        System.out.println(ladaGranta + "\n" +
                audiA8 + "\n" +
                bmwZ8 + "\n" +
                kiaSportage + "\n" +
                hyundaiAvante + "\n");


    }

    public static void printCar2(){
        System.out.println("Задание 2");
        Car2 ladaGranta = new Car2("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия");
        Car2 audiA8 = new Car2("Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия");
        Car2 bmwZ8 = new Car2("BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия");
        Car2 kiaSportage = new Car2("KIA",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея");
        Car2 hyundaiAvante = new Car2 ("Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея");
        System.out.println(ladaGranta + "\n" +
                audiA8 + "\n" +
                bmwZ8 + "\n" +
                kiaSportage + "\n" +
                hyundaiAvante + "\n");

    }
    public static void printCar3(){
        System.out.println("Задание 3");
        Car3 ladaGranta = new Car3("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Россия");
        Car3 audiA8 = new Car3("Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия");
        Car3 bmwZ8 = new Car3("BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия");
        Car3 kiaSportage = new Car3("KIA",
                "Sportage 4-го поколения",
                2.4,
                "красный",
                2018,
                "Южная Корея");
        Car3 hyundaiAvante = new Car3 ("Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея");
        System.out.println(ladaGranta + "\n" +
                audiA8 + "\n" +
                bmwZ8 + "\n" +
                kiaSportage + "\n" +
                hyundaiAvante + "\n");
    }
}