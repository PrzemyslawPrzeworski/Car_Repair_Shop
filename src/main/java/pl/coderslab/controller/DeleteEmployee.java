package pl.coderslab.controller;

import pl.coderslab.dao.EmployeeDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteEmployee", urlPatterns = "/deleteEmployee")
public class DeleteEmployee extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));

            EmployeeDao employeeDao = new EmployeeDao();
            employeeDao.delete(id);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/deleteEmployee.jsp").forward(request,response);

    }
}
