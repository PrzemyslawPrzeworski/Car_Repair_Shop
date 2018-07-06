package pl.coderslab.controller;

import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MvcJdbc01", urlPatterns = "/add-employee")
public class MvcJdbc01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String firstName = request.getParameter("firstName");
            String secondName = request.getParameter("secondName");
            String address = request.getParameter("address");
            String telephone = request.getParameter("telephone");
            String note = request.getParameter("note");
            String manHourCost = request.getParameter("manHourCost");

            Employee employee = new Employee();
            employee.setId(id);
            employee.setFirstName(firstName);
            employee.setSecondName(secondName);
            employee.setAddress(address);
            employee.setTelephone(telephone);
            employee.setNote(note);
            employee.setManHourCost(manHourCost);

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
        getServletContext().getRequestDispatcher("/WEB-INF/add-employee.jsp").forward(request, response);

    }
}
