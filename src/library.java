public class library {
    //encapsulation
    private String libraryName;
    private String address;
    //constructor
    public library(String libraryName, String address) {
        this.libraryName = libraryName;
        this.address = address;
    }
    //getter methods
    public String getLibraryName() {
        return libraryName;
    }
    public String getAddress() {
        return address;
    }
    
}
