public class BookTest {
    public static void main(String[] args) {
        EBook eBook = new EBook(
                "The Shining", "Stephen King", "978-0-385-12167-5", "EPUB", 537
        );
        System.out.println(eBook);
        eBook.read();
    }
}