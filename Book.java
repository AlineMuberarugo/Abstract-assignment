public class Book {

    private String title;
    private String author;
    private String bookId;

    // Constructor
    
    public Book(String title, String author, String bookId) {
        this.title = title;
        this.author = author;
        this.bookId = bookId;
    }

    // Getters and setters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookId() {
        return bookId;
    }

   
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    // toString
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", Book ID: " + bookId;
    }
}