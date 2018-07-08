package pl.coderslab.dao;

import pl.coderslab.model.Order;
import pl.coderslab.services.DBService;

import java.util.ArrayList;
import java.util.List;

public class OrderDao {

    private String databaseName = "Car_Repair_Shop"; //NAZWA BAZY DANYCH

    public void save (Order car) {

        if(car.getId()==0){
            //add new employee to DB
            this.addCar(car);
        }else{
            this.updateCar(car);
            //update employee in DB
        }
    }

    private  void addCar(Order order) {
        String query = "INSERT INTO orders VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"; //NAZWA TABELI
        List<String> queryParams = new ArrayList<>();
        queryParams.add(String.valueOf(order.getId()));
        queryParams.add( order.getAcceptance_date());
        queryParams.add( order.getRepair_date());
        queryParams.add( String.valueOf(order.getEmployee_id()));
        queryParams.add( order.getProblem_description());
        queryParams.add( order.getRepair_description());
        queryParams.add( order.getStatus());
        queryParams.add( String.valueOf(order.getCar_id()));
        queryParams.add( String.valueOf(order.getClient_cost()));
        queryParams.add( String.valueOf(order.getParts_cost()));
        queryParams.add( String.valueOf(order.getManhour_cost()));
        queryParams.add( String.valueOf(order.getManhour()));

        DBService.executeUpdate(this.databaseName, query, queryParams);
    }

    private void updateCar (Order order) {
        String query = "UPDATE orders SET acceptance_date = ?, repair_date = ?, employee_id = ?, problem_description = ?, repair_description = ?, status = ?, car_id = ?, client_cost = ?, parts_cost = ?, manhour_cost = ?, manhour = ?  WHERE id = ?"; //NAZWA TABELI

        List<String> queryParams = new ArrayList<>();
        queryParams.add(String.valueOf(order.getId()));
        queryParams.add( order.getAcceptance_date());
        queryParams.add( order.getRepair_date());
        queryParams.add( String.valueOf(order.getEmployee_id()));
        queryParams.add( order.getProblem_description());
        queryParams.add( order.getRepair_description());
        queryParams.add( order.getStatus());
        queryParams.add( String.valueOf(order.getCar_id()));
        queryParams.add( String.valueOf(order.getClient_cost()));
        queryParams.add( String.valueOf(order.getParts_cost()));
        queryParams.add( String.valueOf(order.getManhour_cost()));
        queryParams.add( String.valueOf(order.getManhour()));

        DBService.executeUpdate(this.databaseName, query, queryParams);

    }

}
