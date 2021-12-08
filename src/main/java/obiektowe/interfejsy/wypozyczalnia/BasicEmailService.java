package obiektowe.interfejsy.wypozyczalnia;

public class BasicEmailService implements EmailService {

    public void sendRentConfirmation(Rentable rentable) {
        System.out.println("Email: Wypozyczono " + rentable.description());
    }

}
