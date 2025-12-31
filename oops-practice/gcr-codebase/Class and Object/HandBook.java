public class HandBook {
    String bookTitle;
    String bookAuthor;
    String price;

    HandBook(String bookTitle, String bookAuthor, String price) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;

    }

    public void displayBookDetails() {
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Author: " + bookAuthor);
        System.out.println("Book Price: " + price);
    }
    public static void main(String[] args) {
        HandBook book1 = new HandBook("Geetanjali","Rabindrnath Tagore","10.98 $");
        HandBook book2 = new HandBook("Science", "h r ramam", "45.45");
        book1.displayBookDetails();
        book2.displayBookDetails();
    }}

    

