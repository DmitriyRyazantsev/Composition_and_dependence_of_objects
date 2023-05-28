public class movie_poster_manager {
    private String[] movies = new String[0];
    private int limit;

    public movie_poster_manager() {
        this.limit = 5;
    }

    public movie_poster_manager(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] resul = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            resul[i] = movies[i];
        }
        resul[resul.length - 1] = movie;
        movies = resul;

    }


    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < limit) {
            resultLength = movies.length;
        } else {
            resultLength = limit;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;

    }
}
