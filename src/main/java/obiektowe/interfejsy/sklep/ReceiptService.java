package obiektowe.interfejsy.sklep;

public class ReceiptService {

    public void generateReceipt(Product product, int amount) {
        System.out.println("Generowanie paragonu.... cena: " + product.calculatePrice(amount));
    }
}
