class UseHighScore3 {
    public static void main(String[] args) {
        HighScore h = new HighScore(Integer.valueOf(args[0]));
        h.addHighestFirst(new Score("Alice", 300, "29/01"));
        System.out.println(h);
        h.addHighestFirst(new Score("Bob", 800, "29/01"));
        System.out.println(h);
        h.addHighestFirst(new Score("Carl", 750, "30/01"));
        System.out.println(h);
        h.addHighestFirst(new Score("Alice", 650, "31/01"));
        System.out.println(h);
        h.addHighestFirst(new Score("Bob", 430, "30/01"));
        System.out.println(h);
    }
}