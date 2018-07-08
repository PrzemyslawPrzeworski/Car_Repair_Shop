package pl.coderslab.model;

public class Employee {

    private int id;
    private String first_name;
    private String second_name;
    private String address;
    private String telephone;
    private String note;
    private String manhour_cost;

    //FOR NEW EMPLOYEES
    public Employee() {}

    //FOR EMPLOYEES FROM DB
    public Employee(int id, String firstName, String secondName, String address, String telephone, String note, String manHourCost) {
        setId(id);
        setFirst_name(firstName);
        setSecond_name(secondName);
        setAddress(address);
        setTelephone(telephone);
        setNote(note);
        setManhour_cost(manHourCost);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String firstName) {
        this.first_name = firstName;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String secondName) {
        this.second_name = secondName;
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

    public String getManhour_cost() {
        return manhour_cost;
    }

    public void setManhour_cost(String manHourCost) {
        this.manhour_cost = manHourCost;
    }
}
