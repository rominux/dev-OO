import java.util.Random;

class Dice {
    private int numberSides;
    private Random rand;
    private int value;

    public Dice(int s) {
        this.numberSides = 1;
        if (s > 0) this.numberSides = s;
        this.rand = new Random();
    }
    void roll() {
        this.value = this.rand.nextInt(this.numberSides)+1;
    }

    public String toString() {
        return "" + this.value;
    }

    public int getValue() {
        return this.value;
    }
}
