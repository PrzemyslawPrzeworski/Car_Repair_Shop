package pl.coderslab.controller;

import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddEmployee", urlPatterns = "/add-employee")
public class AddEmployee extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String first_name = request.getParameter("first_name");
            String second_name = request.getParameter("second_name");
            String address = request.getParameter("address");
            String telephone = request.getParameter("telephone");
            String note = request.getParameter("note");
            String manhour_cost = request.getParameter("manhour_cost");

            Employee employee = new Employee();
            employee.setId(id);
            employee.setFirst_name(first_name);
            employee.setSecond_name(second_name);
            employee.setAddress(address);
            employee.setTelephone(telephone);
            employee.setNote(note);
            employee.setManhour_cost(manhour_cost);

            EmployeeDao employeeDao = new EmployeeDao();
            employeeDao.save(employee);

            response.getWriter().append("saved at id : " + employee.getId());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

            doGet(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //create new employee to add
        Employee employee = new Employee();
        request.setAttribute("employee", employee);
        getServletContext().getRequestDispatcher("/WEB-INF/addEmployee.jsp").forward(request, response);

    }
}
