package streamy.zad2;

import java.time.LocalDateTime;
import java.util.Objects;

public class Book {
    private final String title;
    private final String author;
    private final LocalDateTime premierDate;
    private final int pages;
    private final boolean bestseller;

    public Book(String title, String author, LocalDateTime premierDate, int pages, boolean bestseller) {
        this.title = title;
        this.author = author;
        this.premierDate = premierDate;
        this.pages = pages;
        this.bestseller = bestseller;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDateTime getPremierDate() {
        return premierDate;
    }

    public int getPages() {
        return pages;
    }

    public boolean isBestseller() {
        return bestseller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return pages == book.pages && bestseller == book.bestseller && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(premierDate, book.premierDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, premierDate, pages, bestseller);
    }

}
