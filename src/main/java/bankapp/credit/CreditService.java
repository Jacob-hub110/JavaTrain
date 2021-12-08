package bankapp.credit;

import bankapp.client.Client;

import java.math.BigDecimal;

public class CreditService {
    
    public CreateCreditResult takeALoan(Credit credit, Client client, BigDecimal fund, int installments){
        client.addCredit(credit);
        return new CreateCreditResult(
                client, credit.getCreditProduct(), fund,
                credit.getNextInstallmentDate(), installments
        );
    }
}
