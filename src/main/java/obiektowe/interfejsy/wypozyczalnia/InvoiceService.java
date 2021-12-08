package obiektowe.interfejsy.wypozyczalnia;

public class InvoiceService {

    public void generateInvoice(Rentable rentable, int hours) {
        System.out.println("Generowanie faktury.... cena: " + rentable.calculatePrice(hours));
    }

}
