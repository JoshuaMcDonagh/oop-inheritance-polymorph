package vehicles;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Ford", "Mustang", 300, "Unleaded");
        Motorcycle motorcycle1 = new Motorcycle("Harley Davidson", "Big", 200, "Unleaded", true);

        car1.start();
        motorcycle1.start();
        car1.drive();
        System.out.println("\n------------------------\n");
        motorcycle1.drive();

    }
}
