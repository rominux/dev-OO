class UseDice {
    public static void main(String[] args) {
        Dice de = new Dice(6);
        for (int i = 1; i<20; i++) {
            de.roll();
            System.out.println(de);
        }
        de = new Dice(10);
        for (int i = 1; i<20; i++) {
            de.roll();
            System.out.println(de);
        }
    }
}
