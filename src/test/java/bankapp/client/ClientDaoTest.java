package bankapp.client;

import bankapp.client.Account;
import bankapp.client.Client;
import bankapp.client.ClientAlreadyExistsException;
import bankapp.client.ClientDao;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ClientDaoTest {

    @Test
    void findAll() {
        //given
        final ClientDao clientDao = ClientDao.createClientDatabase();
        //when
        List<Client> result = clientDao.findAll();
        //then
        assertThat(result.size()).isEqualTo(4);
    }

    @Test
    void addClient() {
        //given
        final ClientDao clientDao = ClientDao.createClientDatabase();
        //when
        final Client client = new Client("wojtek44", "Wojtek", "Kowalski", "12345678909",
                "wojtek44@gmail.com", new Account("9009", LocalDate.now(), BigDecimal.valueOf(9000L)));
        clientDao.addClient(client);

        //then
        assertThat(clientDao.findAll().size()).isEqualTo(5);
    }

    @Test
    void addClient_shoulThrowExcp() {
        //given
        final ClientDao clientDao = ClientDao.createClientDatabase();
        final Client client = new Client("janek97", "Jan", "Kowalski", "12345678900",
                "janek97@gmail.com", new Account("1001", LocalDate.now(), BigDecimal.valueOf(4325L)));
        //when & then
        assertThrows(ClientAlreadyExistsException.class, () -> {
            clientDao.addClient(client);
        });
    }
}