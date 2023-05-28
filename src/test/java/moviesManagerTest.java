import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class moviesManagerTest {

    @Test
    public void test() {
        movie_poster_manager manager = new movie_poster_manager();

        manager.addMovie("film 1");

        String[] expected = {"film 1"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        movie_poster_manager manager = new movie_poster_manager();

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
    public void test2() {
        movie_poster_manager manager = new movie_poster_manager();

        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");


        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        movie_poster_manager manager = new movie_poster_manager();

        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");


        String[] expected = {"film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {
        movie_poster_manager manager = new movie_poster_manager();


        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        movie_poster_manager manager = new movie_poster_manager();

        manager.addMovie("film 1");
        manager.addMovie("film 2");
        manager.addMovie("film 3");
        manager.addMovie("film 4");
        manager.addMovie("film 5");


        String[] expected = {"film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }
}
