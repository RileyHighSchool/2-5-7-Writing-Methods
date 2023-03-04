import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BookTest {
    @Test
    public void testGetAuthor() {
        Book book = new Book("TKM", "Lee");
        assertEquals("Lee", book.getAuthor());
    }

    @Test
    public void testGetRating() {
        Book book = new Book("TKM", "Lee");
        assertEquals(0, book.getRating());
    }

    @Test
    public void testGetTitle() {
        Book book = new Book("TKM", "Lee");
        assertEquals("TKM", book.getTitle());
    }

    @Test
    public void testSetAuthor() {
        Book book = new Book("TKM", "Lee");
        book.setAuthor("Test");
        assertEquals("Test", book.getAuthor());
    }

    @Test
    public void testSetTitle() {
        Book book = new Book("TKM", "Lee");
        book.setTitle("Test");
        assertEquals("Test", book.getTitle());
    }

    @Test
    public void testToString() {
        Book book = new Book("TKM", "Lee");
        assertEquals("\"TKM\", written by Lee", book.toString());
    }

	@Test
	public void testEquals() {
		Book book = new Book("TKM", "Lee");
        Book book2 = new Book("TKM", "Lee");
        assertTrue(book.equals(book2));
	}

    @Test
    public void testAdjustRating() {
        Book book = new Book("TKM", "Lee");
        book.adjustRating(10);
        assertEquals(10, book.getRating());
    }

    @Test
    public void testAdjustRatingCondition() {
        Book book = new Book("TKM", "Lee");
        book.adjustRating(5);
        book.adjustRating(10);
        assertEquals(5, book.getRating());
    }
}
