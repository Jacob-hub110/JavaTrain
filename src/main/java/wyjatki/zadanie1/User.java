package wyjatki.zadanie1;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private String login;
    private String password;
    private String firstname;
    private String email;
    private LocalDate creationDate;

    private User(String login, String password, String firstname, String email, LocalDate creationDate) {
        this.login = login;
        this.password = password;
        this.firstname = firstname;
        this.email = email;
        this.creationDate = creationDate;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "login=" + login +
                ", password=" + password +
                ", firstname='" + firstname + '\'' +
                ", email='" + email + '\'' +
                ", creationDate='" + creationDate + '\'' +
                '}';
    }

    public static User create(String login, String password, String firstname, String email){
        if (login == null || password == null || email == null || firstname == null){
            throw new NullPointerException("Brak danych");
        }

        if (login.length() < 6) {
            throw new IllegalArgumentException("Za krótki login");
        }

        return new User(login, password, firstname, email, LocalDate.now());
    }
}
