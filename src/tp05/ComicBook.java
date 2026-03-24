package tp05;

import java.time.LocalDate;

public class ComicBook extends Book {
    private String illustrator;

    public ComicBook(String code, String title, String author, int publicationYear, String illustrator) {
        super(code, title, author, publicationYear);
        this.illustrator = illustrator;
    }

    public String getIllustrator() {
        return illustrator;
    }

    @Override
    public int getDurationMax() {
        int currentYear = LocalDate.now().getYear();
        if ((currentYear - getPublicationYear()) <= 2) {
            return 5;
        }
        return super.getDurationMax();
    }

    @Override
    public String toString() {
        return "ComicBook [" + getCode() + ":" + getTitle() + "->" + getAuthor() + ", " + getPublicationYear() + ", " + illustrator + "]";
    }
}