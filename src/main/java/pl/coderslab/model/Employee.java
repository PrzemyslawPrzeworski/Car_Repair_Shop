package pl.coderslab.model;

public class Employee {

    private int id;
    private String firstName;
    private String secondName;
    private String address;
    private String telephone;
    private String note;
    private String manHourCost;

    //FOR NEW EMPLOYEES
    public Employee() {}

    //FOR EMPLOYEES FROM DB
    public Employee(int id, String firstName, String secondName, String address, String telephone, String note, String manHourCost) {
        setId(id);
        setFirstName(firstName);
        setSecondName(secondName);
        setAddress(address);
        setTelephone(telephone);
        setNote(note);
        setManHourCost(manHourCost);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getManHourCost() {
        return manHourCost;
    }

    public void setManHourCost(String manHourCost) {
        this.manHourCost = manHourCost;
    }
}
