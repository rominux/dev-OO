class Competitor {
    private String numberSign;
    private int time;
    private int score;

    public Competitor(int numberSign, int score, int min, int sec) {
        if (numberSign >= 1 && numberSign <= 100 && score >= 0 && score <= 50 && min >= 0 && min < 60 && sec >= 0 && sec < 60) {
            this.numberSign = "No" + numberSign;
        }
        this.score = score;
        this.time = min*60 + sec;
    }

    public String getNumberSign() {
        return this.numberSign;
    }

    public String toString() {
        String s = "-invalide-";
        if (numberSign != null) {
            s = numberSign;
        }
        return "(" + s + ", " + score + " points, " + time + " s)";
    }

    boolean equals(Competitor other) {
        if (this == other) return true;
        if (other == null) return false;
        if (numberSign == null && other.numberSign != null) return false;
        if (!(numberSign.equals(other.numberSign))) return false;
        if (!(score == other.score)) return false;
        return true;
    }

    public boolean isFaster(Competitor other) {
        return this.time < other.time;
    }
}
