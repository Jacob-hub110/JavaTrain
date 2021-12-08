package wzorce_projektowe.builder;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount.Builder("1234", "Michal")
                .withCurrency("PLN")
                .withBalance(BigDecimal.valueOf(1000))
                .build();

        BankAccount account2 = new BankAccount.Builder("1234", "Michal")
                .withCurrency("PLN")
                .withCategory("GOLD")
                .withBalance(BigDecimal.ZERO)
                .build();

        System.out.println(account);
        System.out.println(account2);
    }

}
