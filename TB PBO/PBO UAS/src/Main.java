

public class Main {
    public static void main(String[] args) {
        RentalSystem rentalSystem = new RentalSystem();
        rentalSystem.login();

        Mobil car1 = new Mobil("C001", "Toyota", "Avanza", 200000.0); 
        Mobil car2 = new Mobil("C002", "Honda", "Mobilio", 220000.0);
        Mobil car3 = new Mobil("C003", "BMW", "C90", 300000.0);
        rentalSystem.addCar(car1);
        rentalSystem.addCar(car2);
        rentalSystem.addCar(car3);

        rentalSystem.menu();
    }
}

