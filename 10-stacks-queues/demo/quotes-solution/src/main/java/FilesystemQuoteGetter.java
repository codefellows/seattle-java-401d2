import java.io.File;
import java.io.IOException;

public class FilesystemQuoteGetter implements QuoteGetter {

    protected Quote[] quotes;
    private String quotesPath;

    public FilesystemQuoteGetter(String path) {
        this.quotesPath = path;
    }
    @Override
    public Quote getQuote() {
        if (this.quotes == null) {
            this.readQuotes();
        }
        return this.getRandomQuote();
    }

    private Quote getRandomQuote() {
        return this.quotes[(int)(Math.random() * this.quotes.length)];
    }

    private void readQuotes() {
        try {
            this.quotes = FilesystemQuotes.getQuotes(this.quotesPath);
        } catch (IOException e) {
            this.quotes = new Quote[]{new Quote("Michelle Ferreirae", "Sometimes, the filesystem does not like you.")};
        }
    }
}
