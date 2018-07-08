package pl.coderslab.dao;

import pl.coderslab.model.Employee;
import pl.coderslab.services.DBService;

import java.awt.print.Book;
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




    private  void addEmployee(Employee employee) {
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

    private void updateEmployee (Employee employee) {
        String query = "UPDATE employees set first_name = ?, second_name = ?, address = ?, telephone = ?, note = ?, manhour_cost = ? Where id = ?"; //NAZWA TABELI

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
