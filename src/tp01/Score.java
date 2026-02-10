class Score {
    String name;
    int score;
    String timestamp;

    Score(String name, int score, String timestamp) {
        this.name = name;
        this.score = score;
        this.timestamp = timestamp;
    }

    public String toString() {
        return "(" + this.timestamp + ") " + this.name + " = " + this.score;
    }
}