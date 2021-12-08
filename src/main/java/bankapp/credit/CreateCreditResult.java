package bankapp.credit;

import bankapp.client.Client;
import bankapp.credit.creditProductEnum.CreditProduct;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CreateCreditResult {

    private Client client;
    private CreditProduct creditProduct;
    private BigDecimal fund;
    private LocalDate installmentPaymentDate;
    private int installments;

    public CreateCreditResult(Client client, CreditProduct creditProduct, BigDecimal fund, LocalDate installmentPaymentDate, int installments) {
        this.client = client;
        this.creditProduct = creditProduct;
        this.fund = fund;
        this.installmentPaymentDate = installmentPaymentDate;
        this.installments = installments;
    }
}
