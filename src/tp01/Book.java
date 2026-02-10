class Book {
    String author;
    String title;
    int year;

    Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }
    
    public String toString() {
        return this.author + ":" + this.title + ":" + this.year;
    }
    boolean isOldest(Book other) {
        return this.year < other.year;
    }
}