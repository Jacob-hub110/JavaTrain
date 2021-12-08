package obiektowe.interfejsy.wypozyczalnia;

public class SmsService {

    public void sendRentConfirmation(Car car) {
        System.out.println("Sms: Wypozyczono " + car.description());
    }

    public void sendRentConfirmation(Scooter scooter) {
        System.out.println("Sms: Wypozyczono " + scooter.description());
    }

    public void sendRentConfirmation(Bicycle bicycle) {
        System.out.println("Sms: Wypozyczono " + bicycle.description());
    }

    public void sendRentConfirmation(Rentable rentable) {
        System.out.println("Sms: Wypozyczono " + rentable.description());
    }

}
