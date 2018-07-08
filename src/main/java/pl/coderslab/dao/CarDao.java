package pl.coderslab.dao;

import pl.coderslab.model.Car;
import pl.coderslab.model.Car;
import pl.coderslab.model.Employee;
import pl.coderslab.services.DBService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CarDao {

    private String databaseName = "Car_Repair_Shop"; //NAZWA BAZY DANYCH

    public void save (Car car) {

        if(car.getId()==0){
            //add new car to DB
            this.addCar(car);
        }else{
            this.updateCar(car);
            //update car in DB
        }
    }

    public void addCar(Car car) {
        String query = "INSERT INTO cars VALUES (?, ?, ?, ?, ?, ?, ?)"; //NAZWA TABELI
        List<String> queryParams = new ArrayList<>();
        queryParams.add(String.valueOf(car.getId()));
        queryParams.add( car.getModel());
        queryParams.add( car.getBrand());
        queryParams.add( String.valueOf(car.getProduction_year()));
        queryParams.add( car.getNumber_plate());
        queryParams.add( car.getNext_vehicle_inspection());
        queryParams.add( String.valueOf(car.getClient_id()));

        DBService.executeUpdate(this.databaseName, query, queryParams);
    }

    public void updateCar (Car car) {
        String query = "UPDATE cars SET model = ?, brand = ?, production_year = ?, number_plate = ?, next_vehicle_inspection = ?, client_id = ? WHERE id = ?"; //NAZWA TABELI

        List<String> queryParams = new ArrayList<>();
        queryParams.add( car.getModel() );
        queryParams.add( car.getBrand() );
        queryParams.add( String.valueOf(car.getProduction_year()) );
        queryParams.add( car.getNumber_plate() );
        queryParams.add( car.getNext_vehicle_inspection() );
        queryParams.add( String.valueOf(car.getClient_id() ));
        queryParams.add( String.valueOf(car.getId()) );

        DBService.executeUpdate(this.databaseName, query, queryParams);

    }


    public Car findCarById(int id) {
        String query = "SELECT * FROM cars WHERE id = " + id;
        Car car = new Car();
        try (ResultSet rs = DBService.executeQuery(DBService.connect(this.databaseName), query)) {
            while (rs.next()) {
                car.setId(rs.getInt("id"));
                car.setModel(rs.getString("model"));
                car.setBrand(rs.getString("brand"));
                car.setProduction_year(rs.getInt("production_year"));
                car.setNumber_plate(rs.getString("number_plate"));
                car.setNext_vehicle_inspection(rs.getString("next_vehicle_inspection"));
                car.setClient_id(rs.getInt("client_id"));
            }
            return car;
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        return car;
    }


    public List<Car> loadAll(){
        List<Car> allCars = new ArrayList<>();

        String query = "SELECT * FROM cars";

        try(ResultSet rs = DBService.executeQuery(DBService.connect(this.databaseName), query)){
            while (rs.next()) {
                Car car = new Car();
                car.setId(rs.getInt("id"));
                car.setModel(rs.getString("model"));
                car.setBrand(rs.getString("brand"));
                car.setProduction_year(rs.getInt("production_year"));
                car.setNumber_plate(rs.getString("number_plate"));
                car.setNext_vehicle_inspection(rs.getString("next_vehicle_inspection"));
                car.setClient_id(rs.getInt("client_id"));
                allCars.add(car);

            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return allCars;
    }



    public void delete(int id){
        String query = "DELETE FROM cars WHERE id=" + id;
        try {
            DBService.executeUpdate(this.databaseName, query);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }




}
