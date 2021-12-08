package bankapp.services;

import bankapp.client.Client;
import bankapp.client.ClientDao;

public class AccountService {

    private ClientDao clientDao;

    public AccountService(ClientDao clientDao) {
        this.clientDao = clientDao;
    }

    public void deleteAccount(String accountNumber) {
        final Client client = this.clientDao.findAll()
                .stream()
                .filter((c) -> c.getAccount().getNumber().equals(accountNumber))
                .findFirst()
                .orElseThrow(IllegalStateException::new);

        client.deleteAccount();
    }

    public void createAccount(Client client) {
        clientDao.addAccount(client);
    }
}
