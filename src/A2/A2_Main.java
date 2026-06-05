package A2;

public class A2_Main {
    public static void main(String[] args) {

    }


    public static Movie[] makeCatalogue(int[] a, String[] title) {
        Movie[] movies = new Movie[a.length];

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                String actionMovieTitle = title[i];
                movies[i] = new ActionMovie(actionMovieTitle);
            } else if (a[i] == 2) {
                String animationMovieTitle = title[i];
                movies[i] = new AnimationMovie(animationMovieTitle);
            } else {
                String movieTitle = title[i];
                movies[i] = new Movie(movieTitle);
            }
        }

        return movies;
    }

    public static Movie makeOrder(Movie[] movies, int pos, int cat) {
        if (cat == 1) {
            if (movies[pos] instanceof ActionMovie) return movies[pos];
            else return null;
        } else if (cat == 2) {
            if (movies[pos] instanceof AnimationMovie) return movies[pos];
            else return null;
        } else {
            if (movies[pos] instanceof Movie) return movies[pos];
            else return null;
        }

    }
}