public class Book {
    public String ISBN;
    protected String title;
    private  String author;

    public Book(String ISBN, String title) {
        this.ISBN = ISBN;
        this.title = title;
    }

    public void getauthor(String author) {
        this.author = author;
    }

    public String setauthor(String author) {
        return author;
    }

    class EBook extends Book {
        public EBook(String ISBN, String title) {
            super(ISBN, title);
        }

        public void display() {
            System.out.println(ISBN + title);
        }
    }
}