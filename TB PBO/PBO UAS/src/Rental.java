public class Rental extends Pelanggan {
    public Mobil car;
    public int rentalDays;

    public Rental(String customerId, String name, Mobil car, int rentalDays) {
        super(customerId, name);
        this.car = car;
        this.rentalDays = rentalDays;
    }

    public Rental(Mobil car, Pelanggan customer, int days) {
        super(customer.getCustomerId(), customer.getName());
        this.car = car;
        this.rentalDays = days;
    }

    public Mobil getCar() {
        return car;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public Pelanggan getCustomer() {
        return null;
    }
}