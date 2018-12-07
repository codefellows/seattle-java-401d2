import java.io.File;
import java.io.IOException;

public class FilesystemQuoteGetter implements QuoteGetter {

    protected Quote[] quotes;
    private String quotesPath;

    public FilesystemQuoteGetter(String path) {
        this.quotesPath = path;
    }
    @Override
    public Quote getQuote() throws IOException {
        if (this.quotes == null) {
            this.readQuotes();
        }
        return this.getRandomQuote();
    }

    private Quote getRandomQuote() {
        return this.quotes[(int)(Math.random() * this.quotes.length)];
    }

    private void readQuotes() throws IOException {
        this.quotes = FilesystemQuotes.getQuotes(this.quotesPath);
    }
}
