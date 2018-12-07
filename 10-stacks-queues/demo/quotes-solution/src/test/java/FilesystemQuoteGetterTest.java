import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class FilesystemQuoteGetterTest {

    @Test
    public void testGetRandomQuote() {
        FilesystemQuoteGetter getter = new FilesystemQuoteGetter("not/a/real/path");
        getter.quotes = new Quote[]{
                new Quote("Michelle", "quote one"),
                new Quote("Michelle", "quote two")
        };
        Set<Quote> quoteSet = new HashSet<>();
        for (int i = 0; i < 30; i++) {
            quoteSet.add(getter.getQuote());
        }
        assertEquals(2, quoteSet.size());
    }
}