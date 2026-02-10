class UseBook2 {
    public static void main(String[] args) {
        Book[] books = new Book[]{
            new Book("A", "a", 2004),
            new Book("B", "b", 2012),
            new Book("C", "c", 2001),
            new Book("D", "d", 2000),
            new Book("E", "e", 2025)
        };
        Book oldest = books[0];
        for (int i = 0;  i<books.length; i++) {
            System.out.println(books[i]);
            if (books[i].isOldest(oldest)) {
                oldest = books[i];
            }
        }
        System.out.println("le plus vieux est : " + oldest);
    }
}