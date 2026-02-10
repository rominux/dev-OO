class TwoDicePlayerGame {
    DicePlayer p1;
    DicePlayer p2;
    void play(Dice aDice, int objective) {
        p1 = new DicePlayer("p1");
        p2 = new DicePlayer("p2");
        p1.playUntil(aDice, objective);
        p2.playUntil(aDice, objective);
    }

    DicePlayer getWinner() {
        if (p1.isWinner(p2)) return p1;
        return p2;
    }

    public static void main(String[] args) {
        TwoDicePlayerGame g = new TwoDicePlayerGame();
        Dice de = new Dice(6);
        g.play(de, 25);
        System.out.println(g.getWinner());
    }
}
