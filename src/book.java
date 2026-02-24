public class book implements borrowable {
    //encapsulation
    private String bookID;
    private String title;
    private String author;
    private boolean isAvailable;
    //static variable
    private static int totalBooks = 0;
    //constructor
    public book(String bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        totalBooks++;
    }

    //getter methods
    public String getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }
    public static int getTotalBooks() {
        return totalBooks;
    }

    //borrow a book
    @Override
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed: " + title);
        } else {
            System.out.println("Book is not available: " + title);
        }
    }

    //return a book
    @Override
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned: " + title);
        } else {
            System.out.println("Book was not borrowed: " + title);
        }
    }
}