import org.junit.Test;

import static org.junit.Assert.*;

public class QuoteTest {

    @Test
    public void testConstructor() {
        String author = "Michelle";
        String text = "wow";
        Quote createdQuote = new Quote(author, text);
        assertEquals("author should be saved correctly",
                author,
                createdQuote.author);
        assertEquals("text should be saved correctly",
                text,
                createdQuote.text);
    }

    @Test
    public void testToString() {
        String author = "Michelle";
        String text = "wow";
        Quote createdQuote = new Quote(author, text);
        assertEquals("toString should return formatted, correct information",
                "wow\n-Michelle",
                createdQuote.toString());
    }
}