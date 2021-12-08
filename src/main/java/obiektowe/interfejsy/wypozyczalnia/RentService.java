package obiektowe.interfejsy.wypozyczalnia;

public class RentService {

    private EmailService emailService;
    private SmsService smsService;
    private InvoiceService invoiceService;

    public RentService() {
        this.emailService = new BasicEmailService();
        this.smsService = new SmsService();
        this.invoiceService = new InvoiceService();
    }

    public void rent(Rentable rentable, int hours) {
        this.invoiceService.generateInvoice(rentable, hours);
        this.emailService.sendRentConfirmation(rentable);
        this.smsService.sendRentConfirmation(rentable);
    }
}
