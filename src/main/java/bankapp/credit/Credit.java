package bankapp.credit;

import bankapp.credit.creditProductEnum.CreditProduct;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Credit {
    private String uniqueNumber;
    private BigDecimal principalToBeRepaid;
    private int installmentsUntilTheEnd;
    private int installmentsInTotal;
    private LocalDate nextInstallmentDate;
    private CreditProduct creditProduct;

    public CreditProduct getCreditProduct() {
        return creditProduct;
    }

    public LocalDate getNextInstallmentDate() {
        return nextInstallmentDate;
    }
}
