class UseHighScore2 {
    public static void main(String[] args) {
        HighScore h = new HighScore(Integer.valueOf(args[0]));
        h.addFirstFreeSlot(new Score("Alice", 300, "29/01"));
        h.addFirstFreeSlot(new Score("Bob", 800, "29/01"));
        h.addFirstFreeSlot(new Score("Alice", 42, "30/01"));
        h.addFirstFreeSlot(new Score("Alice", 650, "31/01"));
        System.out.println(h);
    }
}