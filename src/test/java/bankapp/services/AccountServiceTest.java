package bankapp.services;

import bankapp.client.Client;
import bankapp.client.ClientDao;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AccountServiceTest {

    @Test
    void deleteAccount_shouldMakeAccountAsNull() {
        //given
        ClientDao clientDao = ClientDao.createClientDatabase();
        AccountService accountService = new AccountService(clientDao);
        Client client = clientDao.findAll().get(0);
        String accountNumber = client.getAccount().getNumber();
        //when
        accountService.deleteAccount(accountNumber);
        //then
        assertThat(client.getAccount()).isNull();
    }

    @Test
    void createAccount_shouldMakeNewAccountForClient() {

    }
}