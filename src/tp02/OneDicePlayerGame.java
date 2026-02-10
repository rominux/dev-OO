class OneDicePlayerGame {
    public static void main(String[] args) {
        Dice de = new Dice(6);
        DicePlayer p = new DicePlayer("Titouan");
        p.playUntil(de, 20);
        System.out.println(p);
    }
}
