package A2;

public class ActionMovie extends Movie {
    private static int actNum = 0;

    // Unterklassen-Konstruktor
    public ActionMovie(String title) {
        super(title);
        actNum++;
    }

    // toString() überschreiben
    public String toString() {
        return "Dieser Film ist ein Action-Movie mit dem Titel: " + this.getTitle() + " -> bisher gibt es " + actNum + " hiervon";
    }

    // Getter & Setter
    public static int getActNum() {
        return actNum;
    }
    public static void setActNum(int actNum) {
        ActionMovie.actNum = actNum;
    }
}
