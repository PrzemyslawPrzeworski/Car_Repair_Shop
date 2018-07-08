package pl.coderslab.model;

import java.util.Date;

public class Client {
    private String name;
    private String surname;
    private int id;

    public Client() {
    }

    public Client(int id, String name, String surname) {
        setId(id);
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
