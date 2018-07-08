package pl.coderslab.controller;

import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindEmployeeByID", urlPatterns = "/findEmployeeById")
public class FindEmployeeByID extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            EmployeeDao employeeDao = new EmployeeDao();
            Employee employee = employeeDao.findEmployeeById(id);
            request.setAttribute("employee", employee);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/findEmployeeById.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/findEmployeeById.jsp").forward(request, response);

    }
}
