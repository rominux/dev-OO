package tp05;

public class UseLibrary {
    public static void main(String[] args) {
        Library lib = new Library();

        Book b1 = new Book("H2G2", "The Hitchhiker's Guide to the Galaxy", "D. Adams", 1979);
        Book b2 = new Book("FLTL", "Flatland", "E. Abbott Abbott", 1884);
        Book b3 = new Book("REU", "The Restaurant at the End of the Universe", "D. Adams", 1980);

        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);

        System.out.println("A specific book:");
        System.out.println(lib.getBook("H2G2"));
        System.out.println("Display of the library");
        System.out.println(lib);

        System.out.println("\nBorrowings list");
        System.out.println("Initially --> " + lib.borrowings());
        System.out.println(lib.borrow("H2G2", 42) + " --> " + lib.borrowings());
        System.out.println(lib.borrow("H2G2", 404) + " --> " + lib.borrowings());
        System.out.println(lib.borrow("REU", 404) + " --> " + lib.borrowings());
        System.out.println(lib.borrow("FLTL", 42) + " --> " + lib.borrowings());

        ComicBook cb1 = new ComicBook("LeuG", "Léonard est un Génie", "Bob de Groot", 1977, "Turk");
        lib.addBook(cb1);
        
        lib.giveBack("H2G2"); 
        
        System.out.println("\n> " + lib);
        System.out.println(lib.borrow("H2G2", 42) + " --> " + lib.borrowings());
        System.out.println(lib.borrow("LeuG", 42) + " --> " + lib.borrowings());

        ComicBook cb2 = new ComicBook("GVV", "Génie, Vidi, Vici!", "Turk", 2024, "Zidrou"); 
        lib.addBook(cb2);
        lib.borrow("GVV", 404);
        
        System.out.println("\n> " + lib);
        System.out.println(lib.getBook("H2G2").getGiveBackDate());
        System.out.println(lib.getBook("LeuG").getGiveBackDate());
        System.out.println(lib.getBook("GVV").getGiveBackDate());
    }
}