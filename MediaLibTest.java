import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MediaLibTest {

    @Test
    public void testToString() {
        Book book = new Book("TKM", "Lee");
        MediaLib mediaLib = new MediaLib();
        mediaLib.addBook(book);
        Movie movie = new Movie("Jaws", 2.25);
        mediaLib.addMovie(movie);

        assertEquals("\"TKM\", written by Lee\n\"Jaws\", duration of 2.25", mediaLib.toString());
    }
}
