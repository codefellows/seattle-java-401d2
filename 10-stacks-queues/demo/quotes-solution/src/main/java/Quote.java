public class Quote {
    public String author;
    public String text;

    public Quote(String author, String text) {
        this.author = author;
        this.text = text;
    }

    public String toString() {
        return this.text + "\n-" + this.author;
    }
}
