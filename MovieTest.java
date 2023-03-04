import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class MovieTest {


    @Test
    public void testGetRating() {
        Movie movie = new Movie("Jaws", 2.25);
        assertEquals(0, movie.getRating());
    }

    @Test
    public void testGetTitle() {
        Movie movie = new Movie("Jaws", 2.25);
        assertEquals("Jaws", movie.getTitle());
    }

    @Test
    public void testGetDuration() {
        Movie movie = new Movie("Jaws", 2.25);
        assertEquals(2.25, movie.getDuration(), 0.0);
    }


    @Test
    public void testSetTitle() {
        Movie movie = new Movie("Jaws", 2.25);
        movie.setTitle("Test");
        assertEquals("Test", movie.getTitle());
    }

    @Test
    public void testSetDuration() {
        Movie movie = new Movie("Jaws", 2.25);
        movie.setDuration(3.0);
        assertEquals(3.0, movie.getDuration(), 0.0);
    }
    @Test
    public void testToString() {
        Movie movie = new Movie("Jaws", 2.25);
        assertEquals("\"Jaws\", duration of 2.25", movie.toString());
    }

	@Test
	public void testEquals() {
		Movie movie = new Movie("Jaws", 2.25);
        Movie movie2 = new Movie("Jaws", 2.25);
        assertTrue(movie.equals(movie2));
	}

    @Test
    public void testAdjustRating() {
        Movie movie = new Movie("Jaws", 2.25);
        movie.adjustRating(10);
        assertEquals(10, movie.getRating());
    }

    @Test
    public void testAdjustRatingCondition() {
        Movie movie = new Movie("Jaws", 2.25);
        movie.adjustRating(5);
        movie.adjustRating(10);
        assertEquals(5, movie.getRating());
    }
}
