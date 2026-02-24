public class librarian extends person {
    //encapsulation
    private String employeeID;
    //constructor
    public librarian(String name, String employeeID) {
        super(name, employeeID);
        this.employeeID = employeeID;
    }
    //getter
    public String getName() {
        return super.getName();
    }
    public String getEmployeeID() {
        return employeeID;
    }
    //setter
    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
    //override abstract method from person class
    @Override
    public void displayInfo () {
        System.out.println("Librarian Name: " +getName()  + ", Employee ID: " + employeeID);
    }
    
}
