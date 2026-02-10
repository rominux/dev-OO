class DicePlayer {
    private String name;
    private int nbDiceRolls;
    private int totalValue;

    public DicePlayer(String n) {
        this.name = n;
        this.nbDiceRolls = 0;
        this.totalValue = 0;
    }
    public String toString() {
        return this.name + ": " + this.totalValue + " points en " + this.nbDiceRolls + " coups.";
    }

    public String getName() {return name;}
    public int getNbDiceRolls() {return nbDiceRolls;}
    public int getTotalValue() {return totalValue;}

    void play(Dice aDice) {
        this.nbDiceRolls++;
        aDice.roll();
        this.totalValue += aDice.getValue();
    }

    void playUntil(Dice aDice, int objective) {
        while (this.totalValue < objective) {
            this.play(aDice);
        }
    }
    boolean isWinner(DicePlayer other) {
        if (this.nbDiceRolls > other.nbDiceRolls) return false;
        if (this.nbDiceRolls < other.nbDiceRolls) return true;
        if (this.totalValue < other.totalValue) return true;
        return false;
    }
    int compareNbDiceRolls(DicePlayer other) {
        return this.nbDiceRolls - other.nbDiceRolls;
    }
}
