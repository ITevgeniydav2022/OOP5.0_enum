import transport.*;
import transport.driver.DriverB;
import transport.driver.DriverC;
import transport.driver.DriverD;

public class Main {
    public static void main(String[] args) {

        // Задание 1,2
        System.out.println("Задание 1,2");

        Car lada = new Car("Lada", "Granta", 2.2, TypeBody.SEDAN);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, TypeBody.SEDAN);
        Car bmw = new Car("BMW", "Z8", 3.0, TypeBody.CROSSOVER);
        Car kia = new Car("KIA", "Sportage", 2.4, TypeBody.HATCHBACK);

        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);

        System.out.println(" ");

        Bus liaz = new Bus("ЛиАЗ", "677", 190, Capacity.MEDIUM);
        Bus uaz = new Bus("УАЗ", "452Д", 180, Capacity.SMALL);
        Bus laz = new Bus("ЛАЗ", "695М", 160, Capacity.EXTRA_LARGE);
        Bus ikarus = new Bus("Икарус", "280", 190, Capacity.MEDIUM);

        System.out.println(liaz);
        System.out.println(uaz);
        System.out.println(laz);
        System.out.println(ikarus);

        System.out.println(" ");

        Truck kamaz = new Truck("КАМАЗ", "Мастер", 980, BodyWeight.N1);
        Truck maz = new Truck("МАЗ", "6440 RR", 1000, BodyWeight.N3);
        Truck iveco = new Truck("IVECO", "695М", 980, BodyWeight.N2);
        Truck tatra = new Truck("Tatra", "280", 1000, BodyWeight.N3);

        System.out.println(kamaz);
        System.out.println(maz);
        System.out.println(iveco);
        System.out.println(tatra);
        kamaz.start();
        kamaz.stop();
        kamaz.pitStop();
        kamaz.bestLapTime();
        kamaz.maxSpeed();

        System.out.println(" ");

        DriverB evgeniy = new DriverB("Евгений ", true, 10);
        DriverC akakiy = new DriverC("Акакий ", true, 8);
        DriverD evpatiy = new DriverD("Евпатий ", true, 3);

        evgeniy.startMove(audi);
        evgeniy.stopMove(audi);
        evgeniy.refill(audi);
        evgeniy.printInfo(audi);

        akakiy.startMove(maz);
        akakiy.stopMove(maz);
        akakiy.refill(maz);
        akakiy.printInfo(maz);

        evpatiy.startMove(ikarus);
        evpatiy.stopMove(ikarus);
        evpatiy.refill(ikarus);
        evpatiy.printInfo(ikarus);
    }
}