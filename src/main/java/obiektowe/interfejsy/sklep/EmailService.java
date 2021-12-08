package obiektowe.interfejsy.sklep;

public class EmailService {

    public void sendPurchaseConfirmation(Product product) {
        System.out.println("Email: Zrobiłeś zakupy w naszym sklepie. Kupiłeś: " + product.description());
    }
}
