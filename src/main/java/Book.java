public class Book {
    int    id;
    String title;
    String author;

    Book(int id, String title, String author) {
        this.id     = id;
        this.title  = title;
        this.author = author;
    }

    public String toString() {
        return "[ID: " + id + "] '" + title + "' by " + author;
    }
}
