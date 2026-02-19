package tp03;

class Card {
    Color color;
    Rank rank;

    public Card(Color c, Rank r) {
        this.rank = r;
        this.color = c;
    }
    public Card(String c, String r) {
        this.color = Color.valueOf(c);
        this.rank = Rank.valueOf(r);
    }
    public Color getColor() {
        return this.color;
    }
    public Rank getRank() {
        return this.rank;
    }
    public boolean equals(Card other) {
        if (this == other) return true;
        if (other == null) return false;
        if (this.rank != other.rank) return false;
        if (this.color != other.color) return false;
        return true;
    }

    public String toString() {
        return "Card{" + this.rank + " " + this.color + "}";
    }
}
