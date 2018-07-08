package pl.coderslab.controller;

import pl.coderslab.dao.CarDao;
import pl.coderslab.dao.EmployeeDao;
import pl.coderslab.model.Car;
import pl.coderslab.model.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindCarByID", urlPatterns = "/findCarByID")
public class FindCarByID extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            CarDao carDao = new CarDao();
            Car car = carDao.findCarById(id);
            request.setAttribute("car", car);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/findCarById.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/findCarById.jsp").forward(request, response);


    }
}
