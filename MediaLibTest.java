import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MediaLibTest {

    private MediaLib mediaLib;

    @Before
    public void setUp() {
        mediaLib = new MediaLib();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("Title", "Author");
        mediaLib.addBook(book);
        assertEquals(1, MediaLib.getNumEntries());
        assertEquals(1, MediaLib.getNumBooks());
    }

    @Test
    public void testAddMovie() {
        Movie movie = new Movie("Title", 1.5);
        mediaLib.addMovie(movie);
        assertEquals(3, MediaLib.getNumEntries());
        assertEquals(1, MediaLib.getNumMovies());
    }

    @Test
    public void testAddSong() {
        Song song = new Song("Title", 5);
        mediaLib.addSong(song);
        assertEquals(2, MediaLib.getNumEntries());
        assertEquals(1, MediaLib.getNumSongs());
    }

    @Test
    public void testGetOwner() {
        assertEquals("You", MediaLib.getOwner());
    }

    @Test
    public void testSetOwner() {
        MediaLib.setOwner("newOwner");
        assertEquals("newOwner", MediaLib.getOwner());
    }

    // You can add more test cases for other methods if needed
}
