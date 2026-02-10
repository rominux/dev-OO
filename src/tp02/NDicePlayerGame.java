class NDicePlayerGame {
    DicePlayer[] players;

    NDicePlayerGame(int n) {
        players = new DicePlayer[n];
        for (int i = 0; i < n; i++) {
            players[i] = new DicePlayer("n" + i);
        }
    }

    void play(Dice aDice, int objective) {
        for (int i = 0; i < players.length; i++) {
            players[i].playUntil(aDice, objective);
        }
    }

    DicePlayer[] getWinners() {
        DicePlayer[] bests = new DicePlayer[players.length];
        bests[0] = players[0];
        int j = 1;
        for (int i = 1; i < players.length; i++) {
            if (players[i].compareNbDiceRolls(bests[0]) < 0) {
                bests = new DicePlayer[players.length];
                bests[0] = players[i];
                j = 1;
            } else if (players[i].compareNbDiceRolls(bests[0]) == 0) {
                bests[j]= players[i];
                j++;
            }
        }
        DicePlayer[] res = new DicePlayer[j];
        for (int i=0; i<j; i++) {
            res[i] = bests[i];
        }
        return res;
    }

    public static void main(String[] args) {
        NDicePlayerGame g = new NDicePlayerGame(10);
        Dice de = new Dice(6);
        g.play(de, 25);
        DicePlayer[] winners = g.getWinners();
        for (int i=0; i < winners.length; i++) {
            System.out.println(winners[i]);
        }
    }
}
