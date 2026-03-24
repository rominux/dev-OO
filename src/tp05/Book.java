package tp05;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private String code;
    private final String title;
    private final String author;
    private final int publicationYear;
    private int borrower;
    private LocalDate borrowingDate;

    public Book(String code, String title, String author, int publicationYear) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrower = 0;
        this.borrowingDate = null;
    }

    public String getCode() { return code; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getPublicationYear() { return publicationYear; }
    public int getBorrower() { return borrower; }

    public boolean isAvailable() {
        return this.borrower == 0;
    }

    public boolean borrow(int borrower) {
        if (isAvailable()) {
            this.borrower = borrower;
            this.borrowingDate = LocalDate.now();
            return true;
        }
        return false;
    }

    public boolean giveBack() {
        if (!isAvailable()) {
            this.borrower = 0;
            this.borrowingDate = null;
            return true;
        }
        return false;
    }

    public int getDurationMax() {
        return 15;
    }

    public LocalDate getGiveBackDate() {
        if (borrowingDate != null) {
            return borrowingDate.plusDays(getDurationMax());
        }
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(code, book.code);
    }

    @Override
    public String toString() {
        return "Book [" + code + ":" + title + "->" + author + ", " + publicationYear + "]";
    }
}