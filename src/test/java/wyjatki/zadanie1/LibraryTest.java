package wyjatki.zadanie1;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LibraryTest {

    @Test
    void should_return_library_size() throws Exception {
        //given
        Library library = new Library("krzycka 32-117");
        User user = User.create("admin555", "Kropelka1", "Jan", "jan@gmail.com");
        //when
        library.addUser(user);
        //then
        assertThat(library.getUsersList()).hasSize(1);
    }

    @Test
    void should_throw_user_already_exist_exception() throws UserAlreadyExistException {
        //given
        Library library = new Library("krzycka 32-117");
        User user = User.create("admin555", "Kropelka1", "Jan", "jan@gmail.com");
        library.addUser(user);
        //when & then
        assertThrows(UserAlreadyExistException.class, () -> {
          library.addUser(User.create("admin555", "Kropelka1", "Jan", "jan@gmail.com"));
        });
    }

    @Test
    void retrieveCreatedUsersBefore() throws Exception {
        //given
        Library library = new Library("krzycka 32-117");
        User user = User.create("admin666", "Kropelka1", "Jan", "jan@gmail.com");
        User user1 = User.create("admin466", "Kopeka1", "Andrzej", "an@gmail.com");
        library.addUser(user);
        library.addUser(user1);
        //when
        List<User> checkedList = library.retrieveCreatedUsersBefore(LocalDate.of(2020, 2,2));
        //then
        assertThat(checkedList).isEmpty();
    }

    @Test
    void shouldRetrieveUsers() throws Exception {
        //given
        Library library = new Library("krzycka 32-117");
        User user = User.create("admin66", "Kropelka1", "Jan", "jan@gmail.com");
        User user1 = User.create("admin466", "Kopeka1", "Andrzej", "an@gmail.com");
        library.addUser(user);
        library.addUser(user1);
        //when
        List<User> checkedList = library.retrieveCreatedUsersBefore(LocalDate.now().plusDays(1));
        //then
        assertThat(checkedList).hasSize(2);
    }
}