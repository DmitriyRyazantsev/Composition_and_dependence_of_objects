import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void testMoviesManager1f() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMovie("film 1");

        String[] expected = {"film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesManagerLimit() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");

        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesManager3() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");


        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesManager3f() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMovie("film 3");
        manager.addMovie("film 2");
        manager.addMovie("film 1");


        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesManagerNo() {
        MoviePosterManager manager = new MoviePosterManager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesManager5f() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");


        String[] expected = {"film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
    @Test
    public void testMoviesManagerMore() {
        MoviePosterManager manager = new MoviePosterManager();

        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 4");
        manager.addMovie("film 6");
        manager.addMovie("film 7");
        manager.addMovie("film 8");



        String[] expected = {"film 8", "film 7", "film 6", "film 4", "film 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
