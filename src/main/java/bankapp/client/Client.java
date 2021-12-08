package bankapp.client;

import bankapp.credit.Credit;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private List<Credit> credits = new ArrayList<>();
    private String login;
    private String firstName;
    private String lastName;
    private String pesel;
    private String email;
    private Account account;

    public Client(String login, String firstName, String lastName, String pesel, String email, Account account) {
        this.login = login;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.email = email;
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return "Client{" +
                "login='" + login + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pesel='" + pesel + '\'' +
                ", email='" + email + '\'' +
                ", account=" + account +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(login, client.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login);
    }

    public void deleteAccount() {
        this.account = null;
    }

    public void addCredit(Credit credit) {
        credits.add(credit);
    }
}
