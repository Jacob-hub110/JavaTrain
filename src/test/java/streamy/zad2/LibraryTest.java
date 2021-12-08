package streamy.zad2;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class LibraryTest {

    private Library createLibrary(){
        List<Book> books = List.of(
                new Book("LOTR", "A", LocalDateTime.now(), 599, true),
                new Book("sth", "k", LocalDateTime.now(), 599, false),
                new Book("hobbit3", "k", LocalDateTime.of(2021, 12, 10, 18, 0), 599, true),
                new Book("hobbit", "k", LocalDateTime.of(2021, 10, 10, 18, 0), 599, true),
                new Book("hobbit2", "k", LocalDateTime.of(2021, 11, 10, 18, 0), 599, true)
        );

        return new Library(books);
    }

    @Test
    void retrieveBestsellers() {
        //given
        Library library = createLibrary();
        //when
        List<Book> result = library.retrieveBestsellers();
        //then
        assertThat(result).hasSize(4);
    }

    @Test
    void retrieveBooksByAuthor() {
        //given
        Library library = createLibrary();
        //when
        List<Book> result = library.retrieveBooksByAuthor("A");
        //then
        assertThat(result).hasSize(1);
    }

    @Test
    void retrieveBooksByTitle() {
        //given
        Library library = createLibrary();
        //when
        List<Book> result = library.retrieveBooksByTitle("LOTR");
        //then
        assertThat(result.size()).isEqualTo(1);
    }

    @Test
    void retrieveNoFutureBooks() {
        //given
        Library library = new Library(new ArrayList<>());
        //when
        List<Book> result = library.retrievePremiers();
        //then
        assertThat(result.size()).isEqualTo(0);
    }

    @Test
    void retrieveOnlyFutureBooks() {
        //given
        Library library = createLibrary();
        //when
        List<Book> result = library.retrievePremiers();
        //then
        assertThat(result).hasSize(3);
        assertThat(result.get(0).getTitle()).isEqualTo("hobbit");
        assertThat(result.get(1).getTitle()).isEqualTo("hobbit2");
        assertThat(result.get(2).getTitle()).isEqualTo("hobbit3");
    }

}