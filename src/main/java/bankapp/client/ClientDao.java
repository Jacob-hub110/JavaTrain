package bankapp.client;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClientDao {

    private List<Client> clients;

    private ClientDao(List<Client> clients) {
        this.clients = clients;
    }

    public static ClientDao createClientDatabase() {
        final List<Client> clients = new ArrayList<>();

        clients.add(new Client("janek97", "Jan", "Kowalski", "12345678900",
                "janek97@gmail.com", new Account("1001", LocalDate.now(), BigDecimal.valueOf(4325L))));

        clients.add(new Client("szymon78", "Szymon", "Kowalski", "12345678901",
                "szymon78@gmail.com", new Account("2002", LocalDate.now(), BigDecimal.valueOf(120L))));

        clients.add(new Client("adrian21", "Adriant", "Kowalski", "12345678902",
                "adrian21@gmail.com", new Account("3003", LocalDate.now(), BigDecimal.valueOf(1320L))));

        clients.add(new Client("grzes76", "Grzes", "Kowalski", "12345678903",
                "grzes76@gmail.com", new Account("4004", LocalDate.now(), BigDecimal.valueOf(600))));

        return new ClientDao(clients);
    }

    public void addAccount(Client client) {
        final List<Client> clients = this.clients;
        clients.add(client);
        new ClientDao(clients);
    }

    public List<Client> findAll(){
        return this.clients;
    }

    public void addClient(Client client){

        for (Client actualClient : clients) {
            if (actualClient.equals(client)){
                throw new ClientAlreadyExistsException("Ten użytkownik już istnieje");
            }
        }
        clients.add(client);
    }
}
