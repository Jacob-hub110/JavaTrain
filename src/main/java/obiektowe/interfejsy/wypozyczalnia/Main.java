package obiektowe.interfejsy.wypozyczalnia;

public class Main {

    public static void main(String[] args) {
        RentService rentService = new RentService();

        Car car = new Car("Opel", "Astra", 2005);
        Scooter scooter = new Scooter("Lime");
        Bicycle bicycle = new Bicycle("góral", 1);
        Trailer trailer = new Trailer();

        rentService.rent(car, 8);
        rentService.rent(scooter, 3);
        rentService.rent(bicycle, 3);
        rentService.rent(trailer, 3);
    }
}
