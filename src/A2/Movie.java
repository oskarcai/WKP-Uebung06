package A2;

public class Movie {
    private static int movNum = 0;
    private String title;

    // Konstruktor
    public Movie(String title) {
        this.title = title;
        movNum++;
    }

    // toString() überschreiben
    @Override
    public String toString() {
        return "Dieser Film ist ein Standard-Movie mit dem Titel: " + title + " -> bisher gibt es " + movNum + " hiervon";
    }

    // Getter & Setter
    public static int getMovNum() {
        return movNum;
    }
    public static void setMovNum(int movNum) {
        Movie.movNum = movNum;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

}
