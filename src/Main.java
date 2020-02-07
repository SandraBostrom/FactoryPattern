import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Do you want to\n1.Repair a car \n2.Order a car");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                repairCar();
                break;
            case 2:
                buildCar();
                break;

        }
    }
    public static void buildCar() {
        System.out.println("What car would you like \n1.Audi\n2.BMW\n3.Koeningsegg\n4.Volkswagen\n5.Scania");
       Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        CarFactory carFactory = new CarFactory();

        switch (choice) {
            case 1:
                Build buildAudi = carFactory.getCar(CarFactory.Cars.Audi);
                buildAudi.build();
                break;
            case 2:
                Build buildBMW = carFactory.getCar(CarFactory.Cars.BMW);
                buildBMW.build();
                break;
            case 3:
                Build buildKoeningsegg = carFactory.getCar(CarFactory.Cars.Koeningsegg);
                buildKoeningsegg.build();
                break;
            case 4:
                Build buildVolkswagen = carFactory.getCar(CarFactory.Cars.Volkswagen);
                buildVolkswagen.build();
            break;
            case 5:
                Build buildScania = carFactory.getCar(CarFactory.Cars.Scania);
                buildScania.build();
                break;
        }
    }
    public static void repairCar(){
        System.out.println("What car would you like repair \n1.Audi\n2.BMW\n3.Koeningsegg\n4.Volkswagen\n5.Scania");
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        CarFactory carFactory = new CarFactory();

        switch (choice) {
            case 1:
                Build buildAudi = carFactory.getCar(CarFactory.Cars.Audi);
                buildAudi.repair();
                break;
            case 2:
                Build buildBMW = carFactory.getCar(CarFactory.Cars.BMW);
                buildBMW.repair();
                break;
            case 3:
                Build buildKoeningsegg = carFactory.getCar(CarFactory.Cars.Koeningsegg);
                buildKoeningsegg.repair();
                break;
            case 4:
                Build buildVolkswagen = carFactory.getCar(CarFactory.Cars.Volkswagen);
                buildVolkswagen.repair();
                break;
            case 5:
                Build buildScania = carFactory.getCar(CarFactory.Cars.Scania);
                buildScania.repair();
                break;
        }
    }
}
