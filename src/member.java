public class member extends person {
    //encapsulation
    private int borrowedBooksCount;
    //constructor
    public member(String name, String personID) {
        super(name, personID);
        this.borrowedBooksCount = 0;
    }
    //getter
    public int getBorrowedBooksCount() {
        return borrowedBooksCount;
    }
    //setter
    public void setBorrowedBooksCount(int count) {
        this.borrowedBooksCount = count;
    }
    //override abstract method from person class
    @Override
    public void displayInfo() {
        System.out.println("Member Name: " + getName() +", ID: " +getPersonID() + ", Borrowed Books:" + borrowedBooksCount)
    }
    //borrow a book (increment count)
    public void borrowBook() {
        borrowedBooksCount++;
        System.out.println(getName() + " borrowed a book ");
    }
    //return a book (decrement count)
    public void returnBook() {
        if (borrowedBooksCount > 0) {
            borrowedBooksCount--;
            System.out.println(getName() + " returned a book ");
        }
        else {
            System.out.println(getName() + " has no books to return ");
        }
    }
    
}
