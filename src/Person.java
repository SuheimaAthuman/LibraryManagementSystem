abstract class Person {
    //Encapsulation
    private String name;
    private String personID;
    //Constructor
    public Person(String name, String personID) {
        this.name = name;
        this.personID =personID;
    }
    //Getters
    public String getName() {
        return name;
    }
    public String getPersonID() {
        return personID;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setPersonID(String personID){
        this.personID = personID;
    }
    //Abstract method
    public abstract void dislayInfo();

}
    

