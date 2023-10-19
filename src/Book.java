// Classes and Objects: Design a simple Book class with attributes like title, author, ISBN, etc. Create multiple Book objects and display their details.
// Encapsulation: Extend the Book class to have private attributes and provide public getters and setters.
// Inheritance: Create a subclass EBook that extends Book and adds attributes specific to electronic books.
// Polymorphism: Create a method in the Book class that prints details of the book. Override this method in EBook to display additional details.
// Abstraction: Create an abstract class Shape with abstract methods like area() and perimeter(). Implement subclasses Circle, Rectangle, etc.
// Association: Design a Library class that has a list of Book objects, illustrating an association relationship.

public class Book {
    private String title, author, ISBN;

    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
    }

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return this.title + " - " + this.author + " - " + this.ISBN;
    }
}