package pl.coderslab.dao;

import pl.coderslab.model.Car;
import pl.coderslab.services.DBService;

import java.util.ArrayList;
import java.util.List;

public class CarDao {

    private String databaseName = "Car_Repair_Shop"; //NAZWA BAZY DANYCH

    public void save (Car car) {

        if(car.getId()==0){
            //add new employee to DB
            this.addCar(car);
        }else{
            this.updateCar(car);
            //update employee in DB
        }
    }

    private  void addCar(Car car) {
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

    private void updateCar (Car car) {
        String query = "UPDATE cars SET first_name = ?, second_name = ?, address = ?, telephone = ?, note = ?, manhour_cost = ? WHERE id = ?"; //NAZWA TABELI

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


}
