package pl.coderslab.dao;

import pl.coderslab.model.Employee;
import pl.coderslab.services.DBService;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private String databaseName = "Car_Repair_Shop"; //NAZWA BAZY DANYCH

    public void save (Employee employee) {

        if(employee.getId()==0){
            //add new employee to DB
            this.addEmployee(employee);
        }else{
            this.updateEmployee(employee);
            //update employee in DB
        }
    }




    public void addEmployee(Employee employee) {
        String query = "INSERT INTO employees VALUES (?, ?, ?, ?, ?, ?, ?)"; //NAZWA TABELI
        List<String> queryParams = new ArrayList<>();
        queryParams.add(String.valueOf(employee.getId()));
        queryParams.add( employee.getFirst_name());
        queryParams.add( employee.getSecond_name());
        queryParams.add( employee.getAddress());
        queryParams.add( employee.getTelephone());
        queryParams.add( employee.getNote());
        queryParams.add( employee.getManhour_cost());

        DBService.executeUpdate(this.databaseName, query, queryParams);
    }

    public void updateEmployee (Employee employee) {
        String query = "UPDATE employees SET first_name = ?, second_name = ?, address = ?, telephone = ?, note = ?, manhour_cost = ? WHERE id = ?"; //NAZWA TABELI

        List<String> queryParams = new ArrayList<>();
        queryParams.add( employee.getFirst_name() );
        queryParams.add( employee.getSecond_name() );
        queryParams.add( employee.getAddress() );
        queryParams.add( employee.getTelephone() );
        queryParams.add( employee.getNote() );
        queryParams.add( employee.getManhour_cost() );
        queryParams.add( String.valueOf(employee.getId()) );

        DBService.executeUpdate(this.databaseName, query, queryParams);
    }

    public Employee findEmployeeById(int id) {
        String query = "SELECT * FROM employees WHERE id = " + id;
        Employee employee = new Employee();
        try (ResultSet rs = DBService.executeQuery(DBService.connect(this.databaseName), query)) {
            while (rs.next()) {
                employee.setId(rs.getInt("id"));
                employee.setFirst_name(rs.getString("first_name"));
                employee.setSecond_name(rs.getString("second_name"));
                employee.setAddress(rs.getString("address"));
                employee.setTelephone(rs.getString("telephone"));
                employee.setNote(rs.getString("note"));
                employee.setManhour_cost(rs.getString("manhour_cost"));
            }
            return employee;
        }
        catch (SQLException e) {
            System.out.println(e);
        }
        return employee;
    }


    public List<Employee> loadAll(){
        List<Employee> allEmployees = new ArrayList<>();

        String query = "SELECT * FROM employees";

        try(ResultSet rs = DBService.executeQuery(DBService.connect(this.databaseName), query)){
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setFirst_name(rs.getString("first_name"));
                employee.setSecond_name(rs.getString("second_name"));
                employee.setAddress(rs.getString("address"));
                employee.setTelephone(rs.getString("telephone"));
                employee.setManhour_cost(rs.getString("manhour_cost"));
                allEmployees.add(employee);

            }
        }catch (SQLException e){
            System.out.println(e);
        }
        return allEmployees;
    }



    public void delete(int id){
        String query = "DELETE FROM employees WHERE id=" + id;
        try {
            DBService.executeUpdate(this.databaseName, query);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }


    public void editEmployee (Employee employee) {

        String query = "UPDATE employees SET first_name = ?, second_name = ?, address = ? , telephone = ?, note = ?, manhour_cost = ? WHERE id = ?";

        List<String> queryParams = new ArrayList<>();

        queryParams.add( employee.getFirst_name() );
        queryParams.add( employee.getSecond_name() );
        queryParams.add( employee.getAddress() );
        queryParams.add( employee.getTelephone() );
        queryParams.add( employee.getNote() );
        queryParams.add( employee.getManhour_cost() );
        queryParams.add( String.valueOf(employee.getId()) );

        DBService.executeUpdate(this.databaseName, query, queryParams);
    }


}
