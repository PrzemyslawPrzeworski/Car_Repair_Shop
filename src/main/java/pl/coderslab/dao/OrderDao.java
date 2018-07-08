package pl.coderslab.dao;

import pl.coderslab.model.Order;
import pl.coderslab.services.DBService;

import java.sql.ResultSet;
import java.sql.SQLException;
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


    public Order findOrderById(int id) {
        String query = "SELECT * FROM orders WHERE id = " + id;
        Order order = new Order();
        try (ResultSet rs = DBService.executeQuery(DBService.connect(this.databaseName), query)) {
            while (rs.next()) {
                order.setId(rs.getInt("id"));
                order.setAcceptance_date(rs.getString("acceptance_date"));
                order.setRepair_date(rs.getString("repair_date"));
                order.setEmployee_id(rs.getInt("employee_id"));
                order.setProblem_description(rs.getString("problem_description"));
                order.setRepair_description(rs.getString("repair_description"));
                order.setStatus(rs.getString("status"));
                order.setCar_id(rs.getInt("car_id"));
                order.setClient_cost(rs.getDouble("client_cost"));
                order.setParts_cost(rs.getDouble("parts_cost"));
                order.setManhour_cost(rs.getDouble("manhour_cost"));
                order.setManhour(rs.getInt("manhour"));
            }
            return order;
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        return order;
    }



    public List<Order> loadAll(){
        List<Order> allOrders = new ArrayList<>();

        String query = "SELECT * FROM orders";

        try(ResultSet rs = DBService.executeQuery(DBService.connect(this.databaseName), query)){
            while (rs.next()) {
                Order order = new Order();
                order.setId(rs.getInt("id"));
                order.setAcceptance_date(rs.getString("acceptance_date"));
                order.setRepair_date(rs.getString("repair_date"));
                order.setEmployee_id(rs.getInt("employee_id"));
                order.setProblem_description(rs.getString("problem_description"));
                order.setRepair_description(rs.getString("repair_description"));
                order.setStatus(rs.getString("status"));
                order.setCar_id(rs.getInt("car_id"));
                order.setClient_cost(rs.getDouble("client_cost"));
                order.setParts_cost(rs.getDouble("parts_cost"));
                order.setManhour_cost(rs.getDouble("manhour_cost"));
                order.setManhour(rs.getInt("manhour"));
                allOrders.add(order);

            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return allOrders;
    }



    public void delete(int id){
        String query = "DELETE FROM orders WHERE id=" + id;
        try {
            DBService.executeUpdate(this.databaseName, query);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }




}
