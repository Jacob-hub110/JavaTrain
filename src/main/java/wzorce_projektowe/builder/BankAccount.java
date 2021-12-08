package wzorce_projektowe.builder;

import java.math.BigDecimal;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private String currency;
    private BigDecimal balance;
    private BigDecimal interestRate;
    private String category;

    private BankAccount() {

    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", owner='" + owner + '\'' +
                ", currency='" + currency + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                ", category='" + category + '\'' +
                '}';
    }

    public static class Builder {

        private String accountNumber;
        private String owner;
        private String currency;
        private BigDecimal balance;
        private BigDecimal interestRate;
        private String category;

        public Builder(String accountNumber, String owner) {
            this.accountNumber = accountNumber;
            this.owner = owner;
        }

        public Builder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder withBalance(BigDecimal balance) {
            this.balance = balance;
            return this;
        }

        public Builder withInterestRate(BigDecimal interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder withCategory(String category) {
            this.category = category;
            return this;
        }

        public BankAccount build() {
            BankAccount bankAccount = new BankAccount();

            bankAccount.accountNumber = this.accountNumber;
            bankAccount.owner = this.owner;
            bankAccount.currency = this.currency;
            bankAccount.balance = this.balance;
            bankAccount.interestRate = this.interestRate;
            bankAccount.category = this.category;

            return bankAccount;
        }

    }

}
