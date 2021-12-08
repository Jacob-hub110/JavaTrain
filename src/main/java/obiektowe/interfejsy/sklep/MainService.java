package obiektowe.interfejsy.sklep;

public class MainService {
    private final ReceiptService receiptService;
    private final EmailService emailService;
    private final PurchaseService purchaseService;

    public MainService(ReceiptService receiptService, EmailService emailService, PurchaseService purchaseService) {
        this.receiptService = receiptService;
        this.emailService = emailService;
        this.purchaseService = purchaseService;
    }

    public void buy(Product product, int amount){
        this.receiptService.generateReceipt(product, amount);
        this.emailService.sendPurchaseConfirmation(product);
        this.purchaseService.writePIN();
    }
}
