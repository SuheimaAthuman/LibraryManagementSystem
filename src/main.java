public class main {
    public static void main(String[] args) {
        // Create a library
        library myLibrary = new library("City Library", "123 Main St");
        
        // Create a librarian
        librarian lib = new librarian("Alice", "L001");
        
        // Display librarian info
        lib.displayInfo();
        
        // Display library info
        System.out.println("Library Name: " + myLibrary.getLibraryName() + ", Address: " + myLibrary.getAddress());
    }
    
}
