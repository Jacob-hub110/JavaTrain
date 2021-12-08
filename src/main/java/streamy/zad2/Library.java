package streamy.zad2;

import kolekcje.zbiory.zadanie2.Teacher;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Book> retrieveBestsellers() {
        return books.stream()
                .filter(Book::isBestseller)
                .collect(Collectors.toList());
    }

    public List<Book> retrieveBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
    }

    public List<Book> retrieveBooksByTitle(String title) {
        return books.stream()
                .filter(book -> book.getTitle().equals(title))
                .collect(Collectors.toList());
    }

    //todo metoda, ktora zwraca wszystkie ksiazki, ktore nie zostaly jeszcze wydane. Ksiazki powinny byc posortowane po dacie premiery.
    public List<Book> retrievePremiers() {
        return books.stream()
                .filter(book -> book.getPremierDate().isAfter(LocalDateTime.now()))
                .sorted(Comparator.comparing(Book::getPremierDate))
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
