package bankapp.services.transfer;

import bankapp.client.Client;
import bankapp.client.ClientDao;

import java.math.BigDecimal;

public class TransferService {

    private ClientDao clientDao;

    public TransferService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public void transfer(Client sender, Client receiver, BigDecimal amount) {
        validateAccounts(sender, receiver);
        validateSenderHaveEnoughMoney(sender, amount);

        sender.getAccount().withdraw(amount);
        receiver.getAccount().deposit(amount);
    }

    private void validateAccounts(Client sender, Client receiver) {
        if (sender.getAccount() == null) {
            throw new AccountNotFoundException("Konto wysyłającego nie istnieje");
        }
        if (receiver.getAccount() == null) {
            throw new AccountNotFoundException("Konto otrzymującego nie istnieje");
        }
    }

    private void validateSenderHaveEnoughMoney(Client sender, BigDecimal amount) {
        final int compareResult = sender.getAccount().getBalance().compareTo(amount);
        if (compareResult < 0) {
            throw new NotEnoughMoneyException("Wysyłający nie ma wystarczających środków");
        }
    }
}

