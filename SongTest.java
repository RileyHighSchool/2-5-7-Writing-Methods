import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SongTest {

    @Test
    public void testConstructorWithTitleAndRating() {
        Song song = new Song("Title", 5);
        assertEquals("Title", song.getTitle());
        assertEquals(5, song.getRating());
    }

    @Test
    public void testConstructorWithTitleOnly() {
        Song song = new Song("Title");
        assertEquals("Title", song.getTitle());
        assertEquals(0, song.getRating()); // Assuming default rating is 0
    }

    @Test
    public void testSetTitle() {
        Song song = new Song("Title");
        song.setTitle("New Title");
        assertEquals("New Title", song.getTitle());
    }

    @Test
    public void testAdjustRating() {
        Song song = new Song("TKM");
        song.adjustRating(10);
        assertEquals(10, song.getRating());
    }

    @Test
    public void testAdjustRatingCondition() {
        Song song = new Song("TKM");
        song.adjustRating(5);
        song.adjustRating(10);
        assertEquals(5, song.getRating());
    }

    @Test
    public void testToString() {
        Song song = new Song("Title", 5);
        assertEquals("Song [title=Title, rating=5]", song.toString());
    }

    @Test
    public void testEquals() {
        Song song1 = new Song("Title", 5);
        Song song2 = new Song("Title", 5);
        Song song3 = new Song("Another Title", 3);

        assertTrue(song1.equals(song2));
        assertFalse(song1.equals(song3));
    }
}
