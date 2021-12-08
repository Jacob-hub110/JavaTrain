package wyjatki.zadanie1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * ❖ Stwórz klasę Library (adres, lista użytkowników).
 * ❖ Pamiętaj o testach jednostkowych ☺
 * ❖ metoda addUser(User user) powinna dodać nowego użytkownika do
 * biblioteki, jeśli użytkownik o podanym loginie istnieje powinna rzucić
 * checked exception UserAlreadyExistException.
 * ❖ metoda retrieveCreatedUsersBefore(LocalDate date) powinna zwrócić listę
 * użytkowników stworzonych przed podaną w parametrze datą
 */
public class Library {
    private String address;
    private List<User> usersList;

    public Library(String address) {
        this.address = address;
        this.usersList = new ArrayList<>();
    }

    public List<User> getUsersList() {
        return usersList;
    }

    @Override
    public String toString() {
        return "adres='" + address + ", usersList=" + usersList + '}';
    }

    public void addUser(User userToAdd) throws UserAlreadyExistException {
        for (User user : usersList) {
            if (user.getLogin().equals(userToAdd.getLogin())) {
                throw new UserAlreadyExistException("Ten user już istnieje");
            }
        }
        usersList.add(userToAdd);
    }

    public List<User> retrieveCreatedUsersBefore(LocalDate date) {
        List<User> fixedList = new ArrayList<>();
        for (User user : usersList) {
            if (user.getCreationDate().isBefore(date)){
                fixedList.add(user);
            }

        }
        return fixedList;
    }

}
