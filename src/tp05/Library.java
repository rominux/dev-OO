package tp05;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> catalog;

    public Library() {
        this.catalog = new ArrayList<>();
    }

    public Book getBook(String code) {
        for (Book b : catalog) {
            if (b.getCode().equals(code)) {
                return b;
            }
        }
        return null;
    }

    public boolean addBook(Book b) {
        if (getBook(b.getCode()) == null) {
            return catalog.add(b);
        }
        return false;
    }

    public boolean removeBook(String aCode) {
        Book b = getBook(aCode);
        if (b != null) {
            return catalog.remove(b);
        }
        return false;
    }

    public boolean removeBook(Book b) {
        return catalog.remove(b);
    }

    public boolean borrow(String code, int borrower) {
        Book b = getBook(code);
        if (b != null) {
            return b.borrow(borrower);
        }
        return false;
    }

    public boolean giveBack(String code) {
        Book b = getBook(code);
        if (b != null) {
            return b.giveBack();
        }
        return false;
    }

    public String borrowings() {
        StringBuilder sb = new StringBuilder();
        for (Book b : catalog) {
            if (!b.isAvailable()) {
                sb.append("(").append(b.getCode()).append(")--").append(b.getBorrower()).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public int stockSize() {
        return catalog.size();
    }

    public int borrowedBookNumber() {
        int count = 0;
        for (Book b : catalog) {
            if (!b.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return catalog.toString();
    }
}