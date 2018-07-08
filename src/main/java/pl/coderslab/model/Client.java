package pl.coderslab.model;

import java.util.Date;

public class Client {
    private String first_name;
    private String second_name;
    private int id;

    public Client() {
    }

    public Client(int id, String name, String surname) {
        setId(id);
        setFirst_name(name);
        setSecond_name(surname);
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String name) {
        this.first_name = name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String surname) {
        this.second_name = surname;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}