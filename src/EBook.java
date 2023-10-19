public class EBook extends Book{
    private String format;

    public EBook() {
        super();
        this.format = "";
    }

    public EBook(String title, String author, String ISBN, String format) {
        super(title, author, ISBN);
        this.format = format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.format;
    }
}
