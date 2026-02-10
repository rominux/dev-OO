class UseCompetitor {
    public static void main(String[] args) {
        Competitor[] tab = new Competitor[100];
        tab[0] = new Competitor(1,45,15,20);
        tab[1] = new Competitor(2,32,12,45);
        tab[2] = new Competitor(5,12,13,59);
        tab[3] = new Competitor(12,12,15,70);
        tab[4] = new Competitor(32,75,15,20);

        Competitor traceur = new Competitor(7,42,13,50);

        for (int i=0; i<tab.length; i++) {
            if (tab[i] != null && tab[i].getNumberSign() != null) {
                System.out.println(tab[i]);
                System.out.println(traceur.isFaster(tab[i]));
            }
        }
    }
}
