package A2;

public class AnimationMovie extends Movie {
    private static int aniNum = 0;

    // Unterklassen-Konstruktor
    public AnimationMovie(String title) {
        super(title);
        aniNum++;
    }

    // toString() überschreiben
    public String toString() {
        return "Dieser Film ist ein Animation-Movie mit dem Titel: " + this.getTitle() + " -> bisher gibt es " + aniNum + " hiervon";
    }

    // Getter & Setter
    public static int getAniNum() {
        return aniNum;
    }
    public static void setAniNum(int aniNum) {
        AnimationMovie.aniNum = aniNum;
    }
}
