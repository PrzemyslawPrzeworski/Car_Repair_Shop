package pl.coderslab.model;

import java.util.Date;

public class Car {
    private int id;
    private String model;
    private String brand;
    private int production_year;
    private String number_plate;
    private String next_vehicle_inspection;
    private int client_id;

    public Car() {}

    public Car(int id, String model, String brand, int productionYear, String numberPlate, String nextVehicleInspection, int client_id) {
        setId(id);
        setModel(model);
        setBrand(brand);
        setProduction_year(productionYear);
        setNumber_plate(numberPlate);
        setNext_vehicle_inspection(nextVehicleInspection);
        setClient_id(client_id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProduction_year() {
        return production_year;
    }

    public void setProduction_year(int productionYear) {
        this.production_year = productionYear;
    }

    public String getNumber_plate() {
        return number_plate;
    }

    public void setNumber_plate(String numberPlate) {
        this.number_plate = numberPlate;
    }

    public String getNext_vehicle_inspection() {
        return next_vehicle_inspection;
    }

    public void setNext_vehicle_inspection(String nextVehicleInspection) {
        this.next_vehicle_inspection = nextVehicleInspection;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }
}
