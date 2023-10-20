public class EBook extends Book {
    private String format;
    private int fileSize; // KB

    public EBook(String title, String author, String ISBN, String format, int fileSize) {
        super(title, author, ISBN);
        this.format = format;
        this.fileSize = fileSize;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public int getFileSize() {
        return fileSize;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + this.format + " - " + this.fileSize + "KB";
    }

    @Override
    public void read() {
        System.out.println("Opening the EBook in a digital reader...");
    }
}
