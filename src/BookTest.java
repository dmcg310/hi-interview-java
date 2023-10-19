public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("The Shining", "Stephen King", "978-0-385-12167-5");
        System.out.println(book);

        EBook eBook = new EBook("The Shining", "Stephen King", "978-0-385-12167-5", "EPUB");
        System.out.println(eBook);
    }
}
