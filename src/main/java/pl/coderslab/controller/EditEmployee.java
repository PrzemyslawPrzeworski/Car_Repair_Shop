package pl.coderslab.controller;

import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "EditEmployee", urlPatterns = "/editEmployee")
public class EditEmployee extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try{
            int id = Integer.parseInt(request.getParameter("id"));
            String first_name = request.getParameter("first_name");
            String second_name = request.getParameter("second_name");
            String address = request.getParameter("address");
            String telephone = request.getParameter("telephone");
            String note = request.getParameter("note");
            String manhour_cost = request.getParameter("manhour_cost");

            EmployeeDao employeeDao = new EmployeeDao();
            Employee employee = new Employee( id, first_name, second_name , address, telephone , note, manhour_cost );

            employeeDao.updateEmployee(employee);

        }
        catch (Exception e) {
            System.out.println(e);
            getServletContext().getRequestDispatcher("/WEB-INF/editEmployee.jsp").forward(request,response);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/editEmployee.jsp").forward(request,response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            EmployeeDao employeeDao = new EmployeeDao();
            Employee employee = employeeDao.findEmployeeById(id);
            request.setAttribute("employee", employee);
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println(e);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/editEmployee.jsp").forward(request,response);

    }
}
