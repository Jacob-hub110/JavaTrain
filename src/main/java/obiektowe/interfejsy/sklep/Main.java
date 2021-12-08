package obiektowe.interfejsy.sklep;



/**
 * W tym zadaniu wzoruj sie na wypozyczalni.
 * Stworz interfejs Product, ktory bedzie reprezentowal produkt.
 * Zaimplementuj serwisy do placenia, generowania paragonu i wysylania powiadomienia email. - jak np EmailService
 * Zaimplementuj serwis do zrobienia zakupow. - jak np. RentService(wywoluje wszystkie inne serwisy)
 * Pamietaj zeby wszystkie seriwsy operowaly na interfejsie Product.
 * Stworz kilka klas produktow, np Drink(name, price), Vegetable(name, price) itd.
 * W main stworz produkty i wywolaj dla nich serwis do robienia zakupow.
 */
public class Main {

    public static void main(String[] args) {
        Milk milk = new Milk("łaciate", "mleko");
        Bread bread = new Bread("hert", "chleb");

        ReceiptService receiptService = new ReceiptService();
        EmailService emailService = new EmailService();
        PurchaseService purchaseService = new PurchaseService();

        MainService mainService = new MainService(receiptService, emailService, purchaseService);
        mainService.buy(milk, 6);
        mainService.buy(bread, 2);
    }
}


