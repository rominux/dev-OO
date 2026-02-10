class HighScore {
    Score[] top;

    HighScore() {
        this.top = new Score[100];
    }
    HighScore(int size) {
        this.top = new Score[size];
    }

    int getNbFreeSlot() {
        for (int i = 0; i < this.top.length; i++) {
            if (this.top[i] == null) {return this.top.length-i;}
        }
        return 0;
    }

    public String toString() {
        String res = "TOP SCORE:\n";
        for (int i = 0; i < this.top.length; i++) {
            if (this.top[i] != null) {res += this.top[i] + "\n";}
        }
        return res + "**" + this.getNbFreeSlot() + " free slots**";
    }

    boolean addFirstFreeSlot(Score newScore) {
        int free = this.getNbFreeSlot();
        if (free == 0) {
            return false;
        }
        this.top[this.top.length - free] = newScore;
        return true;
    }

    void shifting(int idx) {
        for (int i = this.top.length-1; i > idx ; i--) {
            this.top[i] = this.top[i-1];
        }
    }
    boolean addHighestFirst(Score newScore) {
        int i = 0;
        while (i < this.top.length && this.top[i] != null && this.top[i].score > newScore.score) {
            i++;
        }
        if (i == this.top.length) {
            return false;
        }
        shifting(i);
        this.top[i] = newScore;
        return true;
    }
}