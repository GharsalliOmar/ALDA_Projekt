public class Book {
    private int    id;
    private String title;
    private String author;

    Book(int id, String title, String author) {
        this.id     = id;
        this.title  = title;
        this.author = author;
    }

    int    getId()     { return id; }
    String getTitle()  { return title; }
    String getAuthor() { return author; }

    @Override
    public String toString() {          //überschreibt Objekt-Klass
        return "[ID: " + id + "] '" + title + "' by " + author;     //Wird automatisch aufgerufen wenn man System.out.println(book)
    }
}
