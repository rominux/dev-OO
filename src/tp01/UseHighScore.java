class UseHighScore {
    public static void main(String[] args) {
        HighScore h = new HighScore();
        h.addFirstFreeSlot(new Score("Alice", 300, "29/01"));
        h.addFirstFreeSlot(new Score("Bob", 800, "29/01"));
        System.out.println(h);
    }
}