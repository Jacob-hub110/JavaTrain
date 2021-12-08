package bankapp.services.transfer;

import bankapp.client.Account;
import bankapp.client.Client;
import bankapp.client.ClientDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TransferServiceTest {

    private ClientDao clientDao;
    private TransferService transferService;
    private Client sender;
    private Client receiver;

    @BeforeEach
    void setUp() {
        this.clientDao = ClientDao.createClientDatabase();
        this.transferService = new TransferService(this.clientDao);
        this.sender = new Client("krzysiek22", "krzysztof", "Kowal", "98765432100",
                "krzysiek22@gmail.com", new Account("987", LocalDate.now(), BigDecimal.valueOf(900L)));
        this.receiver = new Client("andrzej34", "Andrzej", "Jarowiecki",
                "98765432101", "andrzej34@gmail.com", new Account("654", LocalDate.now(),
                BigDecimal.valueOf(700L)));
    }

    @Test
    void transfer_shouldTransfer() {
        //given
        this.clientDao.addClient(this.sender);
        this.clientDao.addClient(this.receiver);
        //when
        this.transferService.transfer(this.sender, this.receiver, BigDecimal.valueOf(200));
        //then
        assertThat(this.sender.getAccount().getBalance()).isEqualTo(BigDecimal.valueOf(700));
        assertThat(this.receiver.getAccount().getBalance()).isEqualTo(BigDecimal.valueOf(900));
    }

    @Test
    void transfer_shouldThrow_AccountNotFoundException() {
        //given & when
        final Client receiver = new Client("andrzej34", "Andrzej", "Jarowiecki",
                "98765432101", "andrzej34@gmail.com", null);
        //then
        assertThrows(AccountNotFoundException.class, () -> {
            this.transferService.transfer(this.sender, receiver, BigDecimal.valueOf(200));
        });
    }
}